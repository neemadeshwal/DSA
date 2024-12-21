package StringRecursion;

public class P17LetterCombinations {

    
     public static void main(String[] args) {
       
        String s = "23"; 

        // Convert the string to an integer 
        // using Integer.parseInt()

   
        LetterCombineFunc(s,0,"");

     }

     public static void LetterCombineFunc(String str,int idx,String output){
        String [] ls= {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        if(idx>=str.length()){
            System.out.println(output);
            return;
        }

        LetterCombineFunc(str, idx+1, output);

        //////////////////// pending ........................
     }
}