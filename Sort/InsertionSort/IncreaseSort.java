package Sort.InsertionSort;

public class IncreaseSort {
    public static void main(String[] args) {
        
        int [] arr={9,2,12,6,15,7};

        arr=IncreaseSortFunc(arr);

        for(int val:arr){
            System.out.print(val+" ");
        }
    }

    public static int [] IncreaseSortFunc(int [] arr){
             


      for(int i=1;i<arr.length;i++){
        int j=i-1; // we want to go to the left side of the array and insert the current element at current position;
       int  currentElement=arr[i];
           System.out.println(currentElement+" curent");
        while(j>=0&&arr[j]>currentElement){
            arr[j+1]=arr[j];
            j--;

           
        }
        System.out.println(currentElement+" curent");

        arr[j+1]=currentElement;
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
      }
      return arr;


    }
}
