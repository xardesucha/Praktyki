public class Main {
    public static void main(String[] args) {

        System.out.println("Zad 1");
        Pies pies = new Pies();
        pies.wiek();
        pies.wydajDzwiek();
        pies.sen();
        pies.Ciągnięcie();
        System.out.println();

        System.out.println("Zad 2");
        Samochod samochod = new Samochod();
        System.out.println(samochod.awaria());
        samochod.jedz();
        samochod.SkretWLewo();
        samochod.SkretWPrawo();
        samochod.stop();

        System.out.println();
        System.out.println("Zad 3");
        PodajRocznikWina podajrocznikwina = new PodajRocznikWina();
        podajrocznikwina.pachnie();
        podajrocznikwina.nalewanie();
        podajrocznikwina.rocznik();
        podajrocznikwina.odkorkowanie();
        podajrocznikwina.pic();

        System.out.println();
        System.out.println("Zad 4");
        pies.turlajsie();
        pies.zabawa();

        System.out.println();
        System.out.println("Zad 5");
        Kwadrat kwadrat = new Kwadrat(9);
        System.out.println("Obwód = " + kwadrat.obliczObwod()+"\n" +"Pole = " + kwadrat.obliczPole());
    }
}