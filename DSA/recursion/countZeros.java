package recursion;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(202020));
    }
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n,int z){
        if(n==0) return z;
        int rem=n%10;
        if(rem==0){
            return helper(n/10,z+1);
        }
        return  helper(n/10,z);
    }
}
