package day09;

public class Exam1 {
    public static void main(String[] args) {

        // [1] 상속 : A 클래스로 부터 B클래스에게 (맴버변수/매소드)를 물려주는 행위
        // [2] 목적 : 빠른클래스설계, 한번 만들어둔 클래스 재사용/활용한다.
        // [3] 키워드 : extents(확장, 뻗다 뜻)
        // [4] 장점 : 유지보수, 계층관계표현, 재사용, **다형성**

        동물 animal1 = new 동물(); // 동물객체
        animal1.name = "강아지";
        animal1.show();


        조류 bird1 = new 조류();
        bird1.name = "비둘기";  // 조류 클래스에는 없지만 물려받은 맴버함수
        bird1.show(); //물려받은 매소드

        참새 sparrow1 = new 참새();
        sparrow1.name = "참새";
        sparrow1.show();

        닭 chicken1 = new 닭();
        chicken1.name = "닭";
        chicken1.show();
        // [5] 주의할점 :
        // 상속은 무조건 하나으 클래스로부터 상속받는다
        // 하위 클래스가 상위 클래스를 선택한다..

        // [6] 다형성 : 다(양한)형(태/모양)성(질)
        // * 본질(값)은 그대로이다. ex) int a = 3, long b=a; long b = 3.0;
        // (1) 참새가 조류로 타입변환
        조류 bird2 = sparrow1;  // 자동타입변환, 업캐스팅, 묵시적 타입변환
        // (2) 조류가 동물로 타입변환
        동물 animal2 = bird2;
        animal2.show();
        // (3) 동물(참새)가 참새로 타입변환
        참새 sparrow3 = (참새) animal2;  // 강제 타입변환, 다운캐스팅, 명시적 타입변환(부모타입은 자식타입을 모른다)
        sparrow3.show();
        // (4) 동뮬이 닭으로 타입변환
        닭 chicken2 = (닭) animal1; // 태생이 동물이므로 조류 또는 닭/참새 타입 변환불가
        chicken2.show();  // 오류 발생 : ClassCastException
        // 참새 : 참새 -> 조류 -> 동물, 동물 -> 조류 -> 참새
        // 조류 : 조류 -> 동물, 동물 -> 조류

        // 형제 관계도 타입변환 불가능

        // [7] 상속활용처 : 1. 웹/앱 라이브러리  2. 클래스 설계(개발 경험 필요)
    }
}
class 동물{
    String name;
    void show(){
        System.out.println("동물.show");
        System.out.println(name);
    }
}

class 조류 extends 동물{ } // 조류 클래스는 동물 클래스로부터 상속을 받는다.

class 참새 extends 조류{} // 상속의 상속
class 닭 extends 조류{ }