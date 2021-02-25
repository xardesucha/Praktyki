import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zadanie 3
        Scanner sc = new Scanner(System.in);

        boolean programdziala = true;

        while (programdziala) {
            System.out.println("Podaj numer drzwi: ");
            String userInput = sc.next();

            switch (userInput) {
                case "1": {
                    System.out.println("Złe drzwi, wybierz inne");
                    break;
                }
                case "2": {
                    System.out.println("Złe drzwi, wybierz inne");
                    break;
                }
                case "3": {
                    System.out.println("Wybrałeś dobre drzwi, kox jesteś");
                    programdziala = false;
                    break;
                }
                case "4": {
                    System.out.println("Złe drzwi, wybierz inne");
                    break;
                }
                case "5": {
                    System.out.println("Złe drzwi, wybierz inne");
                    break;
                }
                default: {
                    System.out.println("Podałeś złą liczbę");
                }
            }
        }
    }
}