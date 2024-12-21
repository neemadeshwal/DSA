package Sort.BubbleSort;

public class IncreaseSort {

    public static void main(String[] args) {
    int [] arr={1,2,3,12,9,8,4,7};
        
     arr=IncreaseSortFunc(arr);

     for(int val:arr){
        System.out.print(val+" ");
     }
    
    }

    public static int[] IncreaseSortFunc(int [] arr){

        for(int i=0;i<arr.length-1;i++){

        for(int j=0;j<arr.length-i-1;j++){

            if(arr[j]>arr[j+1]){
                swap(arr, j, j+1);
            }
        }
        }
        return arr;
    }

    public static int[] swap(int[] arr,int min,int i){

        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;

        return arr;
    };


}
