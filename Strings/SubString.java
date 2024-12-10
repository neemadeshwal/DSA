public class SubString {
    public static void main(String[] args) {
        System.out.println("-----Substrings-----");
        
        // String str="hello"; //output-h,he,hel,hell,hello,e,el,ell,ello,l,ll,lo,o
        String str="code";


        /// first-approch 

    //     int s=0;

    //     StringBuilder oldVal=new StringBuilder(str);


    //     while(s<str.length()){
    //         int x=0;

    //         StringBuilder sb=new StringBuilder();
  
    //         while(x<oldVal.length()){

    //             sb.append(oldVal.charAt(x));
    //             System.out.print(sb+", ");
    //             x++;
    //         }
    //         oldVal.deleteCharAt(0);

    //         s++;

 
    // }

    // second and better  approach

    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<=str.length();j++){
            System.out.print(str.substring(i,j)+", ");
        }
    }

    }
}
