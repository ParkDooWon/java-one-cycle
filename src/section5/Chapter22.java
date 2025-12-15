package section5;

public class Chapter22 {
    public static void main(String[] args) {
        Bike myBike = new Bike(30); // 100번지
        upgrade(myBike);
        int minusSpeed = 5; // main 메서드의 지역변수
        myBike.maxSpeed -= minusSpeed;
        myBike.wheel = 1;
    }

    public static void upgrade(Bike bike) {
        int plusSpeed = 10;  // upgrade 메서드의 지역변수 -> Stack 영역
        bike.maxSpeed += plusSpeed;
        Bike newBike = new Bike(20); // 200번지
    }

    // 변수의 종류
        // 1. 데이터 타입 : 기본 타입, 참조 타입
        // 2. 선언 위치 : 인스턴스 변수, 클래스 변수, 지역 변수
}
