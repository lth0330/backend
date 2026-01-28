package day07;

public class Phone {

    // 1. 맴버변수 - 속성
    String model;
    String color;
    int price;
    // 2. 생성자
        // 1. 클래스명과 동일하게 생성자명을 작성한다.
    Phone(){}
        // 2. () 안에 매개변수 정의한다.
        // 3. 매소드 다른점은 반환타입 없다.
    Phone(String model, String color){
        this.model = model;
        this.color = color;
    }
        // 4.
    Phone(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = (int)(price *0.8);

    }
    // 3. 메소드
}


