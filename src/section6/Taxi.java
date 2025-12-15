package section6;

public class Taxi extends Car {
    @Override
    public void speedUp() {
        System.out.println("손님이 있으니 부드럽게 가속합니다.");
    }
}
