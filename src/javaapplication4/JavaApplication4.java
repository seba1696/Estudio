/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Casa
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoBotones mimarco = new MarcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoBotones extends JFrame {

    public MarcoBotones() {
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
    }
}

class LaminaBotones extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        ColorFondo Azul = new ColorFondo(Color.blue);
        ColorFondo Rojo = new ColorFondo(Color.red);
        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    class ColorFondo implements ActionListener {

        public ColorFondo(Color c) {
            colorDelFondo = c;
        }

        public void actionPerformed(ActionEvent e) {
            setBackground(colorDelFondo);
        }
        private Color colorDelFondo;

    }

   

}
