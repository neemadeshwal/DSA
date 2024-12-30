public class LinkedList {

    class Node{

        int data;

        Node next;

        Node(int data){
            this.data=data;
        }

        
    }
    Node head;

    public void display(){

        Node temp=this.head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void addStart(int data){

        // create new node

        Node nn=new Node(data);

        nn.next=this.head;

        this.head=nn;

    }
    
     public void addLast(int data){

        Node nn=new Node(data);

        Node temp=this.head;

        while(temp.next!=null){

            temp=temp.next;
        }

        temp.next=nn;

        nn=null;
     }

     public void addAtIndex(int data,int idx){

        if(idx<0) return;

        if(idx==0)  addStart(data);


        Node temp=this.head;

        Node nn=new Node(data);

        for(int i=0;i<idx-1;i++){

            temp=temp.next;
        }

        Node forward=temp.next;

        temp.next=nn;

        nn.next=forward;

        



        
     }
 
     public void removeAtStart(){

        if(this.head==null) return;


        this.head=this.head.next;
   }

     public void removeAtEnd(){

        Node temp=this.head;
 
        while(temp.next.next!=null){

            temp=temp.next;
        }
        temp.next=null;

     }

     public void removeAtIdx(int idx){
        if(idx<0) return;

        if(idx==0) removeAtStart();

        Node temp=this.head;

        for(int i=0;i<idx-1;i++){

            temp=temp.next;
        }

        temp.next=temp.next.next;
     }

     public void ReverseLinkedList(){

     
        Node prev=null;
        Node current=this.head;

        while(current!=null){

            Node next=current.next;

            current.next=prev;

            prev=current;
            current=next;
        }
        this.head=prev;
     }
  
     public void ReverseLinkdListWithRecursion(Node prev,Node curr){

        if(curr==null) {
        
            this.head=prev;
            return;
        };

        Node next=curr.next;

        curr.next=prev;

        prev=curr;
        curr=next;

        ReverseLinkdListWithRecursion(prev, curr);
     }
    
     public int FindMiddleElement(){

        if(this.head.next==null) return -1;

         Node temp=this.head;
         int count=0;

         while(temp.next!=null){
           
        
         temp=temp.next;
         count=count+1;
         System.out.println(count+" count in loop");


         }

         count=count+1;

         
         int middleIdx=count/2;

         System.out.println(middleIdx+" middleidx");

         Node tempVal=this.head;

         for(int i=1;i<=middleIdx;i++){

            tempVal=tempVal.next;
            
         }
         System.out.println(tempVal.data);

         return tempVal.data;
     }
    }
