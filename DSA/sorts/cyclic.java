package sorts;

import java.util.Arrays;

public class cyclic {
    static void cyclic(int[] arr){
        int i=0;
        while(i< arr.length){
            int correctIndex=arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        System.out.println(Arrays.toString(arr));
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}
