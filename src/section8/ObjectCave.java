package section8;

// Object 필드를 둔 어떤 타입의 객체든 저장할 수 있는 클래스
public class ObjectCave {

    Object object;

    public void put(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}
