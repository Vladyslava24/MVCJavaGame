package ua.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 100;
    private List<Integer> statistics = new ArrayList<Integer>();

    private int minNumber;
    private int maxNumber;

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int generateRandomInt(){
        Random random = new Random();
        int num = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE);
        return num;
    }

    public void addMinNumber(){
        statistics.add(minNumber);
    }

    public void addMaxNumber(){
        statistics.add(maxNumber);
    }


    public List<Integer> getStatistic(){
        return statistics;
    }

    @Override
    public String toString() {
        return "Model{" +
                "statistics=" + statistics +
                '}';
    }
}

