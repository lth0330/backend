package day01;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {

        // [1] 입력함수
        // Scanner 클래스 : 입력받은 자료들을 *특정한 타입으로 변환*
        // new : 새로운 객체 생성할때 사용되는 키워드
           // new Scannner : Scanner 객체 만들겠다!!
        // (System.in) : 시스템 입력 객체를 Scanner 객체에게 전달
        // * 시스템 입력 객체를 Scanner 객체에 대입하여 Scanner 객체 생성
        // * Scanner 변수명  = new Scanner(System.in);
        Scanner 입력변수  = new Scanner(System.in);

        // [2] 입력함수
        // 1. 입력객체변수.next();    : 입력받은 자료들을 문자열(String)로 변환
        입력변수.next();     // console.log 에서 키보드로부터 입력받고 enter입력시 입력종료


        // [2] .nextLine() : 입력받은 자료를 문자열로 변환, 띄어쓰기 포함
        // 주의할점 : 띄어쓰기를 포함하다보니 앞전에 next()와 충돌하여 하나의 next인식된다.
        // 해결방법 : nextLine() 사용할때 앞전에 next() 존재하면 임의의 nextLine() 하나 더 작성한다

        입력변수.nextLine(); // 해결
        System.out.println("2. nextLine() : ");
        String str2 = 입력변수.nextLine();
        System.out.println(str2);





        // [3] .nextByte()  : 입력받은 자료를 바이트로 변환, -128 ~ 127이외 오류
        System.out.print( "3. nextByte() : ");
        byte b1 = 입력변수.nextByte();
        System.out.println(b1);

        // [4] .nextShort : 입력받은 자료를 쇼트로 변환 , +-3만정도이외 올퓨
        System.out.print( "4. nextShort() : ");
        short s1 = 입력변수.nextByte();
        System.out.println(s1);


        // [5] .nextInt() : 입력받은 자룔를 인트로 변환
        System.out.print( "3. nextInt() : ");
        int i1 = 입력변수.nextByte();
        System.out.println(i1);


        // [6] .nextLong() : 입력받은 자룔를 인트로 변환
        System.out.print( "3. nextLong() : ");
        long l1 = 입력변수.nextByte();
        System.out.println(l1);

        // [7, 8]  nextFloat, nextDouble : 입력받은 자료를 실수로 변환
        System.out.println("7. nextFloat : ");
        float f1 = 입력변수.nextFloat();
        System.out.println(f1);
        System.out.println("8. nextDouble : ");
        double d1 = 입력변수.nextDouble();
        System.out.println(d1);


        // [9] nextBoolean : 입력받은 자룔를 블리언으로 변환
        System.out.println(" 9 nextBoolean : ");
        boolean b2 = 입력변수.nextBoolean();
        System.out.println(b2);


        // [10] next().charAt(0) , 입력받은 자료애서 첫번째 글자 반환, char 문자 스캔은 없다.
        System.out.println(" 10. next()charAt(0) ");
        char c1 = 입력변수.next().charAt(0);
        System.out.println(c1);
    }
}
