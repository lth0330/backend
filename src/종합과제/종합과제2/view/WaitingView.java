package 종합과제.종합과제2.view;

import 종합과제.종합과제2.controller.WaitingController;
import 종합과제.종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {

    private WaitingView() {
    }

    private static final WaitingView instance = new WaitingView();

    public static WaitingView getInstance() {
        return instance;
    }

    private WaitingController wc = WaitingController.getInstance();

    private Scanner scan2 = new Scanner(System.in);

    public void writeView() {
        scan2.nextLine();
        System.out.print("전화번호 : ");
        String phone = scan2.nextLine();
        System.out.println("인원수 : ");
        int count = scan2.nextInt();

        boolean result = wc.waitingPost(phone, count);

        if (result) {
            System.out.println("웨이팅 성공 ");
        }else{
            System.out.println("웨이팅 실패");}
    }

    public void printView(){
        ArrayList<WaitingDto> waitings = wc.waitingGet();
        for (WaitingDto waiting : waitings){
            System.out.printf("대기번호 : %d, 전화번호 : %s, 인원수 : %d\n", waiting.getNo(), waiting.getPhone(), waiting.getCount());
        }
    }
}