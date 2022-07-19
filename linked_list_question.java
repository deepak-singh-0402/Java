/*package lists_java;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class linked_list_question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linked_list_question ll = new linked_list_question();
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
        Node head= new Node(a);
        }
        getNthFromLast(10);
    }
        //Function to find the data of nth node from the end of a linked list.
        static int getNthFromLast(Node head, int n)
        {
            // Your code here
            Node cur=head;
            Node prev=null;
            int count=0;
            while(cur!=null){
                count++;
                Node temp=cur.next;
                cur.next=prev;
                prev=cur;
                cur=temp;
            }Node temp=null;
            if(n>count){
                return -1;
            }
            while(n--!=0){
                temp=prev;
                prev=prev.next;

            }
            return temp.data;
        }
    }
*/