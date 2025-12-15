package section6;

public class Chapter31 {
    public static void main(String[] args) {
        Car car = new Bus();  // 업캐스팅
        //car.useBusLane();

        Bus bus = (Bus)car;  // 다운캐스팅
        bus.busFare = 2000;
        System.out.println(bus.busFare);
        bus.useBusLane();
    }
}
