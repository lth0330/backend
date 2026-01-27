package day06;

public class Calculator {

    // [1] 속성 = 맴버변수

    // [2] 기능 = 매소드 = 맵버함수
    // 1) 매개변수 X, 반환값 O
    double getPi(){
        // double 반환타입 : return 값에 대입
        // getPi 매소드명 아무거나(카멜권장 :처음은 소문자 이어진 단어의 첫문자는 대문자)
        // () : 매개변수 없는 상태
        // {} : 함수 실행시 처리할 명령어/코드
        return 3.141592; // double 타입
        // return : 함수 반환값
    }
    // 2) 매개변수 X, 반환값 X
    void powerOn(){
        System.out.println("전원을 켭니다.");
        return; // void 라서 return 생략가능

    }
    // 3) 매개변수 0, 반환값 X
        void printSum(int x, int y){
            System.out.println(x+y);
        }

    // 4) 매개변수 O, 반환값 O
    int add(int x, int y){
        System.out.println("더하기 합니다");
        return x + y;
    }
}
