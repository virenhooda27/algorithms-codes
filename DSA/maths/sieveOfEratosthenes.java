package maths;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean arr[]=new boolean[n+1];
        isPrime(n,arr);

    }
    static void isPrime(int n, boolean arr[]){
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j=i+i;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }
        System.out.println("The prime numbers are:-");
        for(int i=2;i<=n;i++){
            if(!arr[i]) System.out.print(i+ " ");
        }
    }

}
