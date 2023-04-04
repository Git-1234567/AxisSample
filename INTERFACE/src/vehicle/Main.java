package vehicle;

public class Main {
    public static void main(String[] args) {
        //for car
        IVehicle i1=new Car();
        i1.brake();
        i1.drive();
        i1.turnLeft();
        MotorisedVehicle m1=new Car();
        m1.checkMotor();

        Car c=new Car();
        c.brake();
        c.drive();
        c.turnLeft();
        c.checkMotor();

        System.out.println();
        //for train
        i1=new Train();
        i1.brake();
        i1.drive();
        i1.turnLeft();
        IPublicTransport i2=new Train();
        i2.getNumberOfPeople();
    }
}
