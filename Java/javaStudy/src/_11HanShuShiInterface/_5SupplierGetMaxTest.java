package _11HanShuShiInterface;

import java.util.function.Supplier;

public class _5SupplierGetMaxTest {
    public static void main(String[] args) {
        int[] arr = {19,59,23,66,46};
        int maxNum =  getMax(()->{
           int max = arr[0];
            for (int i = 1; i <arr.length ; i++) {
                if (arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        });
        System.out.println(maxNum);
    }


    //返回int数组的最大值
    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
