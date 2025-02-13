package sorts;

import java.util.Arrays;

public class quicksort {
    static void quick(int[] arr, int low, int high){
        if(low>=high) return;
        int s=low;
        int e=high;
        int m = s + (e-s)/2;
        int pivot=arr[m];
        while(s<=e){
            while(arr[s] < pivot) s++;
            while(arr[e] > pivot) e--;
            if(s<=e){
                //swap
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        //now pivot is at correct position, sort the rest two halves now
        quick(arr,low,e);
        quick(arr,s,high);
    }


        public static void main(String[] args) {
            int[][] testCases = {
                    {5, 4, 3, 2, 1},  // Reverse sorted array
                    {1, 2, 3, 4, 5},  // Already sorted array
                    {10, -1, 2, 8, 6, 7, 3}, // Random elements
                    {3, 3, 3, 3, 3},  // All elements the same
                    {9, 7, 5, 11, 12, 2, 14, 3, 10, 6}, // Unsorted array
                    {} // Empty array
            };

            for (int[] arr : testCases) {
                System.out.println("Before sorting: " + Arrays.toString(arr));
                quick(arr, 0, arr.length - 1);
                System.out.println("After sorting:  " + Arrays.toString(arr));
                System.out.println("-----------------------------");
            }
        }



}
