package day10;

public interface TestInterface {
    // int a; * 맴버변수 불가능
    public  static final int b = 10; // 변수가 아닌 상수는 가능
    // * 생성자 불가능
    // * 추상매소드 : 매소드 선언만
    public abstract void method1();
    public abstract void method2( int x );
}
