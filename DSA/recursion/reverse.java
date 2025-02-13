package recursion;

public class reverse {
    public static void main(String[] args) {
        rev1(34056);
        System.out.println(number);
        System.out.println(rev2(34056));
        System.out.println("Palindrome : "+palindrome(56565));
    }
    static boolean palindrome(int n){
        return (n==rev2(n));
    }
    static int number=0;
    static void rev1(int n){
        if(n==0) return;
        int rem=n%10;
        number=number * 10 + rem;
        rev1(n/10);
    }

    static int rev2(int n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits=(int) (Math.log10(n) + 1);
        return helper(n,digits);
    }

    static int helper(int n, int digits){
        if(n%10 ==n)return n;
        int rem=n%10;
        int d1=rem * (int)Math.pow(10,digits-1);
        return d1 + helper(n/10,digits-1);
    }

}
