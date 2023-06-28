package _4Collection._3Set._7Generator;

public class VariableArgument {
    public int sum(int... a){
        int sum=0;
        for (int i :
                a) {
            sum+=i;
        }
        return sum;
    }

    public int sumPlus(int b,int... a){
       return b;

    }
}
