package day15;

import java.util.*;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 켈렉션(수집) 프레임(틀) 워크(일)
        // 1. 정의 : 자료들을 수집/ 저장하는 방법들을 미리 만들어둔 인터페이스/클래스
        // 2. 목적 : 복잡한 자료구조를 제공받아 편리한 데이터 관리
            // 자료구조란? 컴퓨터가 자료들을 효율적으로 저장하는 방법/구조, ex] 리스트/해시/큐/스택/트리 등등
        // 3. 종류 : 인터페이스란? 서로 다른 클래스/타입들을 기능 통합
        /*
                인터페이스       구현체
                List            ArrayList, Vector, LinkedList, Stack 등
                Set             HashSet, TreeSet 등
                Map             HashMap, HashTable, TreeMap 등
         */

        // [2] List 타입
        ArrayList<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // List 주요 메소드
        // 1. .add
        list2.add("유재석");
        list2.add("유재석");  // 중복 허용
        list2.add(0,"강호동"); // 특정 인텍스 추가
        System.out.println("list2 = " + list2);

        // 2. .set()
        list2.set(0, "강호동2");
        System.out.println("list2 = " + list2);

        // 3. .get()
        System.out.println("list2.get(1) = " + list2.get(1));

        // 4. .size()
        System.out.println("list2.size() = " + list2.size());

        // 5. .contains(), .indexOf()
        boolean result1 = list2.contains("강호동2");
        System.out.println("result1 = " + result1);
        int result2 = list.indexOf("강호동2");
        System.out.println("result2 = " + result2);

        // 6. remove()
        list2.remove("강호동2");
        System.out.println(list2);

        // 7. isEmpty()   //비어있는지 확인
        System.out.println(list2.isEmpty());

        // 8. .clear()

        //==============================================================
        // List 타입과 반복문
        // 1) 일반 for문
        System.out.println("1. 일반for문");
        for(int index = 0; index<= list.size(); index++){
            System.out.println(list2.get(index));
        }
        // 2) 향상된 for문
        System.out.println("2. 향상된 for문");
        for(String str : list2){
            System.out.println(str);
        }

        // 3) forEach 문 * 리스트내 요소(값) 들을 하나씩 순서대로 반복변수에 대입해서 반복한다.
        // 변수명 .forEach((반복변수) -> {실행문;});
        System.out.println("3.forEach문");
        list2.forEach((str) ->{
            System.out.println(str);
        });
        //람다식

        // List 구현체들, 구현체란? 인터페이스의 추상메소드를 구현(오버라이딩)한 클래스/객체
        List<Integer> List;  // 인터페이스 타입

        // 공통 : 여러 요소(값)들을 순서대로(인덱스) 저장하는 <배열>구조
        List = new ArrayList<>();   // + 싱글스레드 사용, 비동기화 메소드
        List = new Vector<>();      // + 멀티스레드 사용, 동기화 메소드
        List.add(0,50 );
        List = new LinkedList<>();  // + 싱글스레드 사용, <링크> 구조
        List.add(0, 100);   // 0번 인덱스에 100 대입
        // ArrayList 중간 삽입/삭제 시 다른 데이터들의 이동 발생
        //  중간 삽입/삭제 느리다, 뒤에 추가 빠르다
        // VS
        // 중간 삽입/삭제 빠르다, 뒤에 추가 비교적 느리다.
        // LinkedList 중간 삽입/삭제 시 다른 데이터들의 이동이 발생하지 안ㅇㅎ는다
        Stack<String> stack = new Stack<>();
        stack.push("유재석");  // 값 추가
        stack.push("강호동");
        System.out.println(stack.pop());  // 값 제거 : pop
        System.out.println(stack.pop());
        // Stack 스택 자료 구조란? 선입후출

    }
}
