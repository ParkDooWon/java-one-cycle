package section6;

public class Chapter29 {
    public static void main(String[] args) {
        Truck truck = new Truck();

        truck.loadCargo();
        truck.loadCargo(10);
        truck.loadCargo("철근");

        truck.loadCargo(20, "식품");
        truck.loadCargo("목재", 30);

        // 오버로딩을 잘 활용한 예시
        System.out.println(10);
        System.out.println("string");

        // 만약 오버로딩이 없었다면?
        // int : printlnInt
        // String : printlnString
        // long : printlnLong
    }
}
