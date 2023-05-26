package _7WangLuo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class _2UDPReceive {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes= new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        try {
            ds.receive(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] datas = dp.getData();
        int len = dp.getLength();
        String dataString = new String(datas,0,len);
        System.out.println("数据是："+dataString);

        ds.close();
    }
}
