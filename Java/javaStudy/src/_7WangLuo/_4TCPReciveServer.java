package _7WangLuo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class _4TCPReciveServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);

        //accept（） 侦听要链接到此套接字并接受它
        Socket accept = serverSocket.accept();

        //获取输入流，读数据
        InputStream is = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务器：" + data);

        //plus1 给出反馈
        OutputStream os = accept.getOutputStream();
        os.write("数据已接收到".getBytes());

        //
        serverSocket.close();
    }
}
