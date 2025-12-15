package section8;

public class NormalCave {
    public static <U> U printAndReturn(U item) {  // 제네릭 클래스와 별개인, 독립적인 메서드
        System.out.println(item.getClass().getName());
        return item;
    }
}
