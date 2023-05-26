package _5IO._1File;

public class _4RecursionGetFactorial {
    public static void main(String[] args) {

        System.out.println(getFactorial(5));
    }
    public static int getFactorial(int i){
        if (i==1){
            return 1;
        }
        return i*getFactorial(i-1);
    }
}
