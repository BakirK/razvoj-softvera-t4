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
            Artikal proizvod = new Artikal(line);
            lista.add(proizvod);
            //System.out.print(line);

            /*
            for (String word: items.split(",")) {
                switch (i) {
                    case 0: {
                        System.out.print(word);
                        proizvod.setSifra(word);
                        i++;
                        break;
                    }
                    case 1: {
                        System.out.print(word);
                        proizvod.setNaziv(word);
                        i++;
                        break;
                    }
                    case 2: {
                        System.out.print(word);
                        word.trim();
                        proizvod.setCijena(Double.parseDouble(word));
                        lista.add(proizvod);
                        i = 0;
                        break;
                    }
                }
            }*/
        }
/*
        for (Artikal a: lista) {
            a.izbaciDuplikate(lista);
        }*/
        for (Artikal a: lista) {
            String s = a.getSifra() + "," + a.getNaziv() + "," + a.getCijena() + "\n";
            outputArea.setText(s);
        }

        //System.out.print(items);



    }
}
