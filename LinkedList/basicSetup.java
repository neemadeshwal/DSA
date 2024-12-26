

public class basicSetup{

    class Node{

        int data;

        Node next;

        Node(int data){
            this.data=data;
        }
    }
    Node head;

    public void display(){

         System.out.println("--------------------------");

         Node temp=this.head;

         while(temp!=null){
            System.out.println(temp.data);


            temp=temp.next;
         }
    }

    public display addNodeAtStart(data){

        Node nn=new Node(data);

        nn.next=this.head;

        this.head=nn;
    }

    public void addAtIndex(int data,int idx){
        if(idx<0) return;

        if(idx==0) addNodeAtStart(data);

        Node nn=new Node(data);

        Node temp=this.head;

        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }

        Node forward=temp.next;
        temp.next=nn;

        nn.next=forward;


    }

    public int removeAtFirst(){
        if(this.head)==null return;

        int rv=this.head.data;
        this.head=this.head.next;

        return rv;
    }

    public int removeAtEnd(){
        Node temp=this.head;

        while(temp.next.next!==null){
            temp=temp.next;
        }

        int rv=temp.next.data;
        temp.next=null;
        return rv;
    }

public int removeAtIdx(){
     if(idx<0) return;

        if(idx==0) removeAtFirst();

        Node temp=this.head;

        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        int rv= temp.next.data;
        temp.next=temp.next.next;

}
    public static void main(String args[]){
        System.out.println("---------------");
   
    }
}