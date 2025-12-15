package section6;

public class Chapter30 {
    public static void main(String[] args) {
        Car myCar;
        myCar = new Truck();
        myCar = new Bus();

        //Bus bus = new Car();  // 자식클래스 참조변수에 부모클래스 객체를 담을 수는 없음

        Truck car = new Truck("truck", 50, 1000);
        System.out.println(car.name);
        System.out.println(car.speed);
        System.out.println(car.cargoWeightLimit);

        car.speedUp();  // 실제로 생성된 객체의 타입을 따라, 오버라이딩 메서드가 우선 호출됨
        car.loadCargo();

        // 다형성 장점
            // 1. 클래스 수만큼 메서드를 만들지 않아도 됨 : 중복코드 줄음, 유지보수 용이
            // 2. 클래스가 늘어난다고 해도, 기존 코드 수정 X : 유연성과 확장성이 올라감
        drive(new Truck());
        drive(new Bus());
        drive(new Taxi());
    }

    public static void drive(Car car) {
        System.out.println("운전을 시작합니다.");
        car.speedUp();
    }

//    public static void drive(Truck truck) {
//        System.out.println("운전 시작!");
//        truck.speedUp();
//    }
//
//    public static void drive(Bus bus) {
//        System.out.println("운전 시작!");
//        bus.speedUp();
//    }
//
//    public static void drive(Taxi taxi) {
//        System.out.println("운전 시작!");
//        taxi.speedUp();
//    }
}
