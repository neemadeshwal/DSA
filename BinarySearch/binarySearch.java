package BinarySearch;

public class binarySearch {
    
    public static void main(String[] args) {
        
        int[] arr={2,4,6,8,10};

       System.out.println( binarySearchFunc(arr, 10));



        

    }

    public static int binarySearchFunc(int[]arr,int element){

        int left=0;
        int right=arr.length-1;

        while(left<right){

            int mid=left+right/2;

            if(arr[mid]==element){

                return mid;

            }
            else{

                if(arr[mid]<element){

                    left=mid+1;

                }
                else{

                    right=mid-1;

                }
            }
        }

        return -1;

    }
}
