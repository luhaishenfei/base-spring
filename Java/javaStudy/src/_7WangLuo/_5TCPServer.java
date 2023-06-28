package _7WangLuo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class _5TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10085);
        Socket s = serverSocket.accept();

        //获取输入流
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\_7WangLuo\\_5ServerRecive.txt"));


        String line;
        //等待读取数据
        while((line = br.readLine())!=null){
//            if ("886".equals(line)){
//                break;
//            }

            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }


        //给客户端反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
bwServer.newLine();
bwServer.flush();

        bwServer.close();


        bw.close();

        //
        serverSocket.close();

    }
}
