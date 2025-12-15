package section6;

public class Dog {
    String name;
    int age;
    String tail;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("강아지가 개집에서 잠을 잡니다.");
    }

    public void bark() {
        System.out.println("멍멍");
    }
}
