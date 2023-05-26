package _7WangLuo;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class _2UDPSend {
    public static void main(String[] args) throws IOException {


        DatagramSocket socket = new DatagramSocket();

        byte[] bys = "HelloWorld".getBytes(StandardCharsets.UTF_8);
        //InetAddress inetAddress = InetAddress.getByName("DESKTOP-NQ8GTT7");
        DatagramPacket datagramPacket = new DatagramPacket(bys,bys.length, InetAddress.getByName("DESKTOP-NQ8GTT7"),10086);


        socket.send(datagramPacket);

        socket.close();
    }
}
