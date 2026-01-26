package day05;

import java.util.Arrays;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 동일한 타입의 여러 자료들을 순서대로 저장하는 자료타입
        // [2] 선언 : 타입[] 변수명 = new 타입[총 개수];
        // [3] 특징 : (1) 동일한 타입끼리  (2) 고정길이 (3) 요소의 초기값 존재
        // [4] 인덱스란? 배열내 요소(값)들이 저장된 순서 번호, 0번 시작
        int [ ] arr1 = new int [3];  // {0, 0, 0}
        String [] arr2 = {"봄", "여름", "가을", "겨울" };  // {초기값1, 초기값2, 초기값3, 초기값4}
        // [5] 배열변수명의 출력
        System.out.println(arr1);  // [I@23fc625e : 배열의주소(메모리위치)값 출력  *주소값은 개발자가 제어불가능
        System.out.println(arr2); // [Ljava.lang.String;@3f99bd52
        // [6] 배열변수의 요소/값 전체 출력, Arrays.toString(배열변수명)
        System.out.println(Arrays.toString(arr1)); // [0, 0, 0]
        System.out.println(Arrays.toString(arr2)); //[봄,여름,가을,겨울]
        //배열의 베모리 주소 상태 간단 구조
        // [7] 배열의 사용
        System.out.println(arr1.length); // 배열변수명.length : 배열의 총길이 = 3
        // [8] 배열내 요소 값 수정, 변수값이 변경되는거지 주소가 변경되는 것은 아니다.
        arr1[0] = 10; // 배열변수명[인덱스] = 새로운값
        System.out.println(arr1[0]); // 10
        arr2[0] = "spring";
        System.out.println(arr2[0]);
        //[9] 배열 요소 추가/삭제 없음
        // arr1[4] = 40;   배열 요소 추가 및 삭제 안됨

        // [10] 반복문 활용
        for(int index = 0; index<=arr1.length-1; index++){
            System.out.println(arr1[index]);
        }
        // [11] 항상된 for문 : 위와 같이 많이 사용되서 추가된 반복문
        //for(타입 반복변수 : 배열변수명){} . interator(이터레이터/반복자/순회자)가 가능한 배열/객체만 사용 가능
        for( int value : arr1){
            System.out.println(value);
        }


    }
}
