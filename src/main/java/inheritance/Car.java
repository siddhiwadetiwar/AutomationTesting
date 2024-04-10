package inheritance;

//super class
class Car {
 // the Car class have one field
 public String wheelStatus;
 public int noOfWheels;

 // the Car class has one constructor
 public Car(String wheelStatus, int noOfWheels)
 {
     this.wheelStatus = wheelStatus;
     this.noOfWheels = noOfWheels;
 }

 // the Car class has three methods
 public void applyBrake()
 {
     wheelStatus = "Stop";
       System.out.println("Stop the car using break");
 }

 // toString() method to print info of Car
 public String toString()
 {
     return ("No of wheels in car " + noOfWheels + "\n"
             + "status of the wheels " + wheelStatus);
 }
}

//sub class
class Honda extends Car {

 // the Honda subclass adds one more field
 public Boolean alloyWheel;

 // the Honda subclass has one constructor
 public Honda(String wheelStatus, int noOfWheels,
              Boolean alloyWheel)
 {
     // invoking super-class(Car) constructor
     super(wheelStatus, noOfWheels);
     this.alloyWheel = alloyWheel;
 }

 // the Honda subclass adds one more method
 public void setAlloyWheel(Boolean alloyWheel)
 {
     this.alloyWheel = alloyWheel;
 }

 // overriding toString() method of Car to print more
 // info
 @Override public String toString()
 {
     return (super.toString() + "\nCar alloy wheel "
             + alloyWheel);
 }
}

