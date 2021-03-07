public class Pies extends Zwierze{
    private String siersc;
    private int dlugoscogona;

    public Pies(int wiek, int ilosckonczyn, String nazwa, String siersc, int dlugoscogona) {
        super(wiek, ilosckonczyn, nazwa);
        this.siersc = siersc;
        this.dlugoscogona = dlugoscogona;
    }
    @Override
    public void dajGlos(){
        System.out.println("Hau hau");
    }

    public String getSiersc() {
        return siersc;
    }

    public void setSiersc(String siersc) {
        this.siersc = siersc;
    }

    public int getDlugoscogona() {
        return dlugoscogona;
    }

    public void setDlugoscogona(int dlugoscogona) {
        this.dlugoscogona = dlugoscogona;
    }
}