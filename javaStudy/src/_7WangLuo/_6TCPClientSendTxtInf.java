package _7WangLuo;

import java.io.*;
import java.net.Socket;

public class _6TCPClientSendTxtInf {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("192.168.0.104",10085);

        BufferedReader br = new BufferedReader(new FileReader("src\\_7WangLuo\\_6ClientSendInf.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();
        clientSocket.shutdownOutput();

        //接受服务器反馈
        BufferedReader clientBr = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String data = clientBr.readLine();
        System.out.println("服务器的反馈:"+data);
//        while ((line = clientBr.readLine())!=null){
//            System.out.println(line);
//        }

        bw.close();
        clientSocket.close();

    }
}
