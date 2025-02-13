package strings;

public class string1 {
    public static void main(String[] args) {
        String a="viren";
        String b="viren";
        System.out.println(a==b);
        System.out.println(a.equals(b));
       //both above are pointing to same object in the pool inside the heap. String reference variable (a or b) is in the stack
        String c=new String("viren");
        String d=new String("viren");
        System.out.println(c==d); //false coz, two new objects are created outside the pool. so both are pointing to diff objects
        System.out.println(a==d);
        System.out.println("ff  " + c.equals(b));//true coz, this method actually checks the value of the object
        System.out.println((char) ('a'+'b'));
    }
}
