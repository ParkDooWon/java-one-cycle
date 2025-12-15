package section7;

public class SuperCar implements CarInterface {
    @Override
    public void stepOnAccel(int speed) {
        System.out.println("악셀을 밟아 슈퍼카가 빠르게 가속합니다.");
    }

    @Override
    public void stepOnBrake() {
        System.out.println("브레이크를 밟아 슈퍼카가 멈춥니다.");
    }
}
