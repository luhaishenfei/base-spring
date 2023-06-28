package _5IO._2IO;

import java.io.*;
import java.util.Scanner;

public class _16StanderSystemInOut {
    public static void main(String[] args) throws IOException {

        //InputStream is = System.in;

//       中文时有乱码 所以用转换流
//       int by;
//        while ((by=is.read())!=-1){
//            System.out.print((char)by);
//        }

//        InputStreamReader inputStreamReader = new InputStreamReader(is);
//      使用字符流能不能实现一次读取一行数据呢？可以
//        但是，一次读取一行数据的方法是字符缓冲输入流的特有方法
//        BufferedReader br = new BufferedReader(inputStreamReader);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(br.readLine());
//        int i =Integer.parseInt(br.readLine());
//        System.out.println(i);

//        自己实现键盘录入数据太麻烦了，Java提供了一个类供我们使用
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
//        String s = sc.nextLine();


        PrintStream ps = new PrintStream(System.out);
        ps.println("hello");
        ps.println(100);

        System.out.println(100);

        //字节打印流：PrintStream
        //字符打印流：PrintWriter

        PrintStream printStream = new PrintStream("src\\_5IO\\_2IO\\_1fos.txt");
        printStream.write(97);

        printStream.print(97);
        printStream.println("中国No.1");
//使用继承父类的方法写数据，查看的时候会转码；使用自己的特有方法写数据，查看的数据原样输出

    }
}
