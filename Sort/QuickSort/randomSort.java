package Sort.QuickSort;

public class randomSort {

    public static void main(String[] args) {
        int []arr={4,2,7,11,2,-3,6,8,0,2};

        int p=partition(arr,0,arr.length-1,6);

        for(int val:arr){
            System.out.print(val+" ");
        }
        
        System.out.println();

        System.out.println(p+": P ");
    }

    public static int partition(int[]arr,int l,int m,int pi){

    int pivot=arr[pi];

    swap(arr,pi,m);

    int x=l;

    for(int i=l;i<=m-1;i++){

        if(arr[i]<pivot){

            swap(arr,i,x);
            x++;

        }
    }
    swap(arr,l,m);
    return m;
    }

    public static void swap(int[]arr,int i,int j){

        int temp;

        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
  


}
