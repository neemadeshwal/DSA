
import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        BinaryTree bt=new BinaryTree();

        // bt.populate(scanner);

        // bt.display();

        BST bst=new BST();

        int[] nums={3,42,8,23,89,33,22,1};

        // bst.populate(nums);

        int[] nums2={1,2,3,4,5,6,7,8,9};

        bst.populate(nums2);

       

        System.out.println();

        BST bstBalanced=new BST();


        bstBalanced.populateBalanced(nums2);

        AVL avl=new AVL();

      avl.populate(nums2);


      Segment s=new Segment(nums2);

      s.display();

      System.out.println(s.query(1, 4));

      s.update(1,10000);

      s.display();
    



    }


}
