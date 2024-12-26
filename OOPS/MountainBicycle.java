package OOPS;

public class MountainBicycle {
 
    public static void main(String[] args) {
        
        BicycleExampleClass mountainBike=new BicycleExampleClass();

        /// since gear is private in the class therefore we cant use it in another class without the use of
       /// System.out.println(mountainBike.gear);
        
        /// settter and getter function..............

        // first we will set the new gear 
        mountainBike.setGearVal(10);

        // then we will get or access the new gear....

       System.out.println( mountainBike.getGearVal());


    }
}
