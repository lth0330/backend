package 종합예제.종합예제6.model.dao;

import 종합예제.종합예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}; // [1]
    private static final BoardDao instance = new BoardDao();
    public  static BoardDao getInstance(){
        return instance;
    }

    private static final ArrayList<BoardDto> boardDB = new ArrayList<>();  // 나중에 삭제 ( 데이스베이스 역할)
    // * 전역변수 최신 게시물번호 저장 < 식별키 생성 목적 : 추후에 삭제 예정>
    private static int currentNo  =1;

    // 3) 등록 처리
    public boolean doPost(String content, String writer){

        // 1. 매개변수에 ㄸ른 객체를 만든다. + 게시물번호 자동생성
        BoardDto boardDto = new BoardDto(currentNo, content, writer);
        // 2. add(새로운값) : 저장하면 true , 실패하면 false 반환하는 기/함수/매소드
        boolean 저장결과 = boardDB.add(boardDto);
        currentNo++; // 다음에 저장할 게시물의 번호 1증가
        // 3.
        return 저장결과;
    }

    public ArrayList<BoardDto> doGet(){
        return boards;
    }

    }
}
