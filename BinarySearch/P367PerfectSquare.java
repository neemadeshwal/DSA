package BinarySearch;

public class P367PerfectSquare {

    
    public static void main(String[] args) {
        
        int num=808201;

        System.out.println(isPerfectSquare(num));

    }

    public static boolean isPerfectSquare(int num){
         
        if(num==0||num==1) return true;

        int left=0;
        int right=num;
        
        while(left<=right){

            int mid=left+((right-left)/2);

           
               long halfSquare= (long) mid * mid;



            if(halfSquare==num){

                return true;
            }
           else if((halfSquare)>num){
             right=mid-1;
           }
           else{
            left=mid+1;
           }
        }
        return false;
    }
}