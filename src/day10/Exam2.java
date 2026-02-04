package day10;

public class Exam2 {
    public static void main(String[] args) {


        // [1] 인터페이스 객체 생성 불가능
        // new 키보드(); // 인터페이스 타입은 생성자가 없어서 객체 생성불가
        // [2] 인터페이스 타입의 변수 선언
        키보드 myKeyBoard;
          //  myKeyBoard.aKey(); // 추상메소드는 실행이 안된다.
        // [3] 추상매소드 구현하기 = 클래스에서 오버라이딩
        System.out.println(키보드.제조일);
        System.out.println(키보드.제조사);
        myKeyBoard = new 격투게임();
        myKeyBoard.aKey();
        myKeyBoard.aKey();
        myKeyBoard.bKey(3,2);

        // [5] 다형성 - 게임교체
        myKeyBoard = new 축구게임();
        myKeyBoard.aKey();
        myKeyBoard.aKey();
        myKeyBoard.bKey(3,2);

        // [6] 구현체 없이 자체적으로 구현 == 익명(이름없는)구현체
        // new 인스페이스명(){오버라이딩}
        myKeyBoard = new 키보드(){
            public void aKey(){
                System.out.println("[밥먹기]");
            }
            public int  bKey(int x, int y){
                System.out.println("[마시기]");
                return 0;
            }
        };

        myKeyBoard.aKey();
        myKeyBoard.bKey(3,2);




    }
}

class 격투게임 implements 키보드{
    // implement이란? 해당 인터페이스내 추상메소드를 구현.
    @Override
    public void  aKey(){
        System.out.println("공격");
    }
    @Override public int bKey(int x, int y){
        System.out.println("방어");
        return x+y;
    }
}
class 축구게임 implements 키보드{
    public void aKey(){
        System.out.println("슈팅");
    }
    public int bKey(int x, int y){
        System.out.println("태클");
        return x +y;
    }
}