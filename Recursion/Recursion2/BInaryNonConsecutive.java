package Recursion2;

public class BInaryNonConsecutive {
    public static void main(String[] args) {
        System.out.println("Binary non consecutive");

        System.out.println(PrintConsecutive(4));
    }

    public static int PrintConsecutive(int x) {

        if (x == 1)
            return 2;

        if (x == 2) {
            return 3;
        }

        return PrintConsecutive(x - 1) + PrintConsecutive(x - 2);
    }
}
