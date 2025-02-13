package strings;
import java.util.*;
public class Dice {
    public static void main(String[] args) {
        System.out.println(dice("",4));
        System.out.println(diceFace("",4,2));
    }
    static List<String> dice(String p,int target){
        List<String> list=new ArrayList<>();
        if(target==0){
            list.add(p);
            return list;
        }
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(dice(p + i,target-i));
        }
        return list;
    }

    //any number of faces in the die. also give the count back mod 1000000007
    static List<String> diceFace(String p,int target,int faces){
        List<String> list=new ArrayList<>();
        if(target==0){
            list.add(p);
            return list;
        }
        for(int i=1;i<=faces && i<=target;i++){
            list.addAll(diceFace(p + i,target-i,faces));
        }
        return list;
    }
}
