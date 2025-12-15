package section3;

public class Chapter7 {
    public static void main(String[] args) {
        int i = 7;
        int sum = 0;
        while (i >= 1) {
            System.out.println(i);
            sum += i; // sum = sum + i
            i--;  // 없으면 무한루프에 빠짐
        }
        System.out.println("sum : " + sum);
    }
}
