package day14;

import java.awt.desktop.SystemEventListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {

        // [타이머 만들기]
        시계스레드 시계스레드 = new 시계스레드();
        Thread thread1 = new Thread(시계스레드);
        thread1.start();
        // [타이머스레드 만들기]
        타이머스레드 타이머스레드 = new 타이머스레드();
        타이머스레드.start();  //타이머 스레드 시작

        // [Main Thread 입력]
        for (;;){
            System.out.println("타이머 : 1)on 2)off : ");
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();
            if (ch == 1){
                타이머스레드 = new 타이머스레드();
                타이머스레드.state = true;
                타이머스레드.start();
            }
            else if(ch == 2){
                if (타이머스레드 !=null){
                    타이머스레드.state = false;
            }
        }
            }

    } // main end
} // class end

class 시계스레드 implements Runnable{
    @Override
    public void run() { // run 정의
        for(;;){
            System.out.println(LocalTime.now()); //현재시간
            try {
                Thread.sleep(1000); // main 스레드가 아닌 현재 작업스레드 1초 일시정지
            }catch (Exception e){}

        } // for end
    }
}

class 타이머스레드 extends Thread{
    boolean state = false;  // 타이머 실행 상태
    @Override
    public void run() {
        int secnod =0; // 타이머가 계산하는 초
        for(;;){
            if(!state){break;}
            secnod++;
            System.out.printf("[타이머] : %d 초 \n",secnod);
            try {
                Thread.sleep(1000); // main 스레드가 아닌 현재 작업스레드 1초 일시정지
            }catch (Exception e){}
        }
    }
}