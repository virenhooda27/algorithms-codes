package sorts;
import java.util.*;
public class bubble {
    static void bubbleSort(int[] arr){
        boolean swap=false;
        for(int i=0;i< arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j-1] > arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                    count++;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int[] arr={1,8498,9,959,32,84,88,8};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Swaps: " + count);
    }
}
