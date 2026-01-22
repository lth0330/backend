package day04;

public class Exam1 {
    public static void main(String[] args) {


        for (int i = 1; i <= 9; i++) {
            System.out.printf(i + "단 출력\n");
            for (int y = 1; y <= 9; y++) {

                System.out.println(i + "*" + y + "=" + i * y);
            }
        }

        // break  : 가장 가까운 반복문/switch문 {} 탈출
        //continue : 가장 가까운 반복문(증강식)이동.

        for (int i = 1; i <= 9; i++) {
            if (i == 3) {
                continue;
            }  // 다음 증강식으로 이동 (아래로 안가고)
            System.out.println("i");

            // 1, 2, 4, 5
            // 3출력안됨
        }

        // for( ;  ; ) {System.out.println("무한루프");}


        // while

12
    }
}
