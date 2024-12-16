package ArrayRecursion;

public class SumArrayElement {
    public static void main(String[] args) {
    int [] arr={3,1,6,9,21,0,-4};

        System.out.println(sumArrayFunc(arr,0));
    }
    public static int sumArrayFunc(int [] arr,int idx){
             
        if(idx==arr.length-1) return arr[idx];

        return arr[idx]+sumArrayFunc(arr, idx+1);
    }
}
