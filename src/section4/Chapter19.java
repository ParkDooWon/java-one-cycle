package section4;

public class Chapter19 {
    public static void main(String[] args) {
        Axe axe1 = new Axe("금", "최상");  // 100번지
        Axe axe2 = new Axe("금", "최상");  // 200번지

        // 동일성 비교 : == 사용, 참조값을 비교
        System.out.println(axe1 == axe2);

        // 동등성 비교 : equals 메서드 사용, 필드값(내용) 비교
        System.out.println(axe1.equals(axe2));
    }
}
