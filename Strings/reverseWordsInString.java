public class reverseWordsInString {
    public static void main(String[] args) {
        
         String s = " the   sky   is   blue ";
         System.out.println(s);
        
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        String ns=" ";

        String [] sArr=s.split("\\s+ ");
        int x=0;
        int y=sArr.length-1;

        //use arraylist instead for shorter and reverse function in that

        // List<String> wordList=Array.asList(s.split("\\s+"));

        //Collections.reverse(wordList);

       while(x<y){

        String temp=sArr[x];

         sArr[x]=sArr[y];
         sArr[y]=temp;
         x++;
         y--;
       }

       ns=String.join(" ", sArr);

      
       
 
        return ns;
    }
}
