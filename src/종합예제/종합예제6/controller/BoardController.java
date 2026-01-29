package 종합예제.종합예제6.controller;

import 종합예제.종합예제6.view.BoardView;

public class BoardController {

    private BoardController(){}; // [1]
    private static  final BoardController instance = new BoardController();
    public  static BoardController getInstance(){
        return instance;
    }

    // * MVC 패턴 흐름의 dao 싱글톤 호출
    private BoardView bd = BoardView.getInstance();


    // 1) 등록 제어
    public boolean doPost(String content, String writer){
        boolean saveResult = bd.doPost(content, writer);
        return saveResult;
    }
}
