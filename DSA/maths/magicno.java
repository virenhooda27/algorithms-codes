package maths;

public class magicno {
    public static void main(String[] args) {
        int n=5;
        int base=5;
        int ans=0;
        while(n>0){
            int lastBit=n&1;
            ans += lastBit*base;
            base *=5;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
