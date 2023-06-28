package _5IO._2IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class _21PropertiesAndIO {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();

        //把文件中的数据加载到集合
        myLoad();

    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("src\\_5IO\\_2IO\\_21Test.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.put("001","zhuHwoWen");
        prop.put("002","xiaoLu");
        prop.put("003","Apple");

        FileWriter fw = new FileWriter("src\\_5IO\\_2IO\\_21Test.txt");
        prop.store(fw,null);
        fw.close();
    }
}
