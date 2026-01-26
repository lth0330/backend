package day05;

import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {

        String content1 = null;
        String writer1 = null;
        String content2 = null;
        String writer2 = null;
        String content3 = null;
        String writer3 = null;

        System.out.println("my Community/");
        System.out.println("1. 게시물 쓰기, 2. 게시물 출력");
        System.out.println("===========================");
        System.out.println("선택>1");
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();
        scan.nextLine(); // 뒤에 nextLine()를 쓰기 때문에 앞에 의미 없는 nextLine() 하기
        if( ch ==1){
            System.out.println("내용:");   String 내용 = scan.nextLine();
            System.out.println("작성자 : "); String 작성자 = scan.nextLine();
            if(content1 == null && writer1 == null){
                content1 = 내용; writer1 = 작성자; // 변수의 수정
            }
            else if(content2 == null && writer2 == null){
                content2 = 내용; writer2 = 작성자;
            }
            else if(content3 == null && writer3 == null){
                content3 = 내용; writer3 = 작성자;
            }
            else {
                System.out.println("게시물 등록할 공간이 없습니다.");
            }
            System.out.println("[안내]글쓰기 성공");
        }
        else if( ch == 2){
            if(content1 != null && writer1 !=null){
                System.out.printf(" 작성자 : %s, 내용 : %s\n", content1, writer1);
            }
        }   if(content2 != null && writer2 !=null){
            System.out.printf(" 작성자 : %s, 내용 : %s\n", content2, writer2);
        }   if(content3 != null && writer3 !=null){
            System.out.printf(" 작성자 : %s, 내용 : %s\n", content3, writer3);
        }
    }
}
