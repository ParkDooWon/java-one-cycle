package section3;

public class Chapter12 {
    public static void main(String[] args) {
        // 두 수의 곱을 구하는 메서드
        int a = 10, b = 20;
        int multiplyResult = multiply(a, b);
        System.out.println("multiplyResult : " + multiplyResult);

        // 반환타입이 void인 메서드
        printAddResult(1, 2);

        // return문
        int biggerNum = getBigger(20, 10);
        System.out.println("biggerNum : " + biggerNum);
    }

    public static int getBigger(int num1, int num2) {
        // return문 역할
            // 1. 결과값을 반환
            // 2. 메서드 종료
        if (num1 > num2) {
            System.out.println("num1이 더 큽니다.");
            return num1;
        }
        System.out.println("num2가 더 큽니다.");
        return num2;
    }

    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static void printAddResult(int num1, int num2) {
        // 두 수의 합이 10 이상인 경우에만, 두 수의 합을 출력
        if (num1 + num2 < 10) {
            return;
        }
        System.out.println("덧셈 결과 출력 : " + (num1 + num2));
    }
}
