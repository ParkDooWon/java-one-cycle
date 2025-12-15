package section4;

public class Chapter14 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("돌돌", "리트리버", 20);
        System.out.println("dog1 name : " + dog1.name);  // . (점 연산자) : 객체의 필드나 메서드에 접근
        System.out.println("dog1 type : " + dog1.type);
        System.out.println("dog1 weight : " + dog1.weight);
        dog1.eat();

        Dog dog2 = new Dog("두두", "닥스훈트", 5);
        System.out.println("dog2 name : " + dog2.name);
        System.out.println("dog2 type : " + dog2.type);
        System.out.println("dog2 weight : " + dog2.weight);
        dog2.eat();
    }
}
