package Day11;

public class Exam1 {
    public static void main(String[] args) throws InterruptedException {

        // [1] 예외처리 : 개발자가 구현한 로직이나 사용자의 영향으로 문제
        // => 시스템오류 : 시스템이 종료되는 심각한 문제
        // [2] 예외종류
            // 1) 일반 예외 : 컴파일(실행전) 될때 예외 처리 코드 검사
                // 입출력, 네트워크, 파일 , JDBC (DB연동) 등 주로 외부와 통신
            // 2) 실행 예외 : 실행 도중에 발생하는 예외 처리 코드 검사( 개발자 예측/경험 의존도 크다)
                // 연산문제, null, index 등 주로 코드적인문제, 타입문제
        // [3] 목적 : 1) 예외를 고치는게 아니라 예외가 발생하면 피해서 다른 코드로 이동, 즉] 24시간 코드실행
        // [4] 사용법
            // try{에외가 발생하거나 발생할것 같은 코드}
        // Class.forName("패키지명.클래스명"), 일반예외 예시 : 현재 프로젝트내 클래스가 존재하는지 검사/동적할당
        // [5] 주요 예외 클래스
            // 많음
        try{
            Class.forName("java.lang.String");
        }catch (ClassNotFoundException 변수명1){
            System.out.println("예외발생1 : String 클래스가 없습니다.");
        }
        // 2) 일반예외 예시2, Thread.sleep(밀리초) : 현재 흐름(스레드) 일시정지 메소드
        Thread.sleep(1000);

        // 일반예외 클래스들은 실행 전에 코드 밑줄에 빨강색으로 예외 발생 가이드라인을 해준다.
        // 3) 실행예외 예시3 (NullPointerException)
        try {
            String name = null;
            System.out.println(name.length()); // .(접근.토트)연산자는 객체가 존재해야만 가능하다.
        }catch (NullPointerException error){
            System.out.println("예외발생3 null은 호출 불가능");
        }
       try {
           String str1 = "100";
           String str2 = "1abc";
           int int1 = Integer.parseInt(str1); // 문자열 - > 정수타입 변환 메소드
           int int2 = Integer.parseInt(str2);  // "100" -> 100[ok], "1abc"->불가능
       }catch (NumberFormatException error){
           System.out.println("정수형 변환 불가능");
       }
    }
}
