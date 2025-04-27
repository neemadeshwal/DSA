 class AVL {

    public AVL(){

    }

    public class  Node {
    
        private int value;

        private Node left;

        private Node right;

        private int height;


        public int getVal(){
            return this.value;
        }

        public Node(int value){
            this.value=value;
        }
        
    }

    private Node root;

    public int height(){

        return height(root);
    }

    public int height(Node node){

        if(node==null) return -1;


        return node.height;
    }

    public void insert(int val){
     
      
        root=insert(root,val);

    }

    private Node insert(Node node,int val){

        if(node==null){
            return new Node(val);
        }

        if(val<node.value){
 
            node.left=insert(node.left, val);

        }

        if(val>node.value){

            node.right=insert(node.right, val);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;

        return rotate(node);
    }

    private Node rotate(Node node){


        //left heavy
        if(height(node.left)-height(node.right)>1){

           //left left heavy

           if((height(node.left.left)-height(node.left.right))>0){

            return rightRotate(node);
           }
           
           //left right heavy

           if((height(node.left.left)-height(node.left.right))<0){
            node.left=leftRotate(node);

            return rightRotate(node);
           }
        }
         //right heavy
        if(height(node.left)-height(node.right)<-1){

         // right right heavy

         if(height(node.right.left)-height(node.right.right)<0){
           return leftRotate(node);
         }

         // right left heavy

         if(height(node.right.left)-height(node.right.right)>0){
            node.right=rightRotate(node);
            return leftRotate(node);
         }
        }
        return node;
        
    }

    private Node leftRotate(Node c){

        Node p=c.right;

        Node t=p.left;

        p.left=c;
        c.right=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;

        return p;
    }

    private Node rightRotate(Node p){

        Node  c=p.left;

        Node t=c.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;

        return c;

    }
    public void populate(int[] nums){

        for(int i=0;i<nums.length;i++){

            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
      }

      private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
          return;
        }
    
        int mid = (start + end) / 2;
    
        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
      }

      public void display() {
        display(this.root, "Root Node: ");
      }
    
      private void display(Node node, String details) {
        if (node == null) {
          return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
      }


    

}
