public class DecreaseOrder {
    public static void main(String[] args) {
        // DecreaseOrderFunc(6);
        IncreaseOrderFunc(10);
    }

    public static void DecreaseOrderFunc(int n) {
        if (n == 0)
            return; // do nothing as 0 is not a natural number.

        System.out.println(n);
        DecreaseOrderFunc(n - 1);
    }

    public static void IncreaseOrderFunc(int n) {
        if (n == 0) {
            return;
        }
        IncreaseOrderFunc(n - 1);
        System.out.println(n);
    }
}
