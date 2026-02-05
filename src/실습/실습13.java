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

    }
}
/*[문제 1] 기본 인터페이스와 구현*/

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

// [문제 2] 인터페이스 상수

interface RemoteControl{
    public static final int MAX_VOLUME = 10;
    public static final int Min_VOLUME = 0;
}