public class Pies extends Zwierze implements ZwierzeDomowe{

    @Override
    public int wiek() {
        return 8;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Woof woof");

    }

    @Override
    public void turlajsie() {
        System.out.println("Turla się");
    }

    @Override
    public void zabawa() {
        System.out.println("Bawi się");

    }
}