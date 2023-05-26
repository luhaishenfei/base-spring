package _5IO._2IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class _14TxtToArray {
    public static void main(String[] args) throws IOException {
        ArrayList<String> stringArrayList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src\\_5IO\\_2IO\\_13ArrayToTxt.txt")
        );
        String line;
        while((line = bufferedReader.readLine())!=null){
            stringArrayList.add(line);
        }
        bufferedReader.close();
        for (String s :
                stringArrayList) {
            System.out.println(s);
        }

        Random r = new Random();
        int index = r.nextInt(stringArrayList.size());
        System.out.println(stringArrayList.get(index));


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("朱浩闻").append(",12").append(",cs");
        System.out.println(stringBuilder.toString());


        String[] strs = stringBuilder.toString().split(",");
        for (String s :
                strs) {
            System.out.println(s);
        }

        int i = Integer.parseInt("1");
        System.out.println(i);
    }
}
