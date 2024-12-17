package StringRecursion;

public class SubSequence {
 public static void main(String[] args) {
    
    String str="abc";
    SubSequenceFunc(str,0,"");
 }   

 public static void SubSequenceFunc(String str,int idx,String output){

    if(idx>=str.length()){
    System.out.println(output);

        return;
    }
     SubSequenceFunc(str,idx+1,output+str.charAt(idx));
    SubSequenceFunc(str,idx+1,output);

 }
}
