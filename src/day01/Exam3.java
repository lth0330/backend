package day01;  // 클래스 파일이 속한 패키지명

public class Exam3 { // class start

    // main + 엔터 : 코드의 흐름을 읽어주는 main 선언
    public static void main(String[] args) {

        // [1] System.out.println() : sout 자동완성
        // System : 클래스이며 시스템 관련 기능/함수 제공.
        // out : 출력에 관련된 기능/함수 갖는 객체 반환
        // print : 출력함수
        System.out.println("자바안녕1");  // 줄바꿈 포함

        System.out.print("자바안녕2");    // 줄바꿈 안됨 (ln)

        System.out.printf("%s" ,"자바안녕3");   // 자료출력 + 형식문자

        /*
        printf(format 형식)
        % s : 문자열, %d : 정수 , $c : 문자, %f 실수
            자리수 :
                    %자리수d : 자릿수 만큼 자리 차지, 만일 비어있으면 공백, 오른쪽 정렬
                   %-자리수d : 자릿수 만큼 자리 차지, 만일 비어있으면 공백, 왼쪽 정렬
                   %0자리수d : 자릿수 만큼 자리 차지, 만일 비어있으면 0채움, 오른쪽 정렬
                   %f  : 전체자리수.소수점자리수
        */

        String name = "유재석" ; int age = 27;
        System.out.println("저는"+ name + "이고 나이는" + age + "입니다");   // 1번
        System.out.printf("저는 %s이고 나이는 %d입니다. \n", name, age);       // 2번
        System.out.printf("저는 %s이고 나이는 %6d입니다\n", name, age);
        System.out.printf("저는 %s이고 나이는 %-6d입니다\n", name, age);
        System.out.printf("저는 %s이고 나이는 %06d입니다\n", name, age);
        System.out.printf("저는 %s이고 키는 %2.3f입니다\n", name, 177.12345);

        // 이스케이프/제어문자
        // "\n"    : 줄바꿈
        // "\t"    : 들여쓰기[tab]
        // "\""    : "(큰따옴표)출력
        // "\'"    : '(작은따옴표)출력
        // "\\"    : \(빽슬래쉬) 출력
    }
}
