package vehicle;

public class Train implements IVehicle,IPublicTransport {
    @Override
    public void drive() {
        System.out.println("The train is in driving mode");
    }
    public void turnLeft() {
        System.out.println("train turned left");
    }

    public void brake()
    {
        System.out.println("The train is in brake mode");
    }

    @Override
    public void getNumberOfPeople() {
        System.out.println("The train's people()");
    }
}
