package Sort.SelectionSort;

public class IncreaseSort {
    
    public static void main(String[] args) {

        int [] arr={15,1,6,3,-1,2,10};
        
        arr=IncreaseSortFunc(arr);

        for(int val:arr){
            System.out.print(val+" ");
        }
    }

    // public static int [] IncreaseSortFunc(int[] arr){

    //     int minIndex=0;

    //     for(int i=0;i<arr.length;i++){

    //         for(int j=i+1;j<arr.length;j++){

    //             if(arr[j]<arr[minIndex]){
    //                 minIndex=j;
    //             }
    //         }
    //         swap(arr,minIndex,i);
    //         minIndex=i+1;
    //     }


        
    //     return arr;
    // }

    public static int[] IncreaseSortFunc(int[] arr){

        for(int i=0;i<arr.length;i++){
          int minIndex=  findMinIndex(arr,i);

          if(i!=minIndex){
            swap(arr, minIndex,i);
          }
          
        }
        return arr;
    }
    public static int findMinIndex(int[] arr ,int currentMinIndex){

        for(int i=currentMinIndex+1;i<arr.length;i++){

            if(arr[currentMinIndex]>arr[i]){
                currentMinIndex=i;
            }
        }
        return currentMinIndex;
    }
    public static int[] swap(int[] arr,int min,int i){

        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;

        return arr;
    }
}
