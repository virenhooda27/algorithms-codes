package STS;

import java.util.Scanner;

public class binaryplindrome {
    public static boolean Palindrome(int N) {
        String s = Integer.toBinaryString(N);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();
        System.out.println(Palindrome(x));
        sc.close();
    }
}
