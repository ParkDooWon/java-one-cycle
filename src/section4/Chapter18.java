package section4;

public class Chapter18 {
    public static void main(String[] args) {
        // null : 참조 변수가 어떤 객체도 참조하지 않음을 나타내는 특별한 값 -> 참조변수와 연결된 객체가 없다
        Dog dog = new Dog("해피", "불독", 10);  // 100번지 - dog 참조변수가 참조중
        System.out.println(dog.name);
        dog.eat();

        //dog = null;  // 객체와의 참조(연결) 끊어짐
        if (dog != null) {
            System.out.println(dog.name);
        }

        System.out.println("아주 중요한 작업");

        // RuntimeException (런타임 예외) : 프로그램 실행 중에 발생하는 예외
        // CompileError (컴파일 에러) : 프로그램 실행 전, 컴파일 과정에서 발생하는 에러. 문법 규칙을 지키지 않았을 때 발생
    }
}
