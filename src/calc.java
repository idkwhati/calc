import java.util.Scanner;


public class calc {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Jakie dzialanie chcesz wykonac?\n" + "1.Dodawanie\n" + "2.Odejmowanie\n" + "3.Mnozenie\n" +
                    "4.Dzielenie\n" + "5.Modulo");


            int option = s.nextInt();
            if(option > 5)
            {
                System.out.println("error");

            }
            else {
                System.out.println("Podaj liczby: ");
                float liczba1 = s.nextFloat();
                float liczba2 = s.nextFloat();

                switch (option) {

                    case 1:
                        System.out.println("Wynik: " + (liczba1 + liczba2));
                        break;
                    case 2:
                        System.out.println("Wynik: " + (liczba1 - liczba2));
                        break;
                    case 3:
                        System.out.println("Wynik: " + (liczba1 * liczba2));
                        break;
                    case 4:
                        if (liczba2 == 0) {
                            System.out.println("Dzielenie przez 0 !!");
                            break;
                        }
                        System.out.println("Wynik: " + (liczba1 / liczba2));
                        break;
                    case 5:
                        System.out.println("Wynik: " + (liczba1 % liczba2));
                        break;
                    default:
                        System.out.println("error");
                }
                System.out.println("Czy chcesz policzyc ponownie? (y-tak | n-nie) \n");
                char lastoption = s.next(".").charAt(0);
                if (lastoption == 'y') {
                } else if (lastoption == 'n') {
                    System.exit(0);
                }
            }

        }
    }
}
