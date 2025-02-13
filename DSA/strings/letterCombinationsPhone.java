package strings;
import java.util.*;
public class letterCombinationsPhone {
    static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        List<String> list=combos("","456") ;
        System.out.println(list);
    }

    static List<String> combos(String p,String up){
        List<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        String letter=map[ch - '0'];
        for(int i=0;i<letter.length();i++){
            list.addAll(combos(p + letter.charAt(i), up.substring(1)));
        }
        return list;
    }
}



/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.*/