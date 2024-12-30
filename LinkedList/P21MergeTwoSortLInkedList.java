public class P21MergeTwoSortLInkedList {
    

    public static LinkedList mergeTwoLinkedList(LinkedList.Node head1,LinkedList.Node head2){

        LinkedList list3=new LinkedList();

        LinkedList.Node x=head1;
        LinkedList.Node y=head2;

        LinkedList.Node preHead=list3.new Node(-1);

        

        LinkedList.Node z=preHead;



        


        while(x!=null&&y!=null){

          
            if(x.data<=y.data){
         z.next=x;
            x=x.next;
           }
           else{
            z.next=y;
            y=y.next;
           }
           z=z.next;
          
        }
      z.next=x==null?y:x;
      
        list3.head = preHead.next;

        return list3;
    }
    public static void main(String[] args) {

      LinkedList list1=new LinkedList();
      LinkedList list2=new LinkedList();


      list1.addStart(1);
      list1.addLast(3);
      list1.addLast(5);

      list1.display();

      System.out.println();

      list2.addStart(1);
      list2.addLast(2);
      list2.addLast(3);
      list2.addLast(4);
      list2.addLast(5);
      list2.addLast(6);
      list2.addLast(7);
      list2.addLast(8);

      list2.display();


    LinkedList list3=  mergeTwoLinkedList(list1.head,list2.head);
System.out.println();
    System.out.println("=======third list========");
    System.out.println();
    list3.display();

        

    }
    
}
