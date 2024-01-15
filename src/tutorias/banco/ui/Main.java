package tutorias.banco.ui;

import tutorias.banco.ui.gui.IntefazGraficaBanco;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //ES PARA QUE A LA VENTANA CREADA EN LA INTERFAZ GRAFICA SE LE APAREZCAN LAS PESTAÑAS DE
        //   CERRAR, MINIMIZAR Y EXPANDIR.


        JFrame frame = new JFrame("Banco");
        frame.setContentPane(new IntefazGraficaBanco().getContenedor());
        //Si no se agrega esta linea siempre seguira corriendo.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
