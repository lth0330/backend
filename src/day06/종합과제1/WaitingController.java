package day06.종합과제1;

public class WaitingController {

    Waiting [] waitings = new Waiting[100];
    boolean addWaiting(String phone, int count){
        Waiting waiting = new Waiting();
        for(int index =0; index<=waitings.length-1; index++){
            if(waitings[index] == null){
                waitings[index] = waiting;
                return true;
            }
        }return false;
    }

    Waiting [] getWaitingList(){
        return waitings;
    }
}