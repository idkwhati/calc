import java.util.Scanner;



public class Calc {
public static void calculate (float x1, float x2, int selected){

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
            System.out.println("Result: " + (x1 / x2));
            break;
        case 5:
            System.out.println("Result: " + (x1 % x2));
            break;
        default:
            System.out.println("Error");
    }


}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("What kind of operation would you like to use?\n"+"1.Addition\n"+"2.Subtraction\n"+
                    "3.Multiplication\n"+"4.Division\n"+"5.Modulo");


            int option = s.nextInt();
            if(option > 5 || option == 0)
            {
                System.out.println("Error");

            }
            else {
                System.out.println("Type in numbers: ");
                float no1 = s.nextFloat();
                float no2 = s.nextFloat();
                calculate(no1,no2,option);

                while(true) {
                    System.out.println("Do you want to recalc? (y-yes | n-no) ");
                    char lastoption = s.next(".").charAt(0);
                    if (lastoption == 'y') {
                        break;
                    } else if (lastoption == 'n') {
                        System.exit(0);
                    } else if (lastoption != 'n' || lastoption != 'y') {
                        System.out.println("Wrong args ");
                    }
                }
            }

        }
    }


}
