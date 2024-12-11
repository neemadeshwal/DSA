public class P1903LargestOddNum {
    public static void main(String[] args) {
        String num="42592";

        System.out.println(LargestOdd(num));


    }

    public static String LargestOdd(String num){
        String largeOddNum="";

        ///-----first approach--------

    //    for(int i=0;i<num.length();i++){
    //     for(int j=i+1;j<num.length();j++){

    //         String s=num.substring(i, j);
            

    //         int sn=Integer.parseInt(s);

    //         if(sn%2!=0){
    //             int newVal=Integer.max(Integer.parseInt(largeOddNum!=""?largeOddNum:"0"), sn);

    //             largeOddNum=Integer.toString(newVal);
    //         }

    //     }
    //    }


    // ----------optimized approach----------

       //// dicery appoarach
    for(int i=num.length()-1;i>=0;i--){

        if(num.charAt(i)%2!=0){
            largeOddNum= num.substring(0, i+1);

            return largeOddNum;
        }
    }
        return "";
    }
}
