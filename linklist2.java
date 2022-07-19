/*class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head)
    {
        //Your code here
        if(head==null)
            return true;
        Node mid=middle(head);
        Node last=reverse(mid.next);
        Node cur=head;
        while(last!=null){
            if(last.data!=cur.data){
                return false;
            }else{
                last=last.next;
                cur=cur.next;
            }
        }return true;

    }
    Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    Node reverse(Node head){
        /*Node cur=head;
        Node prev =null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;

        if(head==null||head.next==null){
            return head;
        }
        Node newhead=reverse(head.next);
        Node headnext=head.next;
        headnext.next=head;
        head.next=null;
        return newhead;

    }
}

*/