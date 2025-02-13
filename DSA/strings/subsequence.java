package strings;
import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        //subseq("","abc");
        ArrayList<String> list=Asciisubseq1("","abc");
        int n=list.size();
        System.out.println(list+ "\nSize: "+n);
    }

    //prints out all the subsequences possible
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char c=up.charAt(0);
        subseq(p + c,up.substring(1));
        subseq(p,up.substring(1));
        //prints empty string too;
    }

    //returning an arraylist, without creating one outside and passing it inside.
    static ArrayList<String> subseq1(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char c=up.charAt(0);
        list.addAll(subseq1(p + c,up.substring(1)));
        list.addAll(subseq1(p,up.substring(1)));
        return list;
    }

    //returning also the ascii values. like a98c, 979899 also in the arraylist
    static ArrayList<String> Asciisubseq1(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char c=up.charAt(0);
        list.addAll(Asciisubseq1(p + c,up.substring(1)));
        list.addAll(Asciisubseq1(p,up.substring(1)));
        list.addAll(Asciisubseq1(p + (c+0),up.substring(1)));
        return list;
    }


}
