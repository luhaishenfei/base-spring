package _5IO._2IO;

import java.io.*;

public class _18PrintWriterCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\_5IO\\_2IO\\_17Test.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(
                "src\\_5IO\\_2IO\\_18Copy.txt",true
        ));
        String line;
        while ((line = br.readLine())!=null){
            pw.write(line);
        }
        pw.close();
        br.close();


    }
}
