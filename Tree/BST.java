 class BST {
    
    public BST(){

    }

    public class Node {

       private int value;
      private  Node left;
      private  Node right;

      private int height;

        public Node(int value){
            this.value=value;
        }

        public int  getVal(){
            return value;
        }


    }
    private Node root;

    public int height(Node node){

        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){

        return root==null;
    }

    public void insert(int value){

     root= insert(value,root);
    }

    private Node insert(int value,Node node){

        if(node==null){
            return new Node(value);
        }

        if(value<node.value){
            node.left=insert(value,node.left);
        }

        if(value>node.value){
            node.right=insert(value,node.right);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    public void populate(int[] nums){

        for(int i=0;i<nums.length;i++){

            this.insert(nums[i]);
        }
    }

    public void populateBalanced(int[]nums){

        populateBalanced(nums,0,nums.length);
    }

    private void populateBalanced(int[] nums,int start , int end){
        if(start>=end) return ;

        int mid=(start+end)/2;

        this.insert(nums[mid]);

        populateBalanced(nums,start,mid);
        populateBalanced(nums,mid+1,end);

    }

    public void display(){

        display(this.root,"Root Node: ");
    }

    private void display(Node node,String string){

        if(node==null) return;
        System.out.println(string+node.value);

        display(node.left,"Left Node of "+node.value +": ");

        display(node.right,"Right Node of "+node.value+": ");
    }

    public boolean isBalanced(){

       return isBalanced(root);
    }

    private boolean isBalanced(Node node){

        if(node==null) return true;

        return Math.abs(height(node.left)-height(node.right))<=1&&isBalanced(node.left)&&isBalanced(node.right);
    }

}
