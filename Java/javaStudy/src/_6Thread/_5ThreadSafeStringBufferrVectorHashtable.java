package _6Thread;

import java.util.*;

public class _5ThreadSafeStringBufferrVectorHashtable {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        //线程不安全
        StringBuilder stringBuilder  = new StringBuilder("hello World");

        Vector<String>  stringVector = new Vector<>();
        //ArrayList
        List<String> stringList = Collections.synchronizedList(new ArrayList<String>());


        stringVector.add("HelloWorld");

        Hashtable<Integer,String> hashtable =  new Hashtable<>();
        //HashMap

    }
}
