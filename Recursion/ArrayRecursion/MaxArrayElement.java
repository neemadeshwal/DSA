package ArrayRecursion;

public class MaxArrayElement {
    public static void main(String[] args) {
        int [] arr={3,1,6,9,21,0,-4};
        System.out.println(maxElementFunc(arr,0));
    }

    public static int maxElementFunc(int [] arr,int idx){

        if(idx==arr.length-1) return arr[idx];

        return  Math.max(arr[idx],maxElementFunc(arr, idx+1));

    }
}
