package Sort.MergeSort;

public class mergeTwoSortedArr {
    public static void main(String[] args) {
        int [] arr1={1,5,7,10};
        int [] arr2={2,3,9,12,16};

         int [] arr=MergeTwoSortFunc(arr1,arr2);

         for(int val:arr){
            System.out.print(val+" ");
         }
    }

    public static int[] MergeTwoSortFunc(int[]arr1,int[]arr2){
        
        int [] arr= new int[arr1.length+arr2.length];
        int i1=0;
        int i2=0;
        int k=0;

       

         while(i1<arr1.length&&i2<arr2.length){

         
            if(arr1[i1]<arr2[i2]){
                arr[k]=arr1[i1];
                i1++;
                k++;
            }
            else{
                arr[k]=arr2[i2];
                i2++;
                k++;
           }
        }

           // if b is exhausted

           while(i1<arr1.length){
            arr[k]=arr1[i1];
            i1++;
            k++;
           }

           while(i2<arr2.length){
            arr[k]=arr2[i2];
            i2++;
            k++;
           }
        

           

        return arr;
    }
}
