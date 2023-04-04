package vehicle;

public class Car extends MotorisedVehicle implements IVehicle
{
    @Override
    public void drive() {
        System.out.println("The car is in driving mode");
    }
    @Override
    public void turnLeft() {
        System.out.println("Car turned left");
    }

    public void brake()
    {
        System.out.println("The car is in brake mode");
    }
}
