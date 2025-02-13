package STS;
import java.util.*;
public class aliceappletree {
    static int minApples(int M,int K,int N, int S, int W, int E){
        if(M<=S*K){
            return M;
        }
        else if(M<=S * K + E + W){
            return S*K+(M-S*K);
        }
        else
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nimber of apples to be collected: ");
        int M=sc.nextInt();
        System.out.print("Number of apples in each tree: ");
        int K=sc.nextInt();
        System.out.print("Enter number of trees in north: ");
        int N=sc.nextInt();
        System.out.print("Enter number of trees in south: ");
        int S=sc.nextInt();
        System.out.print("Enter number of trees in west: ");
        int W=sc.nextInt();
        System.out.print("Enter number of trees in east: ");
        int E=sc.nextInt();
        System.out.println(minApples(M, K, N, S, W, E));
        sc.close();
    }
}
//north no red apples
//east has some green
//west has some res
//south no green