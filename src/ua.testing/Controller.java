package ua.testing;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //The work method
    public void processUser() {
        int number = model.generateRandomInt();
        System.out.println("Our number is " + number);
        view.printMessage(View.START_GUESS);
        Scanner sc = new Scanner(System.in);
        guessMethod(number, sc);
    }

    //The Utility method
    public int checkInput(Scanner sc) {
        String str = "";
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT);
            str = sc.next();
        }
       // str = sc.nextInt();
        int number = sc.nextInt();
        return number;
    }
        public int checkValue(Scanner sc, int num) {
            while (num < model.MIN_VALUE || num > model.MAX_VALUE) {
                view.printMessage(View.OUT_OF_RANGE);
                num = sc.nextInt();
            }
            return num;
        }

    public void guessMethod(int num, Scanner sc) {
        //String str = "";
        //int input = Integer.parseInt(str);
        int min = 0;
        int max = 0;
        while (true) {
            int str = checkInput(sc);
            int input = checkValue(sc, str);
            if (input != num) {
                if(input>num) {
                    model.setMaxNumber(input);
                    max = model.getMaxNumber();
                    model.addMaxNumber();
                }else if(input<num){
                    model.setMinNumber(input);
                    min = model.getMinNumber();
                    model.addMinNumber();
                }
                view.printMessage(View.RANGE+' '+min+'-'+max);
            } else {
                view.printMessage(View.CONGRAT);
                view.printMessage(View.STATISTIC);
                model.getStatistic();
                System.out.println(model.toString());
                break;
            }
        }
    }
}
