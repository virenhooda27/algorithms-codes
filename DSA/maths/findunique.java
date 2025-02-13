package maths;

public class findunique {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,2,1,3,6,4};
        int unique=0;
        for(int i : arr){
            unique ^= i;
        }
        System.out.println(unique);
    }
}
//all elements occur twice, except one. find it
