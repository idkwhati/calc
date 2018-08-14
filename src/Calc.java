import java.util.Scanner;



public class Calc {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //??? how to decalre as global variable????

        while (true) {
            System.out.println("What type of calculation?\n 1.Float\n 2.Int");
            int firstSelect = s.nextInt();
            if (firstSelect == 1){//calculation on Float
                System.out.println("What kind of operation would you like to use?\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");

                int option = s.nextInt();
                if (option > 4 || option == 0 || option < 0) {
                    System.out.println("Error, wrong operation!");
                } else {
                    System.out.println("Type in numbers: ");
                    float no1 = s.nextFloat();
                    float no2 = s.nextFloat();
                    calculateOnFloat(no1, no2, option);

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
            else if (firstSelect==2){//calcuation on Int
                System.out.println("What kind of operation would you like to use?\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");


                int option = s.nextInt();
                if (option > 4 || option == 0 || option < 0) {
                    System.out.println("Error, wrong operation!");
                } else {
                    System.out.println("Type in numbers: ");
                    int no1 = s.nextInt();
                    int no2 = s.nextInt();
                    calculateOnInt(no1, no2, option);

                    while (true) {
                        endOfProgram();
                    }
                }

            }else {
                System.out.println("Wrong argument!");
            }
        }
    }
    private static void calculateOnFloat (float x1, float x2, int selected){

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
    private static void calculateOnInt (int x1, int x2, int selected){

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
    private static void endOfProgram(){
        Scanner s = new Scanner(System.in);//??? how to decalre as global variable????
        System.out.println("Do you want to recalc? (y-yes | n-no) ");
        char lastOption = s.next(".").charAt(0);
        if (lastOption == 'y') {
            break; //???
        } else if (lastOption == 'n') {
            System.exit(0);
        } else {
            System.out.println("Wrong argument ");
        }


    }
}
