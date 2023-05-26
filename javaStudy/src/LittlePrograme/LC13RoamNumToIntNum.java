package LittlePrograme;

import java.util.HashMap;
import java.util.Map;

public class LC13RoamNumToIntNum {
    public static void main(String[] args) {
        //   System.out.println(romanToInt("IIV"));
           System.out.println(romanToInt("IVX"));

           LCSwordPointOffer13StringSetProblem rand = new LCSwordPointOffer13StringSetProblem();
        System.out.println(rand.permutation("abc"));
    }
    /*
    * 字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

*
* import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}


    * */
    public static int romanToInt(String s) {
        int num = 0;
        Map<Character,Integer> roamValue = new HashMap();
        roamValue.put('I',1);
        roamValue.put('V',5);
        roamValue.put('X',10);
        roamValue.put('L',50);
        roamValue.put('C',100);
        roamValue.put('D',500);
        roamValue.put('M',1000);

        for (int i = 0; i < s.length(); i++) {
            if(i ==s.length()-1){

                num += roamValue.get(s.charAt(i));

            }else if (roamValue.get(s.charAt(i))<roamValue.get(s.charAt(i+1))){

                num-= roamValue.get(s.charAt(i));
            }else{
            num += roamValue.get(s.charAt(i));
            }
        }



        return num;
    }

}
