package _5IO._2IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class _1IOBasic {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\_5IO\\_2IO\\_1fos.txt");

        //fileOutputStream.write(98);

        //fileOutputStream.close();
        String s = "hellaaaaoWorld";
        byte[] bytes ={97,98,99,100,101,102,103};
        fileOutputStream.write(bytes);
        fileOutputStream.write(11);
        fileOutputStream.write(bytes,2,3);
        fileOutputStream.write(11);
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write("hello".getBytes());
        byte[] bytes1 = s.getBytes(StandardCharsets.UTF_8);

        for (byte b:bytes1
             ) {
            System.out.println(b);
        }

        fileOutputStream.write(bytes1);
        fileOutputStream.write(bytes1,0,bytes1.length);
        fileOutputStream.close();




    }

}
