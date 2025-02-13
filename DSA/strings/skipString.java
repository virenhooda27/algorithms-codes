package strings;
//skip a string using recursion
public class skipString {
    public static void main(String[] args) {
        System.out.println(skip("hi","juhuhijdkhi"));
    }
    static String skip(String s, String up){
        if(up.isEmpty()) return "";
        int n=s.length();
        if(up.startsWith(s)){
            return skip(s,up.substring(n));
        }else{
            return up.charAt(0) + skip(s,up.substring(1));
        }
    }
}
