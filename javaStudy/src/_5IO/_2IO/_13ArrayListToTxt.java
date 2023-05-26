package _5IO._2IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class _13ArrayListToTxt {
    public static void main(String[] args) throws IOException {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("World");
        stringArrayList.add("java");
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("src\\_5IO\\_2IO\\_13ArrayToTxt.txt")
        );
        for (String line :
                stringArrayList) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
    }
}
