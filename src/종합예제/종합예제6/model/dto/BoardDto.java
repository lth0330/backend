package 종합예제.종합예제6.model.dto;

public class BoardDto {
// 1. 맴버변수 = 속성 = 테이블(표)
    private  int no;
    private String content;
    private String writer;

    // 2. 생성자 : 관례적으로 기본생성자 + 풀생성자
    public  BoardDto(){}
    public BoardDto(int no, String content, String writer){
        this.no = no;
        this.content = content;
        this.writer = writer;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "no=" + no +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
