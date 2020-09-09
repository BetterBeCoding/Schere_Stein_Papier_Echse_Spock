package com.company;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Bclass extends JFrame {
    private JButton buttonSchere,buttonStein,buttonPapier,buttonEchse,buttonSpock,buttonLos;
    public static  int auswahl;

        public Bclass (){
        super("Schere_Stein_Papier_Echse_Spock");
        setLayout(new FlowLayout());

        buttonSchere = new JButton("Schere");
        buttonStein = new JButton("Stein");
        buttonPapier = new JButton("Papier");
        buttonEchse = new JButton("Echse");
        buttonSpock = new JButton("Spock");
        buttonLos = new JButton("Los!");

        add(buttonSchere);
        add(buttonStein);
        add(buttonPapier);
        add(buttonEchse);
        add(buttonSpock);
        add(buttonLos);

        DerHandler handler = new DerHandler();
        buttonSchere.addActionListener(handler);
        buttonStein.addActionListener(handler);
        buttonPapier.addActionListener(handler);
        buttonEchse.addActionListener(handler);
        buttonSpock.addActionListener(handler);
        buttonLos.addActionListener(handler);
    }

    private class DerHandler implements ActionListener{
        @Override

    public void actionPerformed(ActionEvent event)

        {

            if (event.getSource() == buttonSchere)
                JOptionPane.showMessageDialog(null, "Du hast die Schere gewählt");
                auswahl = 1;

            if (event.getSource() == buttonStein)
                JOptionPane.showMessageDialog(null, "Du hast den Stein gewählt");
                auswahl = 2 ;
            if (event.getSource() == buttonPapier)
                JOptionPane.showMessageDialog(null,"Du hast das Papier gewählt");
                auswahl = 3;
            if (event.getSource() == buttonEchse)
                JOptionPane.showMessageDialog(null,"Du hast die Echse gewählt");
                auswahl = 4;
            if (event.getSource() == buttonSpock)
                JOptionPane.showMessageDialog(null,"Du hast Mr. Spock gewählt");
                auswahl = 5;
            if(event.getSource() == buttonLos)
                if (auswahl >0 || auswahl <=5)
                   // JOptionPane.showMessageDialog(null,"Los geht's!");
                    SpielLogik.checkWinner();
                    SpielLogik.ausgabeWinner();
            if( auswahl == 0){
                    JOptionPane.showMessageDialog(null, "Triff deine Auswahl und probier es nochmal!");
                }
            }



}

}
