package sample;

import javafx.event.ActionEvent;

import java.awt.*;
import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;

public class Controller {
    public javafx.scene.control.TextArea inputArea;
    public javafx.scene.control.TextArea outputArea;

    public void dodajArtikle(ActionEvent actionEvent) {
        ArrayList<Artikal> lista = new ArrayList<Artikal>();
        String items = null;
        items = inputArea.getText();

        //uzimanje linije po linije
        for (String line: items.split("\n")) {

            //pravljenje objekta od linije preko konstruktora koji prima string
            Artikal proizvod = new Artikal(line);

            //dodavanje spomenutog objekta u listu
            lista.add(proizvod);
            //System.out.print(line);
        }

        Artikal.izbaciDuplikate(lista);
        String outputString = "";
        for (Artikal a: lista) {
            outputString += a.getSifra() + "," + a.getNaziv() + "," + a.getCijena() + "\n";
        }
        outputArea.setText(outputString);
    }
}
