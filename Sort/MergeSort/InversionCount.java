package Sort.MergeSort;

public class InversionCount {

    public static void main(String[] args) {

        int []arr={5,8,10,11,15,18,2,6,13,14,19};

        int []count={0};

        

        mergeSortRecurse(arr,0,arr.length-1,count);

         for(int val:arr){
            System.out.print(val+" ");
         }

         System.out.println("count : "+count[0]);
        
    }
    public static void mergeSortRecurse(int[]arr,int start,int end,int[] count){

        if(end<=start) return ;
        int mid=(start+end)/2;

       mergeSortRecurse(arr, start, mid, count);
       mergeSortRecurse(arr, mid+1, end,count);

       mergeArr(arr,start,mid,end,count);

    }

    public static void  mergeArr(int[]arr,int start,int mid,int end,int[] count){

        int[]left=new int[mid-start+1];

        int [] right=new int[end-mid];

        int k=0;

        for(int i=start;i<=mid;i++){
            left[k++]=arr[i];
        }

        k=0;

        for(int i=mid+1;i<=end;i++){
            right[k++]=arr[i];
        }

       int[] result= mergeLeftRightArr(left,right,count);

        k=0;

        for(int i=start;i<=end;i++){
            arr[i]=result[k++];
        }

       



    }

    public static int[] mergeLeftRightArr(int[]left,int[]right,int[] count){

        int m=left.length;
        int n=right.length;

        int []result=new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while (i<m&&j<n) {
            
            if(left[i]<right[j]){
               result[k]=left[i++];
            }
            else{

                result[k]=right[j++];
                count[0]+=m-i;
            }

            k++;
        }

        while (i<m) {
            
            result[k++]=left[i++];
        }

        while(j<n){
            result[k++]=right[j++]; 
        }
        return result;

    }



    
}

