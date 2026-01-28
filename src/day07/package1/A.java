package day07.package1;

public class A
{

    public int 공개변수;
    private int 비공개변수;
    int 일반변수; //default

    // 같은 클래스에서는 접근제한자가 의미없다.
    public void 매소드(){
        System.out.println(공개변수);
        System.out.println(비공개변수);
        System.out.println(일반변수);
    }
}
