public class ReverseAscii {
    public static void main(String[] args) {
        
        System.out.println("-------reverse asciii -----------");
        System.out.println();

        // String str="aBcDe"; //bAdCf
       String str="bb"; //ca

       //

       char str2='a';

       char nextchar=(char)(str2-1);

       System.out.println(nextchar);

       System.out.println(StrReverseAscii(str));

    }

    public static String StrReverseAscii(String str){

        StringBuilder rev=new StringBuilder();
        for(int i=0;i<str.length();i++ ){
            char chr=str.charAt(i);
            
            if(i%2==0){

                ///type casting  as chr+1 will give a integer
                ///  by default and typecast back to char to get ascii val .   
                  
                rev.append((char)(chr+1));
            }
            else{
                rev.append((char)(chr-1));

            }
        }

        return rev.toString();
    }
}
