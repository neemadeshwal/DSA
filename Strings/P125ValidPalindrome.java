public class P125ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan,! a canal: Panama";
        System.out.println(isValidPalindrome(s));


    }

    public static Boolean isValidPalindrome(String s){
       Boolean isPalindrome=true;


       ///------------------ first approch---------------

    //    String[] newStr=s.trim().split("[^a-zA-Z0-9]");

    //    String news=String.join("",newStr).toLowerCase();

    //    System.out.println(news);

    //    int st=0;
    //    int l=news.length()-1;
        
    //    while(st<l){

    //     if(news.charAt(st)!=news.charAt(l)){

    //         isPalindrome=false;
    //     }
    //     st++;
    //     l--;
    //    }



    /// -----------second approch---------------
    
    for(int i=0, j=s.length()-1;i<j;i++,j--){

        while(i<j&&!Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }
        while (i<j&&!Character.isLetterOrDigit(s.charAt(j))) {
            j--;
            
        }

        if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
            isPalindrome=false;
        }
    }
    


       return isPalindrome;
    }
}
