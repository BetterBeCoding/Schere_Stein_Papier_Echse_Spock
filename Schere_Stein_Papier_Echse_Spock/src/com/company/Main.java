package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        GegnerKi.erzeugeZufall();

        Bclass buttonFenster = new Bclass();
        buttonFenster.getDefaultCloseOperation();
        buttonFenster.setSize(400,400);
        buttonFenster.setVisible(true);


        SpielLogik a = new SpielLogik();


        SpielLogik.checkWinner();
        SpielLogik.ausgabeWinner();

    }
}
