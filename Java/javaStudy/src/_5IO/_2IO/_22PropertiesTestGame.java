package _5IO._2IO;

import java.io.*;
import java.util.Properties;

public class _22PropertiesTestGame {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\_5IO\\_2IO\\_22Game.txt");
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
        int num = Integer.parseInt(count);
        System.out.println(count);

        if (num>=3){
            System.out.println("游戏试玩已结束，想玩请充值(www.zhu.com)");
        }else {
            //playGames();

            num++;
            prop.setProperty("count",String.valueOf(num));
            FileWriter fw = new FileWriter("src\\_5IO\\_2IO\\_22Game.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
