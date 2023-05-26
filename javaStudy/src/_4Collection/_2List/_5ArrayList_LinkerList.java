package _4Collection._2List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class _5ArrayList_LinkerList {
    //ArrayList 底层是数组
    //LinkerList 底层是链表
    public static void main(String[] args) {
        String w1 = "hello";
        String w2 = "World";
        String w3 = "java";

        long t  = 0;

        t = System.currentTimeMillis();


        System.out.println("--ArrayList Start--");
        ArrayList<String> arrayList =  new ArrayList();

        for (int i = 0; i <  100000; i++) {
            arrayList.add(w1);
            arrayList.add(w2);
            arrayList.add(w3);

        }


        Iterator<String > iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("-----");

        for ( String s :
                arrayList) {
            System.out.println(s);
        }
        System.out.println("-----");
        t = System.currentTimeMillis()-t;
        System.out.println("==ArrayList Over=="+"Takes "+t+" ms");


        t = 0;

        t = System.currentTimeMillis();
        System.out.println("--LinkedList Start--");
        LinkedList<String> linkedList = new LinkedList();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(w1);
            linkedList.add(w2);
            linkedList.add(w3);
        }

        Iterator<String > LinkedIterator = linkedList.iterator();
        while (LinkedIterator.hasNext()){
            System.out.println(LinkedIterator.next());
        }
        System.out.println("-----");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("-----");

        for ( String s :
                linkedList) {
            System.out.println(s);
        }
        System.out.println("-----");


        t = System.currentTimeMillis()-t;

        System.out.println("==Linked Over=="+"Takes "+t+" ms");


    }
}
