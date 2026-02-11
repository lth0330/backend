package day13;

import java.util.Arrays;

public class Exam2 {

    public static void main(String[] args) {


        // String 클래스
        // 1. 문자열 표현 방법
        char str1 = '유';
        char [] str2 = {'유','재','석'};

        // 2. 문자 변환, 아스키코드(C언어), 유니코드(자바)
        char str3 = 65;
        System.out.println("str3 = " + str3);
        char  [] str4 = {74, 65, 86, 65};
        System.out.println("str4 = " + Arrays.toString(str4));
        char str5 = '이';
        System.out.println("(int)str5 = " + (int)str5);


        // 3. 문자열 생성
        String str6 = "유재석";  // 문자 리터럴 형식
        String  str7 = "유재석";   // 문자 리터럴 형식 VS
        String str8 = new String("유재석"); // 문자 객체 형식
        System.out.println(str6 == str7);
        System.out.println(str6 == str8);
        System.out.println(str6.equals(str8));


        // 4. 주요 기능/매소드
            // 1) "문자열".concat("새로운문자") : 문자열에 새로운 문자열을 연결하여 *(새로운)*반환을 하는 함수
        String str9 = "자바 "; // str9 주소값
        System.out.println(str9.concat("프로그래밍"));  // str9의 주소값하고 다름
            // 2) "문자열" + "새로운문자열" :  + 연결연산자 , 연견된 문자열이 반환된다.
        String str11 =str9 + "프로그래밍";
        System.out.println("str11 = " + str11);

            // 3)StringBuilder 클래스,  .append 함수를 이용하여 문자열을 연견하는 객체, 연견된 문자열에 따른 * 주소값 유지 *
        StringBuilder builder = new StringBuilder();
        builder.append(str9);
        builder.append("프로그래밍");
        System.out.println(builder);

            // 4) String.fotmat("%" , "문자열");
        String str12 = String.format( "%s%s", str9, "프로그래밍");
        System.out.println("str12 = " + str12);

            // 5)
        String str13 = """
            자바
            프로그래밍
            """;
        System.out.println("str13 = " + str13);


        // 활용 : JDBC SQL
        String sql1 = "insert into table(name) values (?) ";

            // 6) .chatAt(인덱스) , 문자열내 지정한 인덱스 번호의 문자1개 추출/반환
        char gender ="0123456-789456".charAt(9);
        System.out.println("gender = " + gender);

            // 7) .length() , 문자열내 문자 개수/길이 반환
        System.out.println("012345-123456789".length());

            // 8) .replace(기존 문자, 새로운 문자) : 문자열내 기존문자가 존재하면 새로운문자로 치환하여 문자열 반환
        String st14 = "자바 프로그래밍".replace("자바", "Java");
        System.out.println("st14 = " + st14);

            // 활용) HTML (데이터수집 과정 정제/정리)
        String html = "<div>유재석<div> <br/> <div>강호동<div> <br/>";
        System.out.println("html = " + html);
        System.out.println(html.replaceAll("<br/>", "\n")); // html 줄바꿈을 자바의 줄바꿈으로 치환


    }
}
