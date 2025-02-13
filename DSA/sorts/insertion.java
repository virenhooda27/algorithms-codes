package sorts;
import java.util.*;
public class insertion {
    static void insertionSort(int[] arr){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,8498,9,959,32,84,88,8};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
