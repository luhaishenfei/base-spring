package _7WangLuo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class _3UDPReciveTest implements Runnable {

    @Override
    public void run() {
            DatagramSocket socket = null;
            try {
                socket = new DatagramSocket(11089);
            } catch (SocketException e) {
                e.printStackTrace();
            }
            byte[] bytes = new byte[1024];
            int len = 1024;
            DatagramPacket packet = new DatagramPacket(bytes, len);
        while (true) {

            try {
                socket.receive(packet);
                byte[] packetData = packet.getData();
                String dataString = new String(packetData);
                System.out.println(dataString);

            } catch (IOException e) {
                e.printStackTrace();
            }




        }
    }
}
