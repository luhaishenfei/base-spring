package _5IO._2IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _2IOAppendWrite {
    public static void main(String[] args)  {
        FileOutputStream appendStream =null;

        try {
          // appendStream=new FileOutputStream("Z:\\src\\_5IO\\_2IO\\_1fos.txt",true);

            appendStream=new FileOutputStream("src\\_5IO\\_2IO\\_1fos.txt",true);
         //appendStream=new FileOutputStream("src\\_5IO\\_2IO\\_1fos.txt");

            appendStream.write("aaaaaddContent-".getBytes());
            appendStream.write("\r\n".getBytes());
            appendStream.write("addContent".getBytes());
            appendStream.write("addContentasda".getBytes());
            appendStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(appendStream!=null){
                try{
                    appendStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
