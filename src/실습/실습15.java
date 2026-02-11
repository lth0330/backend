package 실습;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class 실습15 {
    public static void main(String[] args) {

/*[문제 1] BookDto는 toString()을 오버라이딩하지 않고 BoardDto는 toString()을 오버라이딩하도록 만든 뒤 Object 타입 변수에 저장하여
두 객체를 하나의 출력문으로 출력했을 때 결과 차이가 나타나게 만드세요.
[출력예시]
day.BookDto@7cca494b | BoardDto{...}
*/

Object o1 = new BookDto();
Object o2 = new BoardBto();

        System.out.println(o1);
        System.out.println(o2.toString());
/*[문제 2] new String("유재석")으로 생성한 두 객체의 == 와 equals() 비교 결과를  출력하시오.
[출력예시]
== 비교:false, equals 비교:true
*/

        Object str0 = new String("유재석");
        Object str10 = new String("유재석");
        System.out.println(str0 == str10);
        System.out.println(str0.equals(str10));

/*[문제 3] Class 리플렉션
1. String 객체를 하나 생성하고 getClass()를 이용하여 클래스 타입 정보를 가져오세요.
2. Class.forName("java.lang.String")을 사용하여 String 클래스를 직접 로드하세요.
3. 로드된 Class 객체에서 getMethods()를 사용하여 메소드 개수를 구하세요.
4. 위 결과들을  출력하시오.
[출력예시]
class java.lang.String | forName 성공 | method count:90
*/
 String str1 = new String();
 Class c1 = str1.getClass();
int m = 0;
        try {
            Class.forName("java.lang.String");
        }catch (ClassNotFoundException e){}

        Method[ ] methods = c1.getMethods(); // 클래스내 모든 메소드 확인
        for( int i = 0 ; i < methods.length ; i++ ){
            System.out.println( methods[i] );
            m++;
        }
        System.out.println(m);

/*[문제 4] 문자열 "100"과 "3.14"를 각각 기본타입으로 변환하고 기본타입을 문자열로 변환하는 방법을 포함하여 출력하시오.
[출력예시]
int:100, double:3.14, str1:"100", str2:"100"
*/

        String str4 ="100";
        String  str5 = "3.14";

        int val1 = Integer.parseInt(str4);
        System.out.println("val1 = " + val1);
        double val2 = Double.parseDouble(str5);
        System.out.println("val2 = " + val2);

/*[문제 5] LocalDateTime.now()로 현재 날짜/시간을 생성하고 지정된 포맷으로 변환 후 +10일, -30일 계산 결과를  출력하시오.
[출력예시]
현재:2025년 07월 25일 11:43:11 | +10일:2025-08-04T11:43:11 | -30일:2025-06-25T11:43:11
*/

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime Dayplus10 =localDateTime.plusDays(10);
        System.out.println("Dayplus10 = " + Dayplus10);
        LocalDateTime Dayminus30 = localDateTime.minusDays(30);
        System.out.println("Dayminus30 = " + Dayminus30);
    }
} // class end

class BookDto{}
class BoardBto{
    @Override
    public String toString() {
        return "BoardBto{}";
    }
}