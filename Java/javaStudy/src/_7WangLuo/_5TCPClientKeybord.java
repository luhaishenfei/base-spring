package _7WangLuo;

import java.io.*;
import java.net.Socket;

public class _5TCPClientKeybord {
    //数据来源键盘录入，直到输入数据是886 发送数据结束
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("192.168.0.104",10085);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        String line;
        while ((line = br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }

            //获取输出流对象
//            OutputStream os = clientSocket.getOutputStream();
//            os.write(line.getBytes());

            //字符
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //
        clientSocket.close();

    }
}
