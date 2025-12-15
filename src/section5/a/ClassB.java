package section5.a;

public class ClassB {  // ClassA에 접근하는 외부 클래스
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println(classA.publicNum);
        System.out.println(classA.defaultNum);
        //System.out.println(classA.privateNum);

        // 메서드 호출
        classA.publicPrint();
        classA.defaultPrint();
       // classA.privatePrint();
    }
}
