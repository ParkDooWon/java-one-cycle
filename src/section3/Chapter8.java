package section3;

public class Chapter8 {
    public static void main(String[] args) {
//        for (int i = 1 ; i <= 10 ; i++) {
//            System.out.println(i);
//        }

        // 구구단
        int dan = 9;
        System.out.println(dan + "단 결과 ====");
        for (int i = 1 ; i <= 9 ; i++) {  // 1~9 '곱해지는 수'를 올려주는 반복문
            int result = dan * i;
            System.out.println(dan + " x " + i + " = " + result);
        }
    }
}
