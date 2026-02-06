package 종합예제.종합예제7.model.dto;

public class BoardDto {
    // 맴버변수 : 데이터베이스의 속성명과 일치, +기능에 따라 추가
    private int bno;
    private String bcontent;
    private String bwriter;
    private String bdate;

    // 기본생성자1, 전체매개변수생성자, +기능에 따라 필요한 생성자 추가
    public  BoardDto() {}

    public BoardDto(int bno, String bcontent, String bWriter, String bdate) {
        this.bno = bno;
        this.bcontent = bcontent;
        this.bwriter = bWriter;
        this.bdate = bdate;
    }
    public int getBno() {return bno;}
    public void setBno(int bno) {this.bno = bno;}
    public String getBcontent() {return bcontent;}
    public void setBcontent(String bcontent) {this.bcontent = bcontent;}
    public String getbWriter() {return bwriter;}
    public void setbWriter(String bWriter) {this.bwriter = bWriter;}
    public String getBdate() {return bdate;}
    public void setBdate(String bdate) {this.bdate = bdate;}

    @Override
    public String toString() {
        return "BoardDto{" +
                "bno=" + bno +
                ", bcontent='" + bcontent + '\'' +
                ", bWriter='" + bwriter + '\'' +
                ", bdate='" + bdate + '\'' +
                '}';
    }
}