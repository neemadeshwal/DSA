package OOPS;

public class BicycleExampleClass {
    
    private int gear=5;

    public void Braking(){
        System.out.println("applying brakes........");
    }

    public int getGearVal(){
        return this.gear;
    }

    public void setGearVal(int gearVal){
        this.gear=gearVal;
    }

    public static void main(String[] args) {

        //create object--objects are basically instance of the class..

        // here BicycleExampleClass() is a constructor.
        
        BicycleExampleClass myBike=new BicycleExampleClass();
  
        // eg:- Mountain bicycle,touring bicycle,sports bicycle.
        myBike.Braking();

        myBike.gear=10;

        System.out.println("Number of gears :"+myBike.gear);
    }
}
