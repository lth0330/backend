package 종합예제.종합예제6.view;

import 종합예제.종합예제6.controller.BoardController;

import java.util.Scanner;

public class BoardView {
    // * 싱글톤 생성
    private BoardView(){}; // [1]
    private static  final BoardView instance = new BoardView();
    public  static BoardView getInstance(){
        return instance;
    }
    // * MVC 패턴 흐름의 controller 싱글톤 호출
    private  BoardController bc = BoardController.getInstance();

    // * 입력객체는 모든 메소드가 사용가능하도록 지역변수말고 매소드 밖에서 선언
    Scanner scan = new Scanner(System.in);
    // 1) 등록 입출력 화면
    public void writeView(){
        System.out.println(" 내용 : "); String content = scan.nextLine();
        System.out.println(" 작성자 : "); String writer = scan.nextLine();
      boolean saveResult =  bc.doPost(content,writer);// 컨트롤러에게 입력받은 content와 writer을 전달하여 결과 받아오기

    }
}
