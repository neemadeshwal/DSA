public class P876MiddleElement{

    public static int middleElement(LinkedList.Node head){
            
        LinkedList.Node slow=head;
        LinkedList.Node fast=head;

        while(fast!=null&&fast.next!=null){

            System.out.println(slow.data+": slow"+","+fast.data+": fast");
            System.out.println();
            
            slow=slow.next;
            fast=fast.next.next;

            System.out.println(slow.data+": slow");


        }
        return slow.data;
       
    }

    public static void main(String[] args) {
        LinkedList newList=new LinkedList();
        newList.addStart(10);

        newList.addStart(20);
        newList.addStart(30);
        newList.addLast(40);
        newList.addStart(50);

    
        newList.addAtIndex(100, 1);

        newList.display();
        System.out.println();

        System.out.println(middleElement(newList.head));

        
    }
}