package _5IO._1File;

public class _3RecursionRabbitProblem {
    //递归
    //不死神兔位列子   1，1，2，3，5，8...


    static final private int years = 20;

    public static void main(String[] args) {
        //my program
           /*
        int[] allRabbit = new int[years+1];
        int[] oldRabbit = new int[years+1];
        int[] newRabbit = new int[years+1];

        oldRabbit[0]=1;
        newRabbit[1]=1;
        for (int i = 0; i < 20; i++) {
            allRabbit[i] = oldRabbit[i]+newRabbit[i];
            newRabbit [i+1]=oldRabbit[i];
            oldRabbit [i+1]=allRabbit[i];

        }
        for (int i :allRabbit
                ) {
            System.out.println(i);

        }
        */
        int[] allRabbit = new int[years];
        allRabbit[0]=1;
        allRabbit[1]=1;
        for (int i = 2;i<20;i++){
            allRabbit[i]=allRabbit[i-2]+allRabbit[i-1];
        }

        for (int i:allRabbit
             ) {
            System.out.print(i+" ");
        }
        //
        System.out.println("--Recursion--");
        /*
        *
        *
        *
        * */

        int ans = f(19);
        System.out.println("---");
        for (int i = 0; i <20 ; i++) {
            System.out.println( f(i));

        }
    }

    public static int f(int n){
        if(n==0||n==1){
            return 1;
        }
        return f(n-1)+f(n-2);
    }

}
