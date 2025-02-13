//Leetcode 33. Search in Rotated Sorted Array

public class rbs {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
    }

    static int search(int[] nums, int target) {
        int hi = findpivot(nums);
        if (hi == -1) {
            return bs(nums, target, 0, nums.length - 1);
        }
        if (nums[hi] == target) {
            return hi;
        } else if (target >= nums[0]) {
            return bs(nums, target, 0, hi - 1);
        } else {
            return bs(nums, target, hi + 1, nums.length - 1);
        }
    }


    static int findpivot(int[] nums){
        int start=0;
        int end= nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1] ){
                return mid;
            }
            else if(mid > start && nums[mid] < nums[mid-1] ){
                return mid-1;
            }
            else if(nums[start] >= nums[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }

        }
        return -1;
    }

    static int bs(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid= start + (end-start)/2;
            if(nums[mid] > target){
                end=mid -1;
            }
            else if(nums[mid] < target){
                start = mid + 1 ;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}