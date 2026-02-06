package 종합예제.종합예제7.model.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return  instance;}

    // ============= 데이터 베이스 연동 ==================

        // 1) 연동할 db서버의 정보
        private String url = "jdbc:mysql://localhost:3306/boardservice7";
        private String user = "root";
        private String password = "1234";

        // 2) 연동 인터페이스 변수 선언
        Connection conn;

        // 3) 연동 함수 정의, dao에
        private void connect()
            {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection(url,user,password);
                    System.out.println("=======연동 성공=======");
                }catch (Exception e) {
                    System.out.println("등록된 DB 서버로 연동 실패 : 관리자에게 문의");
                }
            }
    // [1] 게시물 등록 dao
    public boolean write(String bcontent, String bwriter){
        try {


            // 1) SQL 작성 -> 저장 -> C -> INSERT,     ?와일드 카드 기호로 변수값이 들어갈 자리를 뜻한다.
            String sql = "insert into board(bcontent, bwriter) values(?, ?)";
            // 2) 연동된(Conn) 인터페이스에 내가 작성한SQL를 기재한다. 반환 preparedStatement 준비된 *
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3) SQL이 기재된(ps) 인터페이스에 sql매개변수 대입,   // ps.set타입명( ?순서번호, 값);
            ps.setString(1, bcontent); // String 타입으로 SQL 내 1번 ?에 bcontent값 대입
            ps.setString(2, bwriter);  // String 타입으로 SQL 내 2번 ?에 bwriter값 대입
            // 4) 매개변수까지 대입하여 준비가 끝났으면 sql 실행
            int count = ps.executeUpdate();
            // 5) SQL 실행 후 반영된 레코드 수에 따른 결과 제어
            if(count == 1){return true;}  // 등록된 레코드 수가 1이면 등록성공
            else {return  false;} // 아니면 실패
        }catch (SQLException e){
            System.out.println("[시스템오류] SQL 문법 문제 발생 " + e );
        }
        return false; // 아니면 실패
        }

} // class end
















