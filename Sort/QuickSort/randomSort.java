package Sort.QuickSort;

public class randomSort {

    public static int[] swap(int[]arr,int i,int j){
        int temp=arr[i];

        arr[i]=arr[j];
        arr[j]=temp;

        return arr;

    }

    public static int partition(int[]arr,int l,int r,int pi){

        int pivot=arr[pi];
        swap(arr,pi,r);

        int m=l;

        for(int i=l;i<r;i++){

            if(arr[i]<pivot){
             swap(arr,i,m);
                m++;
            }

        }
        swap(arr,m,r);

        return m;
    }

    public static void mergeSort(int[]arr){
        f(arr,0,arr.length-1);
    }

    public static int randomVal(int l,int r){

        return (int)Math.random()*(r-l)+r;
    }

    public static void f(int[]arr,int l,int r){
        
        if(l>r)return;

        int pi=randomVal(l, r);

        int x=partition(arr, l, r, pi);

        
        f(arr, l, x-1);
        f(arr,x+1,r);


        

    }

    public static void main(String[] args) {
        int []arr={4,2,7,11,2,-3,6,8,0};

        mergeSort(arr);


        for(int val:arr){
            System.out.print(val+" ");
        }

    }

  
}
