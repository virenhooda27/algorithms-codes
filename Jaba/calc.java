import java.util.*;

public class calc {

    public static void main(String[] args) {
        System.out.println("HIII");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double a = sc.nextDouble();
        System.out.println("Enter the Second Number");
        double b = sc.nextDouble();
        System.out.println("Enter the Operation +,-,*,/");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
        }
        sc.close();
    }
}