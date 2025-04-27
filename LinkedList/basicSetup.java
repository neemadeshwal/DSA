
public class basicSetup {

    class Node {

        int data;

        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void display() {

        System.out.println("------------inside node display--------------");

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");

            temp = temp.next;
        }
    }

    public void addNodeAtStart(int data) {

        Node nn = new Node(data);

        nn.next = this.head;

        this.head = nn;
    }

    public void addAtIndex(int data, int idx) {
        if (idx < 0)
            return;

        if (idx == 0)
            addNodeAtStart(data);

        Node nn = new Node(data);

        Node temp = this.head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        Node forward = temp.next;
        temp.next = nn;

        nn.next = forward;

    }

    public int removeAtFirst() {
        if (this.head == null)
            return -1;

        int rv = this.head.data;
        this.head = this.head.next;

        return rv;
    }

    public int removeAtEnd() {
        Node temp = this.head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        int rv = temp.next.data;
        temp.next = null;
        return rv;
    }

    public int removeAtIdx(int idx) {
        if (idx < 0)
            return -1;

        if (idx == 0)
            return removeAtFirst();

        Node temp = this.head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        int rv = temp.next.data;
        temp.next = temp.next.next;
        return rv;

    }

    public Node ReverseLinkedListFunc() {
Node temp=this.head;

      Node prev=null;
      Node current=this.head;
        while (current != null) {

          Node next=current.next;

          current.next=prev;


          prev=current;



          current=next;
         
        }

        this.head=prev;

        


       return prev;


    }

    public static void main(String args[]) {
        System.out.println("---------------");

    }

}