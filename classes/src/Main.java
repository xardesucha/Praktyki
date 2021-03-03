import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Zad 1");
        System.out.println();
        Trojkat trojkat = new Trojkat(6, 8, 20);
        trojkat.ObliczPole();
        System.out.println(trojkat.getPole());

        System.out.println();
        System.out.println("zad 2");
        System.out.println();
        Prostokat prostokat = new Prostokat(6, 5);

        int pole = prostokat.obliczPole();

        double przekatna = prostokat.obliczPrzekatna();

        System.out.println("Pole = " + pole + "\t  Przek. = " + przekatna);

        prostokat.setBokA(6);
        System.out.println(prostokat.getBokA());

        System.out.println();
        System.out.println("zad 3");
        System.out.println();

        if(trojkat.getBokA()> prostokat.getBokA()){
            System.out.println("Bok trójkąta = "+trojkat.getBokA()+" jest większy od boku prostokąta = "+prostokat.getBokA());
        }
        if(trojkat.getBokA()< prostokat.getBokA()) {
            System.out.println("Bok prostokąta = " + prostokat.getBokA() + " jest większy od boku trójkąta = " + trojkat.getBokA());
        }

        System.out.println();
        System.out.println("zad 4");
        System.out.println();

                boolean programIsRunning = true;

                SimpleCalculator calculator = new SimpleCalculator();
                while (programIsRunning)
                {
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Co chcesz robić:\n[1] Dodać\n[2] Odjąć\n[3] Mnożyć\n[4] Dzielić\n[5] Wyjść");

                    String userChoice = sc.next();
                    System.out.println("Podaj a");
                    double a = sc.nextDouble();
                    System.out.println("Podaj b");
                    double b = sc.nextDouble();

                    switch (userChoice)
                    {
                        case "1": {
                            System.out.println(calculator.add(a, b) + "\n\n");
                            break;
                        }
                        case "2": {
                            System.out.println(calculator.difference(a, b));
                            break;
                        }
                        case "3": {
                            System.out.println(calculator.multiply(a, b));
                            break;
                        }
                        case "4": {
                            System.out.println(calculator.divide(a, b));
                            break;
                        }
                        case "5": {
                            programIsRunning = false;
                            break;
                        }
                        default: {
                            System.out.println("Błędny wybór");
                            break;
                        }
                    }
                }
        System.out.println();
        System.out.println("zad 5");
        System.out.println();

        Okrag Okrag = new Okrag(4,3);
        System.out.println("Pole = "+Okrag.Pole()+"\nObwód = "+Okrag.Obwod());
        System.out.println("Promień okręgu = " + Okrag.getPromien());

    }
        }