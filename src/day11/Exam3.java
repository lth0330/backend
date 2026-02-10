package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam3 {
    public static void main(String[] args) {

        //[JDBC] : 자바 데이터베이스 연동 라이브러리
        // mysql-connector-j-9.6.0.jar
        // 준비된 .jar 파일을 프로젝트 폴더에 넣어준다
        // .jar 파일을 오른쪽 클릭 -> 라이브러리 추가(프로젝트 마다 1번)

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydb0205";
            String user = "root";
            String password = "1234";

            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("=======연동 성공=======");

            String sql = "insert into buy values(null, 'BLK', '지갑',null,30,2)"; // 실행할 sql 문법 문자열로 작성
            PreparedStatement ps = conn.prepareStatement(sql); // 실행 메소드 사용
            int count = ps.executeUpdate();// 기개된 sql 실행
            System.out.println("등록된 개수는 "+count+"개 입니다.");
        }catch (ClassNotFoundException e){
            System.out.println("JDBC 클래스 호출 실패");
        }catch (SQLException e){
            System.out.println("등록된 DB 서버로 연동 실패");
        }
    }
}
