package day13;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Exam3 {
    public static void main(String[] args) {


        // [난수 클래스]
        // [1] 랜던 객체 생성

        Random random = new Random();
        // 1) 0~9 사이의 난수 생성,  .nextXXX(개수)
        int vla1 = random.nextInt();  // int 타입의 허용 범위내 난수생성
        System.out.println("vla1 = " + vla1);

        int val2 = random.nextInt(10);   // 0부터 9까지 내 난수 생성
        System.out.println("val2 = " + val2);

        // 2) 1 ~ 10사이의 난수 생성, nextXXX(개수) + 시작값
        int val3 = random.nextInt(10) + 1;
        System.out.println("val3 = " + val3);

        // 3) 0~1 사이의 실수 생성
        double val4 = random.nextDouble();
        System.out.println("val4 = " + val4);

        // 5)
        boolean val5 = random.nextBoolean();
        System.out.println("val5 = " + val5);
        // 활용처 1 :특정한 목록에서 하나의 항목 랜덤 선택
        ArrayList<String> list = new ArrayList<>();
        list.add("유재석"); list.add("강호동"); list.add("신동협");
        int index = random.nextInt(list.size());  // 리스트내 항목개수 만큼 난수 생성
        System.out.println("index = " + list.get(index));
        // 활용처 2 : 인증코드/ 임시비밀번호 생성
        String code = "";
        for(int i=1; i<=6; i++){
            int rand = random.nextInt(26) + 97;
            code += (char)rand;
        }
        System.out.println("code = " + code);
        // 활용처 3 : 주사위/로또번호 생성

        // [2] UUID : 범용 고유 식별자,
        String uuid = UUID.randomUUID().toString();
        System.out.println("uuid = " + uuid);
        /*
            UUID 장점
                - 중복될 확률이 거의 없다.
                - 랜덤 기반 식별자
            사용처 :
                - 데이타베이스 PK, 파일명, 로그인세션(Token) 등등
                    - (mysql) auto_increment : 1 2 3 4 5 순으로 증가하면 가볍고 노출이 쉽다.
                    - UUID : 난수이므로 무겁고 노출이 어렵다.
        */
    }
}
