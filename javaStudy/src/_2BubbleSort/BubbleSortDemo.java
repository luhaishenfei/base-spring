package _2BubbleSort;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {12,34,2,65,15,24,65,1,43,12,43,56,12,54};
        arr = BubbleSort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] BubbleSort(int[] arry){
       for (int j = 0 ; j<arry.length -1;j++) {
           for (int i = 0; i < arry.length - 1-j; i++) {
               if (arry[i] > arry[i + 1]) {
                   int temp = arry[i];
                   arry[i] = arry[i + 1];
                   arry[i + 1 ] = temp;
               }


           }
       }



        return arry;
    }
}
