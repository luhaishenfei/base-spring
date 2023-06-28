package _7WangLuo;

import java.io.*;
import java.net.Socket;

public class _7ServerThread implements Runnable {
    private  Socket s;
    //废弃
    private static int i = 0;
    public _7ServerThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //把数据写入文本文件
            //BufferedWriter bw = new BufferedWriter(new FileWriter("src\\_7WangLuo\\_5ServerRecive"+i+++".txt",true));
            int count = 0;
            File file = new File("src\\_7WangLuo\\_5ServerRecive"+count+".txt");
            while (file.exists()){
                count++;
                file = new File("src\\_7WangLuo\\_5ServerRecive"+count+".txt");

            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));




            String line;
            //等待读取数据
            while((line = br.readLine())!=null){
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
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
