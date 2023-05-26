package _4Collection._1Collection;

//import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;

public class _CollectionDemo {
    public static void main(String[] args) {
        //Create Collection object
        Collection<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("ZhuHaowen");
        stringArrayList.add("XiaoLu");
        stringArrayList.add("ex");
        stringArrayList.remove("ex");
        System.out.println(stringArrayList);




    }
}
