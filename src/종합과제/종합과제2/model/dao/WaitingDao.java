package 종합과제.종합과제2.model.dao;

import 종합과제.종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    private final ArrayList<WaitingDto> waitings = new ArrayList<>();


    private static int currentNo = 1;

    public boolean waitingPost(String phone, int count){
        WaitingDto waitingDto = new WaitingDto(currentNo, phone, count);
        boolean result = waitings.add(waitingDto);
        currentNo++;
        return result;
    }
    public ArrayList<WaitingDto> waitingGet(){
        return waitings;
    }
}
