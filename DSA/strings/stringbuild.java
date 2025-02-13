package strings;

public class stringbuild {
    public static void main(String[] args) {
        StringBuilder hi=new StringBuilder();
        for(int k=0;k<=25;k++){
            char ch= (char) ('a' + k);
            hi.append(ch);

        }
        System.out.println(hi);
        hi.delete(0,1);
        System.out.println(hi);
        System.out.println(hi.indexOf("a"));
        System.out.println(hi.capacity());
        hi.trimToSize();
        System.out.println(hi.capacity());


    }
}
