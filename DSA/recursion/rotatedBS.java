package recursion;

public class rotatedBS {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,1,2};
        System.out.println(rbs(arr,1,0,arr.length-1));
    }
    static int rbs(int[] arr,int target, int s, int e){
        if(s>e) return -1;
        int m=s+(e-s)/2;
        if(arr[m] == target) return m;
        if(arr[s] <=arr[m]) {
            if (arr[m] >= target && arr[s] <= target) {
                return rbs(arr, target, s, m-1);
            }else{
                return rbs(arr, target, m+1, e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return rbs(arr, target, m+1, e);
        }
        return rbs(arr,target,s,m-1);
    }
}
