package DoublyLinkedList;

public class dllInstance {

    public static void main(String[] args) {
        

        dLL newlist2=new dLL();

        newlist2.addFirst(10);

        newlist2.addLast(20);
        newlist2.addLast(30);

        newlist2.display();

        newlist2.addLast(40);

        newlist2.addLast(50);

        newlist2.addAtIndex(60,2);

        newlist2.display();

        newlist2.deleteAtIndex(2);
        newlist2.display();

        newlist2.deleteFirst();

        newlist2.deleteLast();

        newlist2.display();


    }
    

   




}
