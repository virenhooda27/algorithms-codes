package sorts;
import java.util.*;
public class mergeSorts {
    public static void main(String[] args) {
        int[] arr = {5, 44, 3, 27, 1};
        System.out.println(Arrays.toString(mergeSort(arr)));
        int[] arr2 = {5, 44, 3, 27, 1};
        mergeSortInplace(arr2,0,arr2.length);
        System.out.println(Arrays.toString(arr2));

    }
    static int[] mergeSort(int[] arr){
        int n= arr.length;
        if(n<2) return arr;
        int mid=n/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,n));
        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {
        int l=left.length, r=right.length;
        if(l<1) return right;
        if(r<1) return left;
        int[] arrFin=new int[left.length + right.length];
        int j=0,k=0,i=0;
        while(i<l && j<r){
            if(left[i] < right[j]){
                arrFin[k]=left[i];
                i++;
            }else{
                arrFin[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<l){
            arrFin[k]=left[i];
            i++;
            k++;
        }
        while(j<r){
            arrFin[k]=right[j];
            j++;
            k++;
        }
        return arrFin;
    }

    static void mergeSortInplace(int[] arr,int s, int e){
        if(e-s<2) return;
        int m=s + (e-s)/2;
        mergeSortInplace(arr,s,m);
        mergeSortInplace(arr,m,e);
        mergeInplace(arr,s,e,m);

    }

    private static void mergeInplace(int[] arr, int s, int e, int m) {
        int[] arrFin=new int[e-s];
        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i] < arr[j]){
                arrFin[k]=arr[i];
                i++;
            }else{
                arrFin[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arrFin[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            arrFin[k]=arr[j];
            j++;
            k++;
        }

        for(int element:arrFin){
            arr[s]=element;
            s++;
        }

    }
}
