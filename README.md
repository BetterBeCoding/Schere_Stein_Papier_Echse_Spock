# Schere_Stein_Papier_Echse_Spock
Schere Stein Papier Variante mit GUI und Computergegner

//Lösung für mein Problem mit der Ausgabe von 0 bei der Zufallszahl(Bereich 1-5)
        Random zufall = new Random();



        int zufallsZahl = 1 + zufall.nextInt(5);
        System.out.println(zufallsZahl);
        
        
        
        Regeln des Spiels :
        
                      Schere Stein Papier  Echse Spock
       Schere                        X       X            ffttf
       Stein              X                  X            tfftf
       Papier                   X                  X      ftftf
       Echse                         X             X      fftft
       Spock              X          X                    tftff
       
       X= Spieler gewinnt
       
      package com.company;

public class SpielLogik {
    public static int s = 3;
    public static int g = 3;
    public static int w =0;


    public static void checkWinner() {
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
                System.out.println("Unentschieden!Nochmal!");


            // write your code here
            //scanny.close();
        }
    }


/**
 Spieler gewinnt :
 1/3 ,1/4,
 2/1,2/4,
 3/2,3/4,
 4/3,4/5,
 5/1,5/3,
 **/
 
 
 package com.company;

public class Main {

    public static void main  (String[] args) {
        SpielLogik a = new SpielLogik();

        SpielLogik.checkWinner();
        SpielLogik.ausgabeWinner();
    }
}

