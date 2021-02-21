package com.mycompany.tarea1;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Universidad TdeA = new Universidad("TdeA", "JKAHDS 213", "Pública", 5890001, 1564.54);
        String info = "";
        info += TdeA.obtenerInformacion();
        JOptionPane.showMessageDialog(null, info);
    }
}

/* Desarrollado por:
    Juan Diego López Botero
    Hamilton Andrés Echeverri Guzmán
*/