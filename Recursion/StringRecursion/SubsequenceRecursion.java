package StringRecursion;

public class SubsequenceRecursion {

    public static void main(String[] args) {

        String str = "abc";

        SubsequenceRecursionFunc(str, 0);

    }

    public static void SubsequenceRecursionFunc(String str, int n) {

        if (n >= str.length())
            return;

        // when the first element is absent

        System.out.println(str.substring(n, n));

        System.out.println(str.charAt(n));
    }
}
