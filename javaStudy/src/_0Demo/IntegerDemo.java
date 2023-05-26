package _0Demo;

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        Integer i = new Integer(1);
        i=Integer.valueOf(100);
        String s = "1111";
        Integer ii = Integer.valueOf(s);
        System.out.println(i+"/"+ii);
    //   ii = Integer.valueOf("11a1");
        System.out.println("----");
        s = String.valueOf(1111);
        System.out.println(s);
        //
        int x = i.intValue();
        System.out.println(x);
        //
        int y = Integer.parseInt("100");
        System.out.println(y);

        String ss = "11 22 33";
        String[] sss= new String[4];
        sss=ss.split(" ");
        System.out.println("--");
        for (int  j = 0 ;j<sss.length;j++){
            System.out.println(sss[j]);
        }
        System.out.println("---");

    }
}
