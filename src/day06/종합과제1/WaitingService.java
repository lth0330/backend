package day06.종합과제1;

import java.util.Scanner;

public class WaitingService {
    public static void main(String[] args) {

        WaitingController controller = new WaitingController();
        for(;;){
            System.out.println("=========맛집 대기 시스템==========");
            System.out.println("1. 대기 등록  | 2. 대기 현황");
            System.out.println("=================================");
            System.out.println("선택 >");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();

            if(ch == 1){
                scan.nextLine();
                System.out.println("전화번호");
                String phone =scan.nextLine();
                System.out.println("인원");
                int count = scan.nextInt();

                boolean result = (controller.addWaiting(phone, count));
                if(result == true){
                    System.out.println("등록 완료");
                }else{
                    System.out.println("등록 실패");
                }


            }else if(ch == 2){
                Waiting[] = controller.getWaitingList();



            }

        }
    }
}
