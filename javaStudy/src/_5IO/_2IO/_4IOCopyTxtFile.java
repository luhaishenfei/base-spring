package _5IO._2IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _4IOCopyTxtFile {
    public static void main(String[] args) {
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream = null;
        try{
            fileInputStream = new FileInputStream("src\\_5IO\\_2IO\\_1fos.txt");
            fileOutputStream = new FileOutputStream("src\\_5IO\\_2IO\\_1fos_copy.txt");
            int by;
            while((by=fileInputStream.read())!=-1){
              //
                System.out.print((char) by);
                fileOutputStream.write(by);
            }

            fileInputStream.close();
            fileOutputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fileInputStream!=null){
                try{
                    fileInputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
