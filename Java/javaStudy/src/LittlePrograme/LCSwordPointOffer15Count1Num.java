package LittlePrograme;

import java.util.*;

public class LCSwordPointOffer15Count1Num {


    public static class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
          /*  String s = n+"";
            n=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='1'){
                    n++;

                }
            }
*/
            int res=0;
            for(int i=0;i<32;i++){
                if((n&1)==1) //类似于if(n%2==1)
                    res++;
                n=n>>1;
            }
            int i =  Integer.bitCount(n);

            return res;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(00000000000000000000000000001011));
    }
}
