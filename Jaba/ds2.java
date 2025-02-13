import java.util.*;
public class ds2 {
    public static void main(String[] args) {
        System.out.println("Give Input");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        printnum(a);
        sc.close();
    }
    public static void printnum(int n) {
        System.out.println(n);
        printnum(n-1);
    }
    
}
