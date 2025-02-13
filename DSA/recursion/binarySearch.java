package recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr= {3,4,6,6,7,8};
        System.out.println(binarysearch(arr,8,0,arr.length-1));
    }
    static int binarysearch(int[] arr, int target, int s, int e){
        if(s>e) return -1;
        int m= s + (e-s)/2;
        if(arr[m] == target) return m;
        else if(arr[m] > target) return binarysearch(arr,target,s,m-1);
        else return binarysearch(arr,target,m+1,e);
    }
}
