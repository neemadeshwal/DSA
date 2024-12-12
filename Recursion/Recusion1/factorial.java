 class factorial {
    public static int f(int n){

        //base case f(n)=1

        if(n==1){
            return 1;
        }


        //int assumption

        int assumption=f(n-1); //function works correctly for (n-1)

        return n*assumption;

        

    }
    public static void main(String[] args) {

        System.out.println(f(5));
        
    }
}
