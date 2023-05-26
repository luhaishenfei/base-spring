package _5IO._2IO;

import java.io.FileInputStream;
import java.io.IOException;

public class _3IOInputRead {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src\\_5IO\\_2IO\\_1fos.txt");

         /*
         //first try
            int by = fileInputStream.read();
            while (by!=-1){
                System.out.print((char) by);
                by=fileInputStream.read();
            }
*/
            //below is optimize
            int by;
            while ((by = fileInputStream.read()) != -1) {
                System.out.print((char) by);
            }


            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //below is once read a bytesArray
        System.out.println("\r\n--------------");
        FileInputStream fileInputStreamBytes = null;
        try {
            fileInputStreamBytes = new FileInputStream("src\\_5IO\\_2IO\\_1fos.txt");
            byte[] bys = new byte[1024];
            int len;

            while ((len = fileInputStreamBytes.read(bys)) != -1) {
                System.out.println(new String(bys, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStreamBytes != null) {
                try {
                    fileInputStreamBytes.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
