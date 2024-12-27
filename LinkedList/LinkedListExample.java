public class LinkedListExample {
    
   public static void main(String[] args) {
    
    LinkedList newList=new LinkedList();

    newList.addStart(10);
    newList.addStart(20);
    newList.addStart(30);
    newList.addLast(40);

    newList.addAtIndex(100, 1);

    newList.display();
    System.out.println();

    newList.removeAtStart();

    newList.display();
    System.out.println();


    newList.removeAtIdx(2);

    newList.display();

    System.out.println();

    newList.addLast(500);

    newList.addLast(1000);

    newList.display();

    newList.ReverseLinkedList();
    System.out.println();

    newList.display();
    System.out.println();
    System.out.println("---------with recursion----------");

    System.out.println();
    newList.display();
    System.out.println();
    newList.ReverseLinkdListWithRecursion(null, newList.head);

    newList.display();



   }

}
