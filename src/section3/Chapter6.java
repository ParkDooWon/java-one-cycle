package section3;

public class Chapter6 {
    public static void main(String[] args) {
        int level = 2;
        switch (level) {
            case 1:
                System.out.println("2km 달립니다.");
                break;
            case 2:
                System.out.println("5km 달립니다.");
                break;
            case 3:
                System.out.println("10km 달립니다.");
                break;
            default:
                System.out.println("존재하지 않는 레벨입니다.");
                break;
        }

        int month = 8;
        // 3,4,5 : 봄 입니다.
        // 6,7,8 : 여름 입니다.
        // 9,10,11 : 가을 입니다.
        // 12,1,2 : 겨울 입니다.

        switch (month) {
            case 3,4,5:
                System.out.println("봄 입니다.");
                break;
            case 6,7,8:
                System.out.println("여름 입니다.");
                break;
            case 9,10,11:
                System.out.println("가을 입니다.");
                break;
            case 12,1,2:
                System.out.println("겨울 입니다.");
                break;
        }
    }
}





