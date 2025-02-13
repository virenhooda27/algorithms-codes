import java.util.*;
class ll1{

    Node head;
    private int size;
    ll1(){
        size=0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next != null){
            lastNode=lastNode.next;

        }
        lastNode.next=newNode;
    }

    public int search(int match){
        int location=0;
        Node curr=head;
        while(curr != null){
            if(curr.data == match){
                return location;
            }
            curr=curr.next;
            location++;
        }
        return location;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll1 lst=new ll1();
        lst.addLast(1);
        lst.addLast(5);
        lst.addLast(7);
        lst.addLast(3);
        lst.addLast(8);
        lst.addLast(2);
        lst.addLast(3);

       System.out.println(lst.search(7));
    }
}