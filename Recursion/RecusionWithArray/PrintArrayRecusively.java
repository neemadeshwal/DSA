package RecusionWithArray;

public class PrintArrayRecusively {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 5, 7, 4, 7 };

        printArray(arr, 0);

    }

    public static void printArray(int[] arr, int idx) {

        if (idx >= arr.length)
            return;
        System.out.println(arr[idx]);

        printArray(arr, idx + 1);

    }
}
