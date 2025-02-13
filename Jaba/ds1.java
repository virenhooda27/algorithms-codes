import java.util.*;
@SuppressWarnings("unused")
class ds1{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TonyStarkDrDoom");
     //Set Char
     System.out.println(sb);
     int l=sb.length();
     for(int i=0;i<l;i++){
        sb.append(sb.charAt(l-i-1));
        sb.deleteCharAt(l-i-1);
     }
     System.out.println(sb);
    }
}

//reverse string using stringbuilder