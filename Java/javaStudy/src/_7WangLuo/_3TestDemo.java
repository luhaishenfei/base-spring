package _7WangLuo;

import java.io.IOException;

public class _3TestDemo {
    public static void main(String[] args) throws IOException {


        _3UDPReciveTest udpReciveTest = new _3UDPReciveTest();
        Thread udpRecive = new Thread(udpReciveTest);
        udpRecive.start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _3UDPSendTest udpSendTest = new _3UDPSendTest();
        Thread udpSendT= new Thread(udpSendTest);
        udpSendT.start();






//
//
//        DatagramSocket socket = new DatagramSocket();
//
//        while(true){
//            byte[] bytes= new byte[1024];
//            int len = 1024;
//            DatagramPacket packet = new DatagramPacket(bytes,len);
//            System.out.println(socket.isConnected());
//            System.out.println("==");
//            socket.receive(packet);
//            System.out.println(socket.isConnected());
//        }


        //socket.close();
    }
}
