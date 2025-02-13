package recursion;

public class digitSum {
    public static void main(String[] args) {
        int n= ds(30);
        System.out.println(n);
    }
    static int ds(int n){
        if(n==0) return 0;
        return (n%10) + ds(n/10);
    }
}
