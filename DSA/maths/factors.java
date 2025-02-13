package maths;

import java.util.Stack;

//optimized code for factors, stack is used only so that the elements are printed in ascending order
public class factors {
    public static void main(String[] args) {
        factors1(21);
        System.out.println();
        factors2(20);
    }
    static void factors1(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) System.out.print(i + " " + n/i + " ");
        }
    }
    static void factors2(int n){
        Stack<Integer> s1=new Stack<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                System.out.print(i + " ");
                s1.push(n/i);
            }
        }
        while(!s1.empty()){
            System.out.print(s1.pop() + " ");
        }
    }
}
