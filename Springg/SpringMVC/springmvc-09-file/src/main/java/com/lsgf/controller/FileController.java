package com.lsgf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@RestController
public class FileController {
    @RequestMapping("/upload")
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        String uploadFileName = file.getOriginalFilename();

        if ("".equals(uploadFileName)) {
            return "redirect:/index.jsp";
        }
        System.out.println("上传文件名：" + uploadFileName);

        String path = request.getServletContext().getRealPath("/upload");

        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        System.out.println("上传文件保存地址：" + realPath);
        InputStream is = file.getInputStream();
        OutputStream os = new FileOutputStream(new File(realPath, uploadFileName));


        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
            os.flush();
        }
        os.close();
        is.close();
        return "redirect:/index.jsp";
    }

    /*
     * 采用file.Transto 来保存上传的文件
     */
    @RequestMapping("/upload2")
    public String fileUpload2(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        //上传路径保存设置
        String path = request.getServletContext().getRealPath("/statics");
        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        //上传文件地址
        System.out.println("上传文件保存地址：" + realPath);

        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(new File(realPath + "/" + file.getOriginalFilename()));

        return "redirect:/index.jsp";
    }


    @RequestMapping("/download")
    public String downloads(HttpServletResponse response, HttpServletRequest request) throws Exception {
        System.out.println("download()");
        String path = request.getServletContext().getRealPath("/statics");
        String fileName = "1.png";

//        1.设置response响应头
        response.reset();//设置页面不缓存，清空buffer
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");//二进制传输数据
        //设置响应头
        response.setHeader("Content-Disposition","attachment;fileName="+ URLEncoder.encode(fileName,"UTF-8"));

        File file = new File(path,fileName);
        //2.读取文件--输入流
        InputStream input = new FileInputStream(file);
        //3.写出文件--输出流
        ServletOutputStream out = response.getOutputStream();

        byte[] buff = new byte[1024];
        int index = 0;
//        4.执行 写出操作
        while ((index=input.read(buff))!=-1){
            out.write(buff,0,index);
            out.flush();
        }
        out.close();
        input.close();

        return "OK";
    }
}
