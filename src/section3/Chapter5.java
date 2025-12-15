package section3;

public class Chapter5 {
    public static void main(String[] args) {
        // 점수별 등급 부여
            // 81 ~ 100점 : A등급
            // 61 ~ 80점  : B등급
            // 41 ~ 60점  : C등급
            // 0 ~ 40점   : D등급
        int score = 90;
        if (score >= 81) {
            System.out.println("A등급입니다.");
        } else if (score >= 61) {
            System.out.println("B등급입니다.");
        } else if (score >= 41) {
            System.out.println("C등급입니다.");
        } else {
            System.out.println("D등급입니다.");
        }
    }
}
