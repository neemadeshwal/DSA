package Sort.MergeSort;
public class sortArray {
 
    public static void main(String[] args) {
        
       int[]arr={10,9,8,7,6,5,4,3,2,1};

       mergeSort(arr);


    //    for(int val:arr){
    //        System.out.print(val+" ");
    //    }

    

       
    }

    public static void mergeSort(int [] arr){
        f(arr,0,arr.length-1);
    }

    public static void f(int[]arr,int start,int end){
        if(end<=start) return;

        int mid=(start+end)/2;


        f(arr, start, mid);
        f(arr,mid+1,end);
        merge(arr,start,mid,end);
    
    }
    public static void merge(int[]arr,int start,int mid,int end){
        int[] left=new int[mid-start+1];
        int [] right=new int[end-mid];

        int k=0;

        for(int i=start;i<=mid;i++){

            left[k++]=arr[i];
        }

         k=0;
        for(int i=mid+1;i<=end;i++){
            right[k++]=arr[i];
        }
        int [] result=MergeTwoSortFunc(left,right);

        k=0;

        for(int i=start;i<=end;i++){
            arr[i]=result[k++];
        }



        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println();
 

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

