package recursion;

public class digitProd {
    public static void main(String[] args) {
        int n= dp(392);
        System.out.println(n);
    }
    static int dp(int n){
        if(n%10==n) return n;
        return (n%10) * dp(n/10);
    }
}
