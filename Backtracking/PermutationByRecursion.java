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

        for (int idx = 0; idx < str.length(); idx++) {

            String roq = str.substring(0, idx) + str.substring(idx + 1);

            recursePermFunc(roq, output + str.charAt(idx));

        }
    }
}
