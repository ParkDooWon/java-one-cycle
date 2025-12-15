package section6.b;

import section6.a.Parent;

public class Child extends Parent {
    public void printParentFields() {
        System.out.println(publicNum);
        System.out.println(protectedNum);  // 같은 패키지 or 자식 클래스
        //System.out.println(defaultNum);    // 같은 패키지
        //System.out.println(privateNum);
    }
}
