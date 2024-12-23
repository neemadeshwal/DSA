package Backtracking;

public class PermutationByRecursion {

    public static void main(String[] args) {

        String str = "abc";

        recursePermFunc(str, "");
    }

    public static void recursePermFunc(String str, String output) {

        if (str.length() == 0) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            String roq = str.substring(0, i) + str.substring(i + 1);

            recursePermFunc(roq, output + str.charAt(i));
        }

    }
}
