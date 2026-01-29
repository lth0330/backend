package 실습;

import java.util.Scanner;

public class 실습4 {
    public static void main(String[] args) {


        Scanner scan4  = new Scanner(System.in);

        double d0 = scan4.nextDouble();
        System.out.println(d0);

        System.out.println("1. int 정수 2개 입력");
        int i1 = scan4.nextInt();
        int i2 = scan4.nextInt();
        if(i1 + i2 >=90) {
            System.out.println("성공");
        }
        else {
            System.out.println("실패");
        }


        System.out.println("2. 정수 2개 입력 더 큰 수 출력");
        int i3 = scan4.nextInt();
        int i4 = scan4.nextInt();
        if(i3 > i4){
            System.out.println(i3);
        }
        else if(i3 <i4){
            System.out.println(i4);
        }
        else{
            System.out.println("값 동일 : " +i3);
        }

        System.out.println("3. 아이디, 비번 입력");
        String s1 = scan4.next();
        String s2 = scan4.next();

        if(s1.equals("admin") && s2.equals("1234")){
            System.out.println("로그인 성공");
        }
        else {
            System.out.println("로그인 실패");
        }

        System.out.println("4. 비밀번호 입력, 길이 출력 ");
        String s3 = scan4.next();
        if(s3.length() < 8 ){
            System.out.println("보안등급 약함(8자 이상으로 설정)");
        }
        else if(s3.length() <12){
            System.out.println("보안등급 보통");
        }
        else {
            System.out.println("보안등급 강함");
        }

        System.out.println("5. 주민등록번호 입력");
        String s4 = scan4.next();

        if(s4.length() != 14){
            System.out.println("다시입력");
        }
        else if (s4.charAt(7) == '1' || s4.charAt(7) == '3'){
            System.out.println("남자");
        }
        else if (s4.charAt(7) == '2' || s4.charAt(7) == '4'){
            System.out.println("여자");
        }
        else {
            System.out.println("다시 입력");
        }

        System.out.println("6. 정수 입력, 상품 출력");
        int i5 = scan4.nextInt();
        if(i5 >= 900){
            System.out.println("A등급 경품");
        }
        else if(i5 >= 700){
            System.out.println("B등급 경품");
        }
        else if (i5 >=500) {
            System.out.println("C등급 경품");
        }
        else {
            System.out.println("참가상");
        }

        System.out.println("7. 역할입력, 접근메세지 출력");
        String s5 = scan4.next();

        switch (s5) {
            case "admin":
                System.out.println("모든 기능에 접근 가능");
                break;
            case "editor":
                System.out.println("콘텐츠 수정 및 생성 기능에 접근 가능");
                break;
            case "viewer" :
                System.out.println("콘텐츠 조회만 가능");
                break;
            default:
                System.out.println("정의되지 않은 역할");
        }

        System.out.println("8. 나이 입력, 입장료 출력");
        int i6 = scan4.nextInt();
        if(i6<8){
            System.out.println("입장료 무료");
        }
        else if(i6<=19){
            System.out.println("5,000원");
        }
        else if(i6 <65){
            System.out.println("10,000원");
        }
        else {
            System.out.println("다시입력");
        }

        System.out.println("9. 점수입력 등급 출력");
        int i7 = scan4.nextInt();
        if(i7>=90){
            System.out.println('B');
        }
        else if(i7 >=80){
            System.out.println('B');
        }
        else if(i7 >=70){
            System.out.println('C');
        }
        else {
            System.out.println("재시험");
        }


        System.out.println("10. 구매금액 입력, 할인율 적용 금액 출력");
        double d1 = scan4.nextDouble();

        if(d1 >=50000){
           d1 = d1*0.9;
            System.out.println(d1);
        }
        else if(d1 >=30000){
            d1 = d1*0.95;
            System.out.println(d1);
        }
        else if(d1 >10000){
            d1 = d1*0.99;
            System.out.println(d1);
        }
        else {
            System.out.println(d1);
        }

        System.out.println("11. 월 입력, 계절출력");
        int i8 = scan4.nextInt();

        switch (i8){
            case 3 :
            case 4 :
            case 5 :
                System.out.println("봄");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("여름");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("가을");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("겨울");
                break;
            default:
                System.out.println("다시입력");
        }

        System.out.println("12. 정수 3개 입력, 가장 큰 수 출력");
        int i9 = scan4.nextInt();
        int i10 = scan4.nextInt();
        int i11 = scan4.nextInt();


        System.out.println(" 정수 3개 입력"); // 스왑 : 두 변수간의 자료 교환, int temp = data1;  data1 =data2; data2  = temp;
        //{안에서 선언된 변수는 지역변수 특징을 갖는다.}
        int data1 = scan4.nextInt();
        int data2 = scan4.nextInt();
        int data3 = scan4.nextInt();

        if(data1 > data2){int temp = data1; data1 = data2; data2 = temp;}
        if(data1 > data3){int temp = data1; data1 = data3; data3 = temp;}
        if(data2 > data3){int temp = data2; data2 = data3; data3 = temp;}
        System.out.printf("%d, %d, %d" , data1, data2, data3);
    }
}
