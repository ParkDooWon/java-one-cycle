package section2;

public class Chapter3 {
    public static void main(String[] args) {
//        // 1. 대입 연산자 : 변수에 값을 할당하는 연산자 ( = )
//        int variable = 10;
//
//        // 2. 산술 연산자 : 수학적 계산을 수행하는 연산자 ( +, -, *, /, % )
//        int num1 = 10;
//        int num2 = 3;
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println(num1 / num2);  // 정수끼리의 나눗셈에서는 결과도 정수(몫)만 반환
//        System.out.println(num1 % num2);
//
//        // 산술 연산 우선순위
//        int i = (1 + 2) * 3;
//        System.out.println("결과 : " + i);
//
//        // 3. 증감 연산자 : 변수의 값을 1 증가시키거나, 1 감소시키는 연산자 ( ++, -- )
//        int n1 = 1;
//        System.out.println("n1++ : " + n1++); // 이 줄이 끝나고 1 증가
//        System.out.println("after n1++ : " + n1);
//
//        int n2 = 1;
//        System.out.println("++n2 : " + ++n2);  // 이 줄에서 1 증가
//        System.out.println("after ++n2 : " + n2);

        // 4. 복합 대입 연산자 : 산술 연산과 대입 연산이 합쳐진 연산자 ( += , -= , *= , /= , %= )
        int complex1 = 10;
        complex1 += 1; // complex1 = complex1 + 1
        System.out.println("complex1 += 1 : " + complex1);

        int complex2 = 10;
        complex2 -= 1; // complex2 = complex2 - 1
        System.out.println("complex2 -= 1 : " + complex2);

        int complex3 = 10;
        complex3 *= 2; // complex3 = complex3 * 2
        System.out.println("complex3 *= 2 : " + complex3);

        int complex4 = 10;
        complex4 /= 3; // complex4 = complex4 / 3
        System.out.println("complex4 /= 3 : " + complex4);

        int complex5 = 10;
        complex5 %= 3; // complex5 = complex5 % 3
        System.out.println("complex5 %= 3 : " + complex5);

        // 5. 비교 연산자 : 두개의 값을 비교하는 연산자 ( < , > , <= , >= , == , != )
        int number1 = 10;
        int number2 = 10;
        boolean compare1 = number1 < number2;
        System.out.println("number1 < number2 : " + compare1);

        boolean compare2 = number1 > number2;
        System.out.println("number1 > number2 : " + compare2);

        boolean compare3 = number1 <= number2;
        System.out.println("number1 <= number2 : " + compare3);

        boolean compare4 = number1 >= number2;
        System.out.println("number1 >= number2 : " + compare4);

        boolean compare5 = number1 == number2;
        System.out.println("number1 == number2 : " + compare5);

        boolean compare6 = number1 != number2;
        System.out.println("number1 != number2 : " + compare6);

        // 나이가 10살 이상이고 20살 미만
        int age = 15;
        // boolean compare7 = 10 <= age < 20; // 불가능. -> 논리 연산자

        // 6. 논리 연산자 : 여러 조건을 함께 판별할 수 있는 연산자 ( && , || , ! )
        // && (and) : 두 조건이 모두 true일 때만 true / 10살 이상이면서 20살 미만
        int age1 = 30;
        boolean and = age1 >= 10 && age1 < 20;
        System.out.println("and : " + and);

        // || (or) : 두 조건 중 하나의 조건만 true면 true / 10살 미만이거나 70살 이상
        int age2 = 50;
        boolean or = age2 < 10 || age2 >= 70;
        System.out.println("or : " + or);

        // ! (not) : true, false 값을 반대로 바꾸는 연산자 / true -> false , false -> true
        int age3 = 30;
        boolean not = !(age3 < 20);
        System.out.println("not : " + not);
    }
}










