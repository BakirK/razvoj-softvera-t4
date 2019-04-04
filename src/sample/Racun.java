package sample;

public class Racun {
    private Artikal getItem() {
        return item;
    }

    private void setItem(Artikal item) {
        this.item = item;
    }

    private int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private Artikal item;
    private int quantity;

    //konstruktor
    public Racun (Artikal item, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Kolicina je prazna");
        }
        this.item = item;
        this.quantity = quantity;
    }

}
