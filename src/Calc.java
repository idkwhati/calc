import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;


public class Calc {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws ScriptException {


        while (true) {
            System.out.println("Choose type of calculator?\n 1.Type in equation\n 2.Choose from list");

            int typeOfCalculator = s.nextInt();
            if (typeOfCalculator == 1) {

                System.out.println("Type in equation (e.g. 5+5)");
                String equation= s.next();
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine se = manager.getEngineByName("JavaScript");
                Object result = se.eval(equation);
                System.out.println(result);
                askingForEndingProgram();
            } else if (typeOfCalculator == 2) {

                System.out.println("What type of calculation?\n 1.Float\n 2.Int");
                int typeOfCalculationSelect = s.nextInt();
                if (typeOfCalculationSelect == 1) {//calculation on Float
                    System.out.println("What kind of operation would you like to use?\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");

                    int optionKindOfOperation = s.nextInt();
                    if (optionKindOfOperation > 4 || optionKindOfOperation <= 0) {
                        System.out.println("Error, wrong operation!");
                    } else {
                        System.out.println("Type in numbers: ");
                        float no1 = s.nextFloat();
                        float no2 = s.nextFloat();
                        calculateOnFloat(no1, no2, optionKindOfOperation);
                        askingForEndingProgram();
                    }
                } else if (typeOfCalculationSelect == 2) {//calcuation on Int
                    System.out.println("What kind of operation would you like to use?\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");

                    int optionKindOfOperation = s.nextInt();
                    if (optionKindOfOperation > 4 || optionKindOfOperation <= 0) {
                        System.out.println("Error, wrong operation!");
                    } else {
                        System.out.println("Type in numbers: ");
                        int no1 = s.nextInt();
                        int no2 = s.nextInt();
                        calculateOnInt(no1, no2, optionKindOfOperation);
                        askingForEndingProgram();
                    }
                } else {
                    System.out.println("Wrong argument!");
                }
            }
        }
    }

    private static void calculateOnFloat(float x1, float x2, int selected) {

        switch (selected) {

            case 1:
                System.out.println("Result: " + (x1 + x2));
                break;
            case 2:
                System.out.println("Result: " + (x1 - x2));
                break;
            case 3:
                System.out.println("Result: " + (x1 * x2));
                break;
            case 4:
                if (x2 == 0.0) {
                    System.out.println("You've divided by 0 !!");
                    break;
                }
                System.out.println("Result: " + (x1 / x2));
                break;

            default:
                System.out.println("Error");
        }


    }

    private static void calculateOnInt(int x1, int x2, int selected) {

        switch (selected) {

            case 1:
                System.out.println("Result: " + (x1 + x2));
                break;
            case 2:
                System.out.println("Result: " + (x1 - x2));
                break;
            case 3:
                System.out.println("Result: " + (x1 * x2));
                break;
            case 4:
                if (x2 == 0) {
                    System.out.println("You've divided by 0 !!");
                    break;
                }
                System.out.println("Result: " + (x1 / x2) + " r " + (x1 % x2));
                break;

            default:
                System.out.println("Error");
        }


    }

    private static void askingForEndingProgram() {
        while (true) {
            System.out.println("Do you want to recalc? (y-yes | n-no) ");
            char lastOption = s.next(".").charAt(0);
            if (lastOption == 'y') {
                break;
            } else if (lastOption == 'n') {
                System.exit(0);
            } else {
                System.out.println("Wrong argument ");
            }

        }
    }
}
