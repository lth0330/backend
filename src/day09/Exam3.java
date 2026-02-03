package day09;

public class Exam3 {
    public static void main(String[] args) {


        // (1) 상위 객체
        상위클래스 obj1 = new 상위클래스();
        obj1.show();
        System.out.println("=======");
        // (2) 하위 객체
        하위클래스 obj2 = new 하위클래스();
        obj2.show();
        obj2.show2();
        System.out.println("=======");
        // (3) 타입변환  // 자식 -> 부모 타입변환
        상위클래스 obj3 = obj2;
        obj3.show();
        System.out.println("=======");
        // (4) 부모와 자식간의 맴버변수간의 공유 가능
        System.out.println(obj2.value1);
        System.out.println(obj2.value3);

    }
}

class 상위클래스{
    int value1 = 10;
    int value2 = 20;

    상위클래스(){
        System.out.println("상위클래스 생성");
    }
    void show(){
        System.out.println("상위클래스 메소드실행");
    }
}

class 하위클래스 extends 상위클래스{
    int value3 = 30; int value4 =40;

    하위클래스(){
        System.out.println("하위클래스 생성");
    }
    @Override // 생략 가능, 물려받은 매소드 재정의
    void show(){ /* 상위크래스 매소드 선언부가 일치하면 오버라이딩 : 물려받은 매소드를 재정의 */
        System.out.println("하위클래스 매소드실행(재정의)");
    }
    void show2(){
        System.out.println("하위클래스 메소드2");
        System.out.println(this.value3);   // this : 현재 객체 뜻
        System.out.println(super.value1);  // super :상위 객체 뜻
        // 부모와 자식 간의 맴버변수명이 동일할때 this, super 사용한 구분을 한다.
    }
}