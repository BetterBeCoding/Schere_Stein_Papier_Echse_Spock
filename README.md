# Schere_Stein_Papier_Echse_Spock
Schere Stein Papier Variante mit GUI und Computergegner

//Lösung für mein Problem mit der Ausgabe von 0 bei der Zufallszahl(Bereich 1-5)
        Random zufall = new Random();



        int zufallsZahl = 1 + zufall.nextInt(5);
        System.out.println(zufallsZahl);
        
        
        
        Regeln des Spiels (mit 5D-Array lösen?)
        
                      Schere Stein Papier  Echse Spock
       Schere                        X       X            ffttf
       Stein              X                  X            tfftf
       Papier                   X                  X      ftftf
       Echse                         X             X      fftft
       Spock              X          X                    tftff
       
       X= Spieler gewinnt
       
       package com.company;

public class SpielLogik {
    public static int s = 1;
    public static int g = 3;
    public static int w =0;


    public static int checkWinner() {

            if ((s == 1) && (g == 3 )|| (g == 4))

              return w =1;

            if ((s == 2) && (g == 1) || (g == 4))
              return   w =1;

            if ((s == 3) && (g == 2) || (g == 4))
               return w =1;

            if ((s == 4) && (g == 3) || (g == 5))
               return w =1;

            if ((s == 5) && (g == 1 )|| (g == 3))
               return w =1;

            if (s == g)
            return w=0;

            else
              return   w = 4;



        }


        public static void ausgabeWinner() {
            if (w == 1 )
                System.out.println("Du hast gewonnen!");

            if (w == 2)
                System.out.println("Du hast verloren!");

            if (w == 0)
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
