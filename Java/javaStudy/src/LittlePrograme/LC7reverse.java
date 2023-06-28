package LittlePrograme;

public class LC7reverse {
    public static void main(String[] args) {
        LC7reverse lc = new LC7reverse();
        System.out.println(lc.reverse(1092312321));
    }

    /*
    执行用时：
1 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
35.3 MB
, 在所有 Java 提交中击败了
93.27%
的用户
炫耀一下:

写题解，分享我的解题思路
提交结果	执行用时	内存消耗	语言	提交时间	备注
通过
1 ms	35.3 MB	Java	2021/06/25 16:24
添加备注

通过
1 ms	35.4 MB	Java	2021/06/25 16:24
添加备注
     */
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }


    /*
    执行用时：
3 ms
, 在所有 Java 提交中击败了
17.25%
的用户
内存消耗：
35.7 MB
, 在所有 Java 提交中击败了
30.35%
的用户
炫耀一下:

写题解，分享我的解题思路
提交结果	执行用时	内存消耗	语言	提交时间	备注
通过
3 ms	35.7 MB	Java	2021/06/25 16:23
添加备注

通过
3 ms	35.8 MB	Java	2021/06/25 16:22
添加备注

通过
3 ms	35.5 MB	Java	2021/06/25 16:22
添加备注
     */
    public int reverseChar(int x){
            long l;//防止溢出
            char t;//交换字符
            String s=Integer.toString(x);//转化为字符串
            char []c1=s.toCharArray();//字符串转字符数组
            for(int i=0;i<c1.length/2;i++)//交换字符
            {t=c1[c1.length-1-i];
                c1[c1.length-1-i]=c1[i];
                c1[i]=t;
            }
            if(x<0)//小于零的数，把负号换成0
            {  c1[c1.length-1]='0';
                s=new String(c1);//字符数组转字符串
                l=Long.parseLong(s);
                l=l/10*(-1);//换成0后，数会*10，所以要除以十，负数乘-1
            }
            else
            {   s=new String(c1);
                l=Long.parseLong(s);}

            if(l>Integer.MAX_VALUE||l<Integer.MIN_VALUE)//溢出返回0
                l=0;

            return (int) l;
    }
}
