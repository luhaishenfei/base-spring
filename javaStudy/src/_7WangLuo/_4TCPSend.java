package _7WangLuo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class _4TCPSend {
    public static void main(String[] args) throws IOException {
//        Socket tcpSocket = new Socket(InetAddress.getByName("192.168.0.104"),10086);
        Socket tcpSocket = new Socket("192.168.0.104",10086);

        OutputStream os = tcpSocket.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());

        //plus1 接受客户端反馈
        InputStream is = tcpSocket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端："+data);



        tcpSocket.close();

    }
}
