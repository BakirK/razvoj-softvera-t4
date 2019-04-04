package sample;

import java.util.ArrayList;
import java.util.List;

public class Racun {
    private Artikal artikal;
    private int kolicina;

    private Artikal getArtikal() {
        return artikal;
    }

    private void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }

    private int getKolicina() {
        return kolicina;
    }

    private void setKolicina(int kolicina) {
        if (kolicina <= 0) {
            throw new IllegalArgumentException("Kolicina je premala");
        }
        this.kolicina = kolicina;
    }

    private List getStavke() {
        return stavke;
    }

    private List stavke = new ArrayList ();


    //konstruktor
    public Racun (Artikal artikal, int kolicina) {
        if (kolicina <= 0) {
            throw new IllegalArgumentException("Kolicina je premala");
        }
        this.artikal = artikal;
        this.kolicina = kolicina;
    }

    public void dodajStavku (Artikal item, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Kolicina je premala");
        }
        Racun temp = new Racun(item, quantity);
        this.stavke.add(temp);
    }

    public double ukupanIznos () {
        double sum = 0;

        for (Object racun: stavke) {
            Racun stavka = (Racun) racun;
            sum += stavka.artikal.getCijena() * stavka.getKolicina();
        }
        return (sum / stavke.size());
    }

}
