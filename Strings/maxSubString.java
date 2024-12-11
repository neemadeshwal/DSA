public class maxSubString {
    public static void main(String[] args) {
        System.out.println("---maxSubString---");

        String str="fkdjalsndjl";

       


        // for(int i=0;i<str.length();i++ ){
        //    for(int j=str.length()-1;j>i;j--){
              
        //      if(str.charAt(i)==str.charAt(j)){
        //         System.out.println(str.substring(i+1, j)); 
        //         break;
        //      }
        //    }   
        // }
     
       // accepted and optimized approcah

       int [] arr=new int[26];

       int maxlen=-1;


       for(int i=0;i<str.length()-1;i++){

        int idx=str.charAt(i)-'a';

        if(arr[idx]>0){
            
            maxlen=Math.max(maxlen, i-arr[idx]);
        }
        else{
            arr[idx]=i+1;
        }
       }
       System.out.println(maxlen);
    
        
    }
}
