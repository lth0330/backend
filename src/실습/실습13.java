package 실습;

public class 실습13 {
    public static void main(String[] args) {
        // [1] 다형성특징 : 상속(+객체) vs 인터페이스( - 객체)

        System.out.println("==============문제 1번===============");
        Dog dog = new Dog();
        Soundable soundable = new Cat();
        soundable.makeSound();
        soundable = dog;
        soundable.makeSound();

        System.out.println("==============문제 2번===============");
        System.out.println(RemoteControl.MAX_VOLUME);;
        System.out.println(RemoteControl.Min_VOLUME);

        System.out.println("==============문제 3번===============");
        Runnable runner;
        runner = new Person(); runner.run();
        runner = new Car();  runner.run();

        System.out.println("==============문제 4번===============");
        Sward sward = new Sward();
        Gun gun = new Gun();
        Character character =new Character();
        character.useWeapon(sward);
        character.useWeapon(gun);

        System.out.println("==============문제 5번===============");






            }
        }

/*------------------------------[문제 1] 기본 인터페이스와 구현----------------------*/

interface Soundable { public abstract void makeSound();}

class Cat implements Soundable {
    public void makeSound() {
        System.out.println("야옹.");
    }
}
class Dog implements Soundable {
    public void makeSound() {
        System.out.println("멍멍.");

    }
}

// ----------------------------[문제 2] 인터페이스 상수------------------------
interface RemoteControl{
    public static final int MAX_VOLUME = 10;
    public static final int Min_VOLUME = 0;
}

//---------------------[문제 3] 다형성: 인터페이스 타입 변환----------------------
interface Runnable{
    public abstract void run();
}
class Person implements Runnable{
    public void run(){System.out.println("사람이 달립니다.");}
}
class Car implements Runnable{
    public void run(){System.out.println("자동차가 달립니다.");}
}

//---------------------[문제 4] 다형성을 활용한 매개변수----------------------
interface Attackable{
    public abstract void attack();
}
class Sward implements Attackable{
    public void attack(){
        System.out.println("검으로 공격");
    }
}
class Gun implements Attackable{
    public void attack(){
        System.out.println("총으로 공격");
    }
}
class Character{

    public void useWeapon(Attackable weapon){
        weapon.attack();
    }
}

//---------------------[문제 5] 다중 인터페이스 구현----------------------
interface Flyable{
    public abstract void fly();

}
interface Swimmable{
    public abstract void swimmable();
}

