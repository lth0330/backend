package day01;

import java.util.Scanner;

public class 실습1 {
    public static void main(String[] args) {


        //  1번
        System.out.println(25);
        System.out.println("홍길동");

        // 2번
        int age = 27;
        System.out.println(age);

        // 3번
        String name = "이태형";
        int age2 = 27;
        double height = 177.7;

        // 4번
        System.out.println("제 이름은" + name + ",나이는" + age2 + "키는" +height + "입니다.");

        // 5번
        System.out.printf("제 이름은 %s, 나이는%d 키는 %4.1f입니다.",name, age2,height);

        // 6번
        System.out.println("|\\_/|");
        System.out.println("|qp|/}");
        System.out.println("(0)\"\"\"\\");
        System.out.println("|\"^\"'|");
        System.out.println("||_/=\\\\__|");

        // 7번
        int num = 1;
        String writer = "유재석";
        String content = "안녕하세요!";

        System.out.printf("번호 작성자   방문록 \n %d, %s, %s", num,writer, content);

        // 8번
        Scanner 입력변수  = new Scanner(System.in);
        System.out.println(" 이름을 입력하세요 : ");
        String name8 = 입력변수.nextLine();

        System.out.println(" 나이를 입력하세요 : ");
        int age8 = 입력변수.nextByte();

        System.out.printf("%s의 나이는 %d세 입니다.", name8, age8);


        // 9번


        System.out.println(" 게시물 번호 : ");
        int num9 = 입력변수.nextByte();


        입력변수.nextLine();
        System.out.println(" 제목 : ");
        String title9 = 입력변수.nextLine();


        System.out.println("내용 : ");
        String content9 = 입력변수.nextLine();

        System.out.printf("게시물 번호 : %d \n 제목 : %s \n 내용 : %s ",num9, title9,content9);


        // 10번
        System.out.println("\n성별을 입력하세요(남/여) : "); char man = 입력변수.next().charAt(0);
        System.out.printf("입력하신 성별은 %s입니다.",man);


        // 11번

        System.out.println("이름 : ");    String name11 = 입력변수.nextLine();
        System.out.println("나이 : ");    int age10 = 입력변수.nextInt();
        System.out.println("키 : ");      double tall = 입력변수.nextDouble();
        System.out.println("프로그래머 여부 : ");  Boolean tf = 입력변수.nextBoolean();

        System.out.printf("이름 : %s \n 나이 : %d\n  키 : %5.2f\n  프로그래머여부 %s: ",name11,age10,tall,tf  );
    }
}
