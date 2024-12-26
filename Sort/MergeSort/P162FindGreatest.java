package Sort.MergeSort;

public class P162FindGreatest {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 1, 3, 5, 6, 4 };

        System.out.println(PeakElement(nums));
    }

    public static int PeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {

                left = mid + 1;
            }
        }
        return left;
    }

}