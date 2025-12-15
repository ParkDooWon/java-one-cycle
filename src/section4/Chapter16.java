package section4;

public class Chapter16 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("돌돌", "리트리버", 20);  // 100번지
        Dog dog2 = dog1;

        System.out.println("before dog1.name : " + dog1.name);
        dog2.name = "꿀떡";
        System.out.println("after dog1.name : " + dog1.name);

        System.out.println("before dog2.name : " + dog2.name);
        dog1.name = "콩이";
        System.out.println("after dog2.name : " + dog2.name);
    }
}
