package day07;

import day07.package1.A;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 접근제한자 : 클래스, 맴버변수,매소드 등등 호출 제한
        // [2] 종류
            // public : 공개, 프로젝트 내 어디서든 호출 가능
            // private : 비공개, 현재클래스에서만 호출 가능
            // (default) : 같은/하위 패키지에서만 호출 가능, 접근제한자가 없을 경우
            //  protected : 같은/하위 패키지에서만 호출 가능, +상속 관계 예외
        // [3] 사용법
            // 1) public / default class 클래스명{} : 클래스 키워드 앞에서 작성
            // 2) 접근제한자 타입 맵버변수;           : 맴버변수 타입 앞에서 작성
            // 3) 접근제한자 반환타입 메소드명(){}     : 반환 타입 앞에서 작성
            // 3) 접근제한자 생성자명() {}           : 생성자명 앞에서 작성

        // [4] day07 폴더내 package1 폴더 생성 -> A
        // ===== 다른 클래스 : 접근제한자 의미 있음 ======
        A a = new A();
        System.out.println(a.공개변수);
        // a.비공개변수, a.일반변수 불가능

        // [5] import : 다른 패키지의 클래스 호출
        // 자동완성시 자동으로 최상단에 import day07.package1.Aㅣ
        // --> day07 폴더내 package1안에 A class을 가져온다.
        // import java.util.Scanner;
        // * java.lang 패키지는 import를 생략가능
        // * java.String 패키지도 import 생략가능
    }
}
