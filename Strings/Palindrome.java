public class Palindrome{

    public static void main(String[] args) {
        
        String str="naman";  //true
       // String str="hello";  //false

        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){

        int s=0;
        int l=str.length()-1;

        while(s<l){
             System.out.println(s+" : "+l);
            if(str.charAt(s)!=str.charAt(l)){
                return false;
            }
            s++;
            l--;
           
        }
        return true;

    }
}