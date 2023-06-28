package _4Collection._3Set;

import java.util.Random;
import java.util.TreeSet;

public class _6Get10RandomNum {
    /*
    Random r = new Random();
    r.nextInt(20)+1;



     */
    public static void main(String[] args) {
        Random r = new Random();
       int random =  r.nextInt(20)+1;

        TreeSet<Integer> treeSet = new TreeSet();
        int num=0;
        int count =0;
        while(treeSet.size()<10){
            count++;
             num = (int) (Math.random()*100);
            if (0<num&&num<=20){
                treeSet.add(num);
            }

        }
        System.out.println("do "+count+" times,"+"numbers are:");
        for (Integer i :
                treeSet) {
            System.out.println(i);
        }
    }
}
