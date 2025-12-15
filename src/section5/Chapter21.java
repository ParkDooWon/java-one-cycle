package section5;

public class Chapter21 {
    public static void main(String[] args) {
        Bike bike1 = new Bike(20);
        Bike bike2 = new Bike(30);

        System.out.println("bike1.maxSpeed : " + bike1.maxSpeed);
        System.out.println("bike2.maxSpeed : " + bike2.maxSpeed);
        bike1.wheel = 3;

        Bike bike3 = new Bike(40);
        System.out.println("Bike.wheel : " + Bike.wheel);
        System.out.println("bike1.wheel : " + bike1.wheel);
        System.out.println("bike2.wheel : " + bike2.wheel);
        System.out.println("bike3.wheel : " + bike3.wheel);
    }
}
