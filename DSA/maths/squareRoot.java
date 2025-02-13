package maths;

public class squareRoot {
    public static void main(String[] args) {
        int n=40;
        int p=3; //precision ie up to how many decimals
        System.out.printf("BS method: %.3f \n", BSsquirt(n,p));
        System.out.printf("Newton method: %.3f" , newtonRaphson(40));

    }
    static double BSsquirt(int n, int p){
        double ans=0.0;
        int s=0;
        int e=n;
        //bs to find the main digits
        while(s<=e){
            int m=s + (e-s)/2;
            if(m*m==n) return m;
            else if(m*m > n){
                e=m-1;
            }
            else{
                s=m+1;
                ans=m;
            }
        }
       // int count = 0;
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(ans * ans <= n){
                ans += incr;
               // count++;
            }
            ans-=incr;
            incr/=10;
        }
   //     System.out.println(count);
        return ans;
    }

    static double newtonRaphson(int n){
        double x=n;
        double root;
        while(true){
            root=0.5 * (x + n/x);
            if(Math.abs(root-x) < 0.0000001) break;
            x=root;
        }
        return root;
    }
}
