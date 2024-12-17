package Backtracking;

public class PermutationByRecursion {
    
    public static void main(String[] args) {

        String str="abc";
        
        recursePermFunc(str,0,"");
    }

    public static void recursePermFunc(String str,int idx,String output){

        if(idx>=str.length()) {
            System.out.println(output);
            return;
        }

        recursePermFunc(str.substring(idx), idx+1, output+str.charAt(idx));
    }
}
