package 종합예제;

import java.util.Scanner;

public class 종합예제3 {
    public static void main(String[] args) {

        // [1] Board 클래스 선언
        // [2] Board 객체 여러개 저장 = 배열
        Board[] boards = new Board[100];
        boolean check = false;
        for( ; ;){
            System.out.println("============My Community==============");
            System.out.println("1. 게시물 쓰기 |  2. 게시물 출력");
            System.out.println("======================================");
            System.out.println("선택>");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if( ch == 1 ){
                System.out.println(" 내용 : "); String content = scan.nextLine();
                System.out.println(" 작성자 : "); String name = scan.nextLine();
                Board board = new Board();
                board.내용 = content; board.작성자 = name;

                for(int index = 0; index <=boards.length-1; index++){
                    if(boards[index]== null){
                        boards[index] = board;
                        check = true;
                        break;
                    }
                }if(check == true){
                    System.out.println(" 글쓰기 성공");
                }
                else{
                    System.out.println("공간부족");}
            }else if( ch == 2){
                for(int index =0; index<=boards.length-1; index++){
                    if(boards[index] != null){
                        System.out.println("내용 : " + boards[index].내용);
                        System.out.println("작성자 : " +boards[index].작성자 );
                    }
                    else {
                        System.out.println(index +"까지 출력완료");
                        break;
                    }
                }
            }
        }
    }
}
