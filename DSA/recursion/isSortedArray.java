package recursion;

import java.util.Arrays;

public class isSortedArray {
    public static void main(String[] args) {
        int[] arr= {3,4,6,6,7,8};
        System.out.println(check(arr));
        System.out.println(check2(arr,0));
    }

    //this method passes a new array everytime
    static boolean check(int[] arr){
        if(arr.length <=1) return true;
        int[] subarr= Arrays.copyOfRange(arr,1,arr.length);
        return arr[0] < arr[1] && check(subarr);
    }

    //this one passes an index instead of a new array everytime
    static boolean check2(int[] arr, int index){
        if(index == arr.length-1) return true;
        return arr[index] < arr[index+1] && check2(arr,index+1);
    }
}
