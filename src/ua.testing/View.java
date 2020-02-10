package ua.testing;

public class View {
    public static final String START_GUESS = "Enter number in range 0-100";
    public static final String OUT_OF_RANGE = "The number must be in range 0-100";
    public static final String RANGE = "The number is in range";
    public static final String WRONG_INPUT = "Wrong input! It must be a number";
    public static final String CONGRAT = "Congratulation! You guess a number!";
    public static final String STATISTIC = "Get the statistics of your game";

    public void printMessage(String message){
        System.out.println(message);
    }
}
