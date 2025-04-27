import java.lang.classfile.components.ClassPrinter.ListNode;

public class P160Intersection {


public class Solution {
    public LinkedList.Node  getIntersectionNode(LinkedList.Node headA, LinkedList.Node headB) {
        
        LinkedList.Node  head1=headA;
        LinkedList.Node  head2=headB;

        int lengthA=0;
        int lengthB=0;

        while(head1.next!=null){
            lengthA++;
            head1=head1.next;
        }
        while(head2.next!=null){
            lengthB++;
            head2=head2.next;
        }

        int startidx;
        int startidx1;
        int startidx2;

        if(lengthA>lengthB){
            startidx1=lengthA-lengthB;

        }
        else{
           startidx2=lengthB-lengthA;
        }

        while(startidx1<lengthA||startidx2<lengthB){

            if(head1.data==head2.data){
                return head1;
            }
            else{
                head1=head1.next;
                head2=head2.next;
            }
        }

            

return null;
    }
}
    
    public static void main(String[] args) {
        
    }
}
