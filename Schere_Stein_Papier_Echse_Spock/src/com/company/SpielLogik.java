package com.company;
import javax.swing.*;

public class SpielLogik {
    public static int s=Bclass.auswahl ;
    public static int g ;
    public static int w =0;



    public static void checkWinner() {
        GegnerKi gK = new GegnerKi();
        GegnerKi.erzeugeZufall();



        if ((s == 1) && (g == 3 )|| ((s==1) &&(g == 4)))

        {w =1;}

        else if ((s == 2) && (g == 1) || ((s==2) && (g == 4)))
        { w =1;}

        else if ((s == 3) && (g == 2) || ((s==3) && (g == 4)))
        { w =1;}

        else if ((s == 4) && (g == 3) || ((s==4) && (g == 5)))
        { w =1;}

        else if ((s == 5) && (g == 1 )|| ((s==5) && (g == 3)))
        { w =1;}
        else if  (s == g)
        {w=4;}
        else
        {w=2;}


    }


    public static void ausgabeWinner() {
        if (w == 1 )
            System.out.println("Du hast gewonnen!");

        if (w == 2)
            System.out.println("Du hast verloren!");

        if (w == 4)
            JOptionPane.showMessageDialog(null,"Los geht's!");
            System.out.println("Unentschieden!Nochmal!");


        // write your code here
        //scanny.close();
    }
}
