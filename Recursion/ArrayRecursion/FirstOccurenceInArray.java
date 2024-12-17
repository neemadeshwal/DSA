package ArrayRecursion;

public class FirstOccurenceInArray {
 public static void main(String[] args) {

    int[] arr={3,2,7,6,5,7,6,7};
    int element=7;

    System.out.println(FirstOccurenceInArrayFunc(arr,0,element));
 }  
 
 public static int  FirstOccurenceInArrayFunc (int [] arr,int idx,int element){

     if(arr.length-1==idx) return -1;
    

    if(element==arr[idx]) return idx;

    else return FirstOccurenceInArrayFunc(arr,idx+1,element);
    
 }
}
