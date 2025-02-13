package patterns;

public class diamond {
    public static void main(String[] args) {
        pattern1(9);

    }
    static void pattern1(int n){
        int s1=(n+1)/2;
        int t1=0;
        for(int row=0;row<(n+1)/2;row++){
            s1--;
            t1++;
            for(int s=0;s<s1;s++){
                System.out.print(" ");
            }
            for(int t=0;t<t1;t++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=0;row<(n+1)/2;row++){
            s1++;
            t1--;
            for(int s=0;s<s1;s++){
                System.out.print(" ");
            }
            for(int t=0;t<t1;t++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        System.out.print(n+ " ");
        if(n%100==0) System.out.println();;
        pattern2(n+1);
    }
}
