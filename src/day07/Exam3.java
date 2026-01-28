package day07;

public class Exam3 {
    public static void main(String[] args) {




        // [1] 맴버변수가 private라면 다른 클래스 접근 불가능
        User user = new User();   //불가

        // getter를 이용한 맴버변수 접근
        user.setName("유재석");
        System.out.println(user.getName());

        // [2] toString
        System.out.println(user);  // toString 오버라이드가 없으면 주소값 출력 , 있으면 재정의한 값 출력
    }
}
class User{
    // 1. 맴버 변수
    private String name;
    private int age;
    // 2. 생성자
    // 3. 매소드
    // *** 관례적으로 private 맴버변수에 대해 간접접근 메소드 *
    // getter 매소드 : 호출용
    public String getName(){
        return this.name;
    }
    // setter 매소드 : 저장용
    public  void setName(String name){
        this.name =name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // * toString() 매소드
    // 모든 클래스가 자동으로 갖고 있는 매소드중 하나.
    // 객체의 주소(위치)값 출력
    // 자동 : 클래스 내 마우스 오른쪽 클릭 -> 생성 -> toString
    @Override // 기존 매소드를 커스텀/재정의
    public String toString() {
        // + 객체의 주소값 대신에 출력하고 싶은것
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}