package day03;

public class Exam1 {
    public static void main(String[] args) {



        /*
        switch : 논리 검사 보다는 값에 따른 흐름 제어 사용
        switch (값){
            case 비교값 :
                실행문;
            case 비교값 :
                실행문;
            case 비교값 :
                실핼문;
        }
        */

        // if = 조건에 따른 논리 검사 실행
        // switch = 어떠한 값에 따른 흐름 제어(정해진 경우의 수)

        char grade ='B';
        switch (grade){   // 스위치에 등급 대입
            case 'A' :                           // A 등급이면
                System.out.println("우수학생");   //  출력
                break;                           //  해당 case 실행 후 멈춤, 안쓰면 아래부분에 해당하는거 있으면 계속 출력
            case 'B' :                           // B 등급이면
                System.out.println("장려학생");
                break;
            case 'C' :                           // C 등급이면
                System.out.println("불량학생");
                break;
            default :
                System.out.println("학생");       // 그 외
    }
}
}
