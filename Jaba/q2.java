import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hi = sc.next();
        int h = hi.length();
        String st1="";
        for (int i = 0; i < h; i++) {
if(hi.charAt(i)=='@'){
    break;
}
else{
    st1+=hi.charAt(i);
}
        }
        System.out.println(st1);

        sc.close();
    }
}


/*
 * Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”

 */