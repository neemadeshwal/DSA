package OOPS;

public class ConstructorOverLoading {
    
    // we can have two or more constructors with different parameters.

    String Lang;

    ConstructorOverLoading(){

        Lang="java";
    }
    ConstructorOverLoading(String language){
        Lang=language;

    }

    public void getName(){
        System.out.println("The language name is: "+Lang);
    }


   public static void main(String[] args) {

    ConstructorOverLoading lang=new ConstructorOverLoading();

    lang.getName();

    ConstructorOverLoading paramLang=new ConstructorOverLoading("Python");

    paramLang.getName();
    

   }
}
