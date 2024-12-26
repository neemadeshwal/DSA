package BinarySearch;

public class P162PeakElement {
    
    public static void main(String[] args) {
        
        int nums[]={1,2,1,3,5,6,4};

        System.out.println(PeakElementFunc(nums));


    }

    public static int PeakElementFunc(int[] nums){

        int left=0;
        int right=nums.length-1;

        while(left<right){

            if(left==right) return left;

            int mid=(left+right)/2;

            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }

        


        }
        return left;

    }
}
