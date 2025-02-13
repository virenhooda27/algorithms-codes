package strings;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        perm("","abcd");
        System.out.println();
        System.out.println(perm2("","abcd"));
    }
    //static int count=0;
    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            //count++;
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String s1= p.substring(0,i);
            String s2=p.substring(i);
            perm(s1 + ch + s2,up.substring(1));
        }
    }
    //add in an arraylist
    static List<String> perm2(String p, String up){
        List<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String s1= p.substring(0,i);
            String s2=p.substring(i);
            list.addAll(perm2(s1 + ch + s2,up.substring(1)));
        }
        return list;
    }
}
