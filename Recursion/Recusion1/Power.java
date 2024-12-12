public class Power {
    public static void main(String[] args) {
        System.out.println(RaisePower(5,6));
    }
    public static int RaisePower(int a,int b){
            if (b==1) return a;

            return a*RaisePower(a, b-1);

    }
}
