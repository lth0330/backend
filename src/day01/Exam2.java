package day01;

public class Exam2 {
    // public class : 공개용 클래스 선언 뜻 갖는 키워드

    // m + 엔터 = main 함수
    // 자바에서 최초의 실행 흐름(스레드)를 갖는 (미리만들어진)함수
    public static void main(String[] args) {

        // 리터럴 : 상수이면서 키보드로 입력 가능한 자료들
        //3 , 3.14, 'a', true, false
        System.out.println(3 );        // console.log() 동일한 기능의 함수
        System.out.println(3.14);      // sout + 엔터 System.out.println(출력하고 싶은 자료 입력);
        System.out.println("유");      // 선언 또는  함수 실행 뒤에 ; 세미콜론 작성한다.
        System.out.println("유재석");   // 문자열 처리할때는 "(큰따옴표) 사용, 문자처리할때는 '(작은따옴표)사용

        // 자료형/타입(분류) : 자료들을 효율족으로 사용하기 위한 분류 방법
        // 바이트란 : bit(0 또는 1)을 8개합친 것 = 1byte
        // 정수 : (1)byte, (2)short, (4)int(*), (8)long
        // 실수 : (4)float, (8)double(*)
        // 문자 : (2)char : 작은 따옴표 사용,   문자열 : String  문자클래스, ""(큰따옴표사용)
        // 논리 : (1)boolean  : true/false 사용

        // 1.boolean
        boolean boo1 = true;
        boolean boo2 = false;  // 변수명은 카멜표기법 권장, 숫자시작/일부특수/띄어쓰기 안됨
        // boolean boo3 = 3;   boolean에는 true 나 false가 아닌 다른것들을 저장할 수 없다.
        System.out.println(boo1);


        // 2.char
        char ch1 ='A';

        // 3. String  큰따옴표로 감싼 문자 여러개 저장하는(클래스)타입
        String srt1 = "ABC";
        System.out.println(srt1);


        // 4. byte : -128 ~ 127
        byte b1 = 100;
        // byte b2 = 300;  [오류]
        System.out.println(b1);


        // short : +- 3만 정도

        // int : +- 21억정도, 정수의 리터럴 기본타입, 즉] 키보드로부터 입력받은 값들은 int 타입이다.
        // 키보드로 입력하는 값 또한 21억이 넘어가면 오류
        int i1 = 2100000000;
        System.out.println(i1);

        // long : +- 21억 이상 , 리터럴 뒤에 L/l 를 붙인다.
        long l1 = 30000000000L;   // 300000000 리터럴은 INT 타입이라서 뒤에 L를 명시한다
        System.out.println(l1);


        // double : 소수점 17저라 표현, 실수의 리터럴 기본타입


        // float : 소수점 8자리까지 표현, 리터럴 뒤에 F/f 붙인다.

        float f1 = 0.123456789123456789F;
        System.out.println(f1);
        // 실수에서는 사용 재약이 있어서 잘 사용안함


    }
}
