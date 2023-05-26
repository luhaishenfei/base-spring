package LittlePrograme;

public class LC0form {
    public static void main(String[] args) {
        LC0form lc = new LC0form();
        System.out.println(lc.reverse(1092312321));
    }
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}
