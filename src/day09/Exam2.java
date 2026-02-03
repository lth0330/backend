package day09;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 자바의 모든 클래스는 object 클래스부터 상속받는다
        System.out.println("===1===");
        A a = new A(); // 총 객체 2개, A + object(슈퍼클래스)

        // [2] 상속관계에서는 객체 생성시 부모객체 먼저 생성
        System.out.println("===2===");
        B b = new B(); // 총 객체 3개

        // [3] 타입변환시 업/다운 캐스팅만 가능
        System.out.println("===3===");
        C c = new C(); // 총 객체 3개

        // [4] 자식 객체가 생성되면 부모 객체도 같이 생성된다.
        System.out.println("===4===");
        D d = new D(); // 총 객체 4개

        // [5] 자동타입변환
        A a2 = b;
        // B b2 = c; // c가 객체가 생성될때 b는 생성되지않았다

        // [6] 강제타입변환
        B b2 = (B)a2; // a2의 태생은 b객체이므로 가능
        // C c2 = (C)a2; // 오류발생 a2의 태생은 b 객체 이므로 b가 태어날때 c는 생성되지않았다.

        // [7] 타입 확인 , 객체 instanceof 클래스명/타입명
        System.out.println(a instanceof Object);  // 부모들이 같이 생성됨
            // a 객체가 생성될때 Object가 생성됬는지 확인하는 방법
        // 헤당 객체가 생성될때 보모객체는 생성되지만 자식객체는 생성되지 않는다.
        // 다운캐스팅이 안되는 전제조건
    }
}

class A{
    A (){
        System.out.println("A 객체 생성");
    }
}

class B extends A{
    B(){
        System.out.println("B 객체 생성");
    }
}

class C extends A{
    C(){
        System.out.println("C 객체 생성");
    }
}

class D extends B{
    D(){
        System.out.println("D 객체 생성");
    }
}

class E extends C{
    E(){
        System.out.println("E 객체 생성");
    }
}