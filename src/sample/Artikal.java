package sample;

import java.util.ArrayList;
import java.util.HashSet;

public class Artikal {
        private String sifra, naziv;
        private double cijena;

    public Artikal() {

    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


    public Artikal(String sifraIn, String nazivIn, double cijenaIN) {
        this.sifra = sifraIn;
        this.naziv = nazivIn;
        this.cijena = cijenaIN;
    }
    public Artikal (String inParameters) {
        int i = 0;
        for (String parameter: inParameters.split(",")) {
            if (i == 0) {
                this.sifra = parameter;
                i++;
            }
            else if (i == 1) {
                this.naziv = parameter;
                i++;
            }
            else {
                i = 0;
                this.cijena = Integer.parseInt(parameter);
            }
        }
    }
    public String toString() {
        String parametri = null;
        parametri += this.sifra;
        parametri += ",";
        parametri += this.naziv;
        parametri += ",";
        parametri += cijena;
        return parametri;
    }

    public boolean equals(Object o) {
        Artikal artikal = (Artikal) o;
        if (this.cijena == artikal.cijena && this.naziv == artikal.naziv && this
        .sifra == artikal.sifra) {
            return true;
        }
        return false;
    }

    public static void izbaciDuplikate (ArrayList lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).equals(lista.get(j))) {
                    lista.remove(j);
                }
            }
        }
    }

    public static void izbaciDuplikateHashSet (ArrayList lista) {
        HashSet set = new HashSet<String>();
        for (int i = 0; i < lista.size(); i++) {
            set.add(lista.get(i));
        }
        lista.clear();
        for (Object s: set) {
            lista.add(s);
        }
    }





}
