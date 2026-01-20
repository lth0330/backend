package day02;

public class Exam1 {
    public static void main(String[] args) {

        // [1] 타입 = 자료형 = 분류 = 자료들을 분류/나누는 방법, 다형성 특징(다양한 형/모양을 갖는다)
        // (1) 자동 타입 변환 ( 묵시적 : 개발자 따로 할게 없다) , 손실없다.
        // byte -> short -> int -> long ->float -> double (작은상자 -> 큰상자)
        byte byteValue = 10;           // 10 자료를 byte 타입으로 분류했다
        short shortValue = byteValue;  // byte 타입 -> short 타입

        // (2) 연산중 (자동) 타입변환,
        // byte +byte = int , byte + short =int , int + int = int ,  int 이하 피연산자들은 연산하면 int로 결과나옴
        // long / float / double 들은 피연사 중에 더 큰 타입으로 결과나옴.
        byte  b1 = 10; byte b2 = 20; byte b3 = 30; byte b4 = 40; byte b5=50;
        int i1 = 100; long l1 = 200; float f1 = 300; double d1 = 400;


        //(3) 강제 타입 변환 / 캐스팅(명시적 : 개발자가 변환할 타입 작성), 손실 있음.
        // double -> float -> long -> int -> short -> byte, (큰 상자 => 작은 상자)

        double d2 = 100.14;
        float f2 = (float) d2; // (새로운타입)기존값
        long l2 = (long) f2;
        short s2 =(short) l2;   // s2에는  3 자료가 들어있다. 손실발생
        byte bb1 = (byte) s2;
        System.out.println(bb1);




    }
}
