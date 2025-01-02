package DoublyLinkedList;

public class dLL {
    
    class Node{

        int data;

        Node next;

        Node prev;

        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }

    Node head;

    public void display(){
    
        Node temp=this.head;


        while(temp!=null){
            System.out.print(temp.data+" ");

            temp=temp.next;
        }
        System.out.println();

    }

    public void addFirst (int data){

        Node nl=new Node(data);
        nl.next=this.head;


        if(this.head!=null){

            this.head.prev=nl;
        }


        this.head=nl;

    }


    public void addLast(int data){

        Node nl=new Node(data);

       Node temp=this.head;

       while(temp.next!=null){

          temp=temp.next;
       }
           temp.next=nl;

           nl.prev=temp;




    }

    public void addAtIndex(int data,int idx){

        if(idx<0) return;

        if(idx==0) { addFirst(data);};

      Node  temp=this.head;

      Node nn=new Node(data);

        for(int i=0;i<idx-1;i++){

            temp=temp.next;
            
        }


        Node forward=temp.next;

        

        nn.prev=temp;

        temp.next=nn;

        nn.next=forward;

        forward.prev=nn;



        





        



    }


    public void deleteFirst(){

        if(this.head==null) return;

        this.head=this.head.next;

        this.head.prev=null;

    }

    public void deleteLast(){

        Node temp=this.head;

        while(temp.next.next!=null){

            temp=temp.next;
        }

        temp.next=null;


    }

    public void deleteAtIndex(int idx){

        if(idx<0) return ;
       Node temp=this.head;

       if(idx==0) {
        deleteFirst();
       }

        for(int i=0;i<idx-1;i++){

            temp=temp.next;
        }

        Node forward=temp.next.next;

        temp.next=forward;

        forward.prev=temp;

    }
}
