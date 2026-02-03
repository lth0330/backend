package day09;

public class Exam4 {
    public static void main(String[] args) {

    Car myCar = new Car();
    myCar.tire = new Tire();
    myCar.run();

    System.out.println("===========");
    myCar.tire = new HankTire();
    myCar.run();

    System.out.println("==========");
    myCar.tire = new KumTire();
    myCar.run();

    System.out.println("===============");
    System.out.println(myCar.tire instanceof Tire);
    System.out.println(myCar.tire instanceof KumTire);
    System.out.println(myCar.tire instanceof HankTire);


    }
}

class Car{
    Tire tire;
    void run(){this.tire.roll();}
}

class  Tire{
    void roll(){
        System.out.println("일반 타이머가 회전");
    }
}

class HankTire extends Tire{

    void roll (){
        System.out.println("[한] 타이어가 회전");
    }
}

class KumTire extends Tire{

    void roll(){
        System.out.println("[금] 타이어가 회전");
    }
}