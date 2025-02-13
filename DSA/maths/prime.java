package maths;

public class prime {
    public static void main(String[] args) {
        int upto = 30;
        for(int i=1;i<=upto;i++){
            if(isPrime(i)) System.out.print(i + " ");
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c <=n){
            if(n % c == 0) return false;
            c++;
        }
        return true;
    }
}
