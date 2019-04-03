package sample;

import javafx.event.ActionEvent;

import java.awt.*;
import java.io.Console;
import java.util.ArrayList;

public class Controller {
    public javafx.scene.control.TextArea inputArea;
    public javafx.scene.control.TextArea outputArea;

    public void dodajArtikle(ActionEvent actionEvent) {
        ArrayList<Artikal> lista = new ArrayList<>();
        String items = null;
        items = inputArea.getText();

        for (String line: items.split("\n")) {
            int i = 0;
            Artikal proizvod = new Artikal();
            for (String word: items.split(",")) {
                switch (i) {
                    case 0: {
                        proizvod.setSifra(word);
                        i++;
                        break;
                    }
                    case 1: {
                        proizvod.setNaziv(word);
                        i++;
                        break;
                    }
                    case 2: {
                        proizvod.setCijena(Double.parseDouble(word));
                        lista.add(proizvod);
                        i++;
                        break;
                    }
                }
            }
        }
        for (Artikal a: lista) {
            a.izbaciDuplikate(lista);
        }

        //System.out.print(items);



    }
}
