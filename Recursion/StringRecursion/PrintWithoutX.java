package StringRecursion;

public class PrintWithoutX {
 
    public static void main(String[] args) {

        String s="abcxxadxacxe";

        // ----------first appraoch -----------------
        
      //  System.out.println(PrintWithoutXFunc(0,s));

    //  PrintWithoutXFunc2(0,s);

    PrintWithoutX3Func(0, s, "");
    }
   //--------- first appraoch--------
    public static String PrintWithoutXFunc(int idx,String s){


        if(idx>=s.length()) return "";

        if(s.charAt(idx)=='x'){
      return PrintWithoutXFunc(idx+1, s);

        }

      return s.charAt(idx)+PrintWithoutXFunc(idx+1, s);




    }

    // --------second approach------------

    public static void PrintWithoutXFunc2(int idx, String  s){
       
        if (idx>=s.length()) return;

        if(s.charAt(idx)!='x') {
                
            System.out.print(s.charAt(idx));
        }

        PrintWithoutXFunc2(idx+1, s);
        

    }
   
    // --------third approach----------------

    public static void PrintWithoutX3Func(int idx,String s,String output){


        if(idx>=s.length()) {
        System.out.println(output);
        return;

        }

        if(s.charAt(idx)!='x'){
            output+=s.charAt(idx);
        PrintWithoutX3Func(idx+1, s, output);

        }
        else{
        PrintWithoutX3Func(idx+1, s, output);

        }


    }

}
