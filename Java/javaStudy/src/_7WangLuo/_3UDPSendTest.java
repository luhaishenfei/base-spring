package _7WangLuo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class _3UDPSendTest implements Runnable {
    @Override
    public void run() {
//while (true){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }

        //自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                //如果输入的数据是886 发送数据结束
                if ("886".equals(line)) {
                    break;
                }
                byte[] bys = line.getBytes(StandardCharsets.UTF_8);


                int len = bys.length;
                InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getByName("DESKTOP-NQ8GTT7");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                DatagramPacket datagramPacket = new DatagramPacket(bys, len, inetAddress, 11089);


                try {
                    socket.send(datagramPacket);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        socket.close();
    }
//    }
}
