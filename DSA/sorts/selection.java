package sorts;
import java.util.*;
public class selection {
    static void selection(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int last=n-i-1;
            int maxIndex=0;
            for(int j=1;j<=last;j++){
                if(arr[maxIndex] < arr[j]) maxIndex=j;
            }
            //swap
            if(!(maxIndex==last)){ //no need to swap
                int temp=arr[maxIndex];
                arr[maxIndex]=arr[last];
                arr[last]=temp;
                count++;
            }

        }
    }
    static int count=0;
    public static void main(String[] args) {
        int[] arr={1,8498,9,959,32,84,88,8};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Swaps: " + count);
    }
}
