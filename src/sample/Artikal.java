package sample;

public class Artikal {
        private String sifra, naziv;
        private double cijena;

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

}
