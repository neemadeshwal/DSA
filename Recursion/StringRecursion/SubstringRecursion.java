package StringRecursion;

public class SubstringRecursion {

    public static void main(String[] args) {

        ///// this works for substring but for subsequence ther is differnet appraoch in the next file.

        String str = "abc";
        System.out.println(str.substring(0, 0));
        SubstringRecursionFunc(str, 0, 0);

    }

    public static void SubstringRecursionFunc(String str, int rows, int cols) {

        if (rows >= str.length())
            return;

        if (cols > str.length()) {
            SubstringRecursionFunc(str, rows + 1, rows + 1 + 1);
            return;
        }
        System.out.println(str.substring(rows, cols));
        SubstringRecursionFunc(str, rows, cols + 1);

    }
}
