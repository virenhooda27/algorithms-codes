package maths;

public class gcd {
    public static void main(String[] args) {
        System.out.println("HCF is : " + euclid(13,7));
        System.out.println("LCM is : " + lcm(13,7));
    }
    static int euclid(int big, int smol){
        if(big%smol == 0) return smol;
        return euclid(smol, big%smol);
    }
    static int lcm(int big, int smol){
        int gcd=euclid(big,smol);
        return big*smol/gcd;
    }
}
