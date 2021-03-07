public class PodajRocznikWina extends Wino {
    void rocznik(){
        System.out.println("Rocznik = 1973");
    }

    @Override
    void pachnie() {
        System.out.println("Czuć zapach wina");
    }

    @Override
    void nalewanie() {
        System.out.println("Leje się wino");

    }
}