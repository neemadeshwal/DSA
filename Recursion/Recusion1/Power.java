public class Power {
    public static void main(String[] args) {
        System.out.println(RaisePower(5, 6));
    }

    // use 0 instead of 1 bcoz if the b is 0 then you can never recurse it to one as
    // you cant go low to high
    // but high to low is what recusion logic is all about.
    public static int RaisePower(int a, int b) {
        if (b == 0)
            return 1;

        return a * RaisePower(a, b - 1);

    }
}
