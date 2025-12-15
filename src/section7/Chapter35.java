package section7;

public class Chapter35 {
    public static void main(String[] args) {
        CarInterface car = new Sedan();
        car.stepOnAccel(10);
        car.stepOnBrake();

        //CarInterface carInterface = new CarInterface();

        drive(new SuperCar());
    }

    public static void drive(CarInterface car) {
        car.stepOnAccel(20);
        car.stepOnBrake();
    }
}
