package 종합예제.종합예제7.controller;

import 종합예제.종합예제7.model.dao.BoardDao;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return  instance;}

    private BoardDao bd = BoardDao.getInstance();

    //[1] 게시물 들록 controller
    public boolean write(String bcontent, String bwriter){
        boolean result = bd.write(bcontent, bwriter);
        return result;
    }


} // class end
