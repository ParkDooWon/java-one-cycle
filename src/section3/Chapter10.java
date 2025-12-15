package section3;

public class Chapter10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        int num = 0;
        while (true) {
            num += 2;
            System.out.println("num : " + num);
            if (num >= 20) {
                break;
            }
        }
    }
}
