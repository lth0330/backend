package day11;

public class Exam2 {
    // 메소드1, thorws : 해당 메소드에서 예외 발생시 메소드호출 했던 곳으로 예외 전달
    public static void method1() throws NullPointerException{
        String str = null;
        System.out.println(str.length());
    }
    public static void method2() throws ClassNotFoundException {
        Class.forName("java.lang.String3");
    }
    public static void main(String[] args) {

        // 에외처리 : try{}catch{}
        // 예외던지기(떠넘기기/전달) throws

        try{
            method1();

        }catch (NullPointerException e){
                System.out.println(e);
            }

        try{method2();}catch (ClassNotFoundException e ){
            System.out.println(e);
        }
    }
}
