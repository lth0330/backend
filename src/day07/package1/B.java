package day07.package1;

public class B {

    public void 매소드(){
        A a = new A();
        System.out.println(a.공개변수);

        System.out.println(a.일반변수);

        // 같은 패키지안에 있어도 a.비공개변수 불가능;
    }
}
