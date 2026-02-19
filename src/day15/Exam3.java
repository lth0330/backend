package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exam3 {
    public static void main(String[] args) {

        // [2] Set 인터페이스 , 순서(인덱스)없는 저장 -> 중복 불가능
        Set <String> set1 = new HashSet<>();
        // Set 주요 메소드
        // 1) add(새로운값) 요소 추가
        set1.add("유재석");
        set1.add("강호동");
        set1.add("유재석");    // 중복 불가능
        set1.add("사람");
        System.out.println("set1 = " + set1);

        // * 인덱스가 없으므로 .set(), .get(), .indexOf() 메소드가 없음
        // 2) .size()
        System.out.println(set1.size());

        // 3) .contains(찾을값) : 찾을값이 존재하면 true 없으면 false
        set1.contains("유재석");

        // 4) .remove(삭제할값) : 삭제할 값이 존재하면 삭제
        set1.remove("유재석");

        // 5) .isEmpty() : 요소가 하나도 없으면 true 없으면 false
        System.out.println("set1 = " + set1.isEmpty());

        // 6) .clear() : 모든 요소 삭제
        // set1.clear();
        // 7) .interator() : 집합(SET)내 순서없는 요소들을 반복할 수 있도록 인터페이스 반환
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()){ //.hasNext() : 다음 요소가 존재하면 이동
            System.out.println("iterator.next() = " + iterator.next());

        }
        // ==================================================
        // 집합(SET)과 FOR문 관계
        // 1) 일반 for문 거의 불가능
        // 2) 향상된 for 가능
        for(String str : set1){System.out.println(str);}
        // 3) forEach 가능
        set1.forEach((Str) -> System.out.println("Str = " + Str));
    
        // 활용처 : JDBC(ResultSet
        //========================================================
        // Set 인터페이스
        Set<Integer> set2;
        set2 = new HashSet<>();

        TreeSet<Integer>set = new TreeSet<>();   // 자동정렬
        set.add(50); set.add(30); set.add(45);
        System.out.println("set = " + set);     // [30,45,50]
        // 이진트리 란? 각각의 노드(값)이 최대 2개의 노드(값)을 연결하는 구조
        //  현재 노드/가지 보다 작은값이 추가되면 왼족 노드에 생성, 큰값이 생성되면 오른쪽에 추가하는 구조
        // 기본값은 오름차순,   .descendingSet() : 내립차순
        System.out.println(set.descendingSet());  // [50,45,30]
        // 활용처 : 정렬(검색 최적화)

    }
}
