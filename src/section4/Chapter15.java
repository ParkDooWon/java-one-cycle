package section4;

public class Chapter15 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("돌돌", "리트리버", 20);  // 100번지
        Dog dog2 = new Dog("두두", "닥스훈트", 5);   // 200번지

        System.out.println("before dog1.name : " + dog1.name);
        dog1.name = "동치미";
        System.out.println("after dog1.name : " + dog1.name);

        System.out.println("before dog2.type : " + dog2.type);
        dog2.type = "치와와";
        System.out.println("after dog2.type : " + dog2.type);
    }
}
