public class Samochod implements Pojazd{
    @Override
    public void jedz()
    {
        System.out.println("Jedzie do przodu");
    }
    @Override
    public void stop()
    {
        System.out.println("Samochod zatrzymuje sie");
    }
    @Override
    public boolean awaria()
    {
        return false;
    }

    @Override
    public void SkretWLewo() {
        System.out.println("Skreca w lewo");

    }

    @Override
    public void SkretWPrawo() {
        System.out.println("Skreca w prawo");

    }
}
