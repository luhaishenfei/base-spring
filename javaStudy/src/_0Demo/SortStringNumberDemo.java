package _0Demo;


import _2BubbleSort.BubbleSortDemo;

import java.util.ArrayList;

public class SortStringNumberDemo {
    public static void main(String[] args) {


        String s = "11 2 23 11 4 43 32 13 23";

        s = sortString(s);

        System.out.println(s);

    }

    public  static String sortString(String s){
        //
        String[] arrStr = s.split(" ");

        int[] arrInt = new int[arrStr.length];

        for (int i = 0; i<arrStr.length ;i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        arrInt = _2BubbleSort.BubbleSortDemo.BubbleSort(arrInt);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i =  0 ;i<arrInt.length; i++){

            stringBuilder.append(arrInt[i]);
            if (i!=arrInt.length-1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}

/*
    public  static String sortString1(String s){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int blank = -1;
        for (int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)==' '){
                String temp ="";

                for (int j = blank ; j<i;j++){
                    temp=temp+s.charAt(j+1);

                }
                blank =i;
                int a = 1;
                arr.add(a);
            }


        }


        return s;
    }
    */

