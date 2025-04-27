package Array;

public class P1480SumArray {
    public static int[] runningSum(int[] nums) {
        
        for(int i=1;i<nums.length;i++){



        nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        
       for(int val:nums){
        System.out.print(val+" ");
       }

       System.out.println();

       runningSum(nums);

       for(int val:nums){
        System.out.print(val+" ");
       }

       


    }
}
