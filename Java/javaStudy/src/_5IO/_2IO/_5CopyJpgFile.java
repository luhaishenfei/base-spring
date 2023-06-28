package _5IO._2IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _5CopyJpgFile {
    public static void main(String[] args)throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src\\_5IO\\_2IO\\_5_IMG_20200103_111355.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("src\\_5IO\\_2IO\\_5_IMG_copy.jpg");

        byte[] bys = new byte[1024];
        int len;

        while ((len = fileInputStream.read(bys)) != -1) {
            fileOutputStream.write(bys, 0, len);
       //     System.out.println(new String(bys, 0, len));
        }

        fileOutputStream.close();
        fileInputStream.close();
    }
}
