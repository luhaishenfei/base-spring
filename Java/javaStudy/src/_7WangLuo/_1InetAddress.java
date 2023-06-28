package _7WangLuo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class _1InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getByName("DESKTOP-NQ8GTT7");
        String name = inetAddress.getHostName();
        String ip = inetAddress.getHostAddress();
        System.out.println(name);
        System.out.println(ip);
        System.out.println(inetAddress.getHostAddress());
//        System.out.println(inetAddress.getHostName());
    }
}
