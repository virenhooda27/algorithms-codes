package maths;

public class noOfDigits {
    public static void main(String[] args) {
        int n=50;
        int base=2;  //2 for binary, 10 decimal etc
        int digits=(int)(Math.log(n) / Math.log(base)) +1;
        System.out.println(digits);
    }
}
