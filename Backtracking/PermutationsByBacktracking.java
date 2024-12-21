package Backtracking;

public class PermutationsByBacktracking {
    public static void main(String[] args) {
         String str="abc";

         PermutationsByBacktrackingFunc(str,0,str.length()-1);
    }

    public static void PermutationsByBacktrackingFunc(String str,int l ,int r){
        System.out.println(str+" : final position before ");
         
          if(l==r){
            System.out.println(str+" : final position ");

            System.out.println();
            return;
          }

          for(int i=l;i<=r;i++){
            //do
            System.out.println(str+" : at first position before"+" "+i+","+l);

            str=swap(str,l,i);
            System.out.println(str+" : at first position after"+" "+i+","+l);

            //recurse
            PermutationsByBacktrackingFunc(str,l+1,r);

            //undo 
            System.out.println(str+" : at second position before"+" "+i+","+l);

             str=swap(str,l,i);
            System.out.println(str+" : at second position after"+" "+i+" "+l);


          }
    }

    public static String swap(String str,int j,int i){
         
        char temp;

        char [] stArr=str.toCharArray();

        temp=stArr[i];

        stArr[i]=stArr[j];

        stArr[j]=temp;

        return String.valueOf(stArr);


    


       


    }
}
