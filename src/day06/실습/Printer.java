package day06.실습;

public class Printer {

    void printMessage() {
        System.out.println("안녕하세요 매소드입니다.");
    }
}

class Lamp {

    boolean turnOn() {
        return true;
    }

    boolean turnOff() {
        return false;
    }
}

class Product {
    String name;
    int stock;

    boolean sell(int x) {
        if (x > stock) {
            System.out.println("재고부족");
            return false;
        } else stock -= x;
        return true;
    }
}

class Visualizer {

    void getStars(int x) {
        for (int i = 0; i <= x - 1; i++) {
            System.out.print("★");
        }
    }
}
class ParkingLot{
    int calculateFee(int x){
        if(x <=30){
            return 1000;
        }else if( x <=380){
            return x*50+1000;
        }else {return 20000;}


        }
    }
