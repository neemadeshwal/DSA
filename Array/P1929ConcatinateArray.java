package Array;

public class P1929ConcatinateArray {
    
    public static int[] getConcatenation(int[] nums) {

        int[] ans=new int[2*nums.length];

        for(int i=0;i<2*nums.length;i++){

          ans[i]=nums[i%nums.length];

             
        }
        return ans;
        
    }

    public static void main(String[] args) {

     int[] nums={1,2,1};

     int[] ans=getConcatenation(nums);

     for(int val:ans){
        System.out.print(val+" ");
     }


        

    }
}
