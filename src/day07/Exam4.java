package day07;

public class Exam4 {

    void 맴버매소드(){} // 1) 맴버매소드
    static void 정적맴버매소드(){}  // 2) 정적매소드

    public static void main(String[] args) {


        // [1] final, 고정
        // [2] 사용법 : final 타입 변수명 = 초기값;
        //  -> final 변수는 초기값이 무조건 필수이다. <수정을 못해서>

        // 클래스명.정적(static)변수
        System.out.println(D.name);  // ok
        System.out.println(D.point);  // ok

        // 클래스명.고정(final)변수 : 객체 필요함.
        D d = new D();    // 객체
        System.out.println(d.PI);   // ok


        // [1] static, 정적인
        // [2] 사용법 : static 타입 변수명;, static void 매소드명(){}
        // -> static 변수/매소드는 프로그램 실행시 우선(메모리)가 할당 되고 프로그램 종료시까지 유지!
        // -> 메모리 할당된 변수/매소드 이므로 객체가 필요없다. <과도한 사용은 좋지 않다>
        // -> 프로그램 공유 변수, 공유 매소드에 대해서 사용, 즉] 프로그램내 1개만 존재해야 하는 변슈/매소드
        // -> static 갖는 매소드를 실행문에서 일반 매소드 호출이 불가능<객체필요>

        // 맴버매소드(); // error , static 갖는 변수/매소드는 우선 할당이므로 객체가 아닌 맴버매소드를 모든다.
        Exam4 exam4 = new Exam4();  // 객체를 만들어서 맴버매소드를 호출.
        exam4.맴버매소드(); //ok
        정적맴버매소드(); //ok,  main 메소드가 static를 갖고 정적매소드도 static를 갖기 때문에 서로 알고 있는 상태<객체필요없음>


        //나는나는
        //D.method1(); // 불가능
        d.method1(); // 가능
        D.method2(); // 가능

    }
}
class D{
    // final 키워드는 초기값이 필수
    final double PI =3.141592;
    //* static 키워드는 (객체들간)공유가능, 초기값 필요없음
    static int point;
    // * 상수, public static final
    static final char name = 'A';
    // final 매소드 : 오버라이딩/재정의 금지
    public final void method1(){}
    // static 매소드 : 객체 유무상관없이 호출 가능한 매소드
    public static void method2(){}
}