package Sort.BubbleSort;

public class KthLargestSort {
    public static void main(String[] args) {
    int [] arr={1,2,3,12,9,8,4,7};
    int k=6;
        
        System.out.println(KthLargestSortFunc(arr,k));
    }

    public static int KthLargestSortFunc(int [] arr,int k){

        int kpos=arr.length-k;

        System.out.println(kpos);

        for(int i=0;i<k;i++){

         for(int j=0;j<arr.length-1;j++){

            if(arr[j]>arr[j+1]){

                swap(arr,j,j+1);

                
            }

         }
         for(int val:arr){
            System.out.print(val+" ");
         }
        System.out.println();

        
        }
        System.out.println();

        System.out.println(kpos);

        return arr[kpos];
    }
    public static int[] swap(int[] arr,int min,int i){

        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;

        return arr;
    };

}
