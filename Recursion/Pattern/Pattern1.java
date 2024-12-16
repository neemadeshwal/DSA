package Pattern;

public class Pattern1 {

    //------------first approach ------------

    //---------------------------------------

    //--------------------------------------

//  public static void main(String[] args) {

//     int n=4;

//     printStarVertical(n,n);
    
//  }   
//  public static void printStarVertical(int n,int x){

//     if(n==0) return;

//    printStarHorizontal(x);
//    System.out.println();
//    printStarVertical(n-1,x);
//  }

//  public static void printStarHorizontal(int n){
//     if(n==0) return;
//     System.out.print("*");
//     printStarHorizontal(n-1);
//  }

//-----------second appraoch -----------

//-------------------------------------

//-------------------------------------

public static void main(String[] args) {
    int n=4;
    printPattern(1,1,n);
}

public static void printPattern(int rows,int cols,int stars){

   if(rows>stars) return; //all rows are already printed
 
   if(cols>stars) {  //everything is printed in the current row
    System.out.println(); //new line before going to next row
    printPattern(rows+1, cols=1, stars);  // all cols are printed need to move to new row

    return;
   }
   System.out.print("*");
   printPattern(rows, cols+1, stars); //move to next col

}
}
