public class StringBuilders {

    public static void main(String[] args) {
        
        String str="hello";

        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder(str);


        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb2);

        //append

        sb.append("new world.");
        System.out.println(sb);

        sb2.append("world");
        System.out.println(sb2);

        //insert 
        //range->0->length

        sb.insert(0,"hello");
        sb.insert(sb.length(), " new outlook of new world.");

        System.out.println(sb);

        //setCharAt

        sb.setCharAt(0,'w');
        System.out.println(sb);

        String convertToString=sb.toString();

        System.out.println(convertToString);
    }
    
}
