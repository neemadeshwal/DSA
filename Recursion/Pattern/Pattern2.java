package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(1,1,4);
    }
    public static void pattern2(int rows,int cols,int n){
        if(rows>n) return; //all rows are done.

        if(cols>n-rows+1){
            System.out.println();

            pattern2(rows+1, cols=1, n);
            return;
        }
        System.out.print("*");

        pattern2(rows, cols+1, n);
    }
}
