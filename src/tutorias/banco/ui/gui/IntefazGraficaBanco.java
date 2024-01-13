package tutorias.banco.ui.gui;

import tutorias.banco.data.CuentaDeBanco;
import tutorias.banco.process.ManejadorCuentaDeBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntefazGraficaBanco {
    private JTextField textField1;
    private JButton DEPOSITARButton;
    private JButton SALIRButton;
    private JButton RETIRARButton;
    private JPanel Contenedor;
    private String NombreCliente;
    private CuentaDeBanco cuenta;

    ManejadorCuentaDeBanco manejador = new ManejadorCuentaDeBanco();

    public JPanel getContenedor() {
        return Contenedor;
    }


    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    //Abrira la ventana que llevara a la clase VentanaDeposito
    private void openDepositar (String NombreCliente){
        cuenta = manejador.getAccount(NombreCliente);

        VentanaDeposito ventana = new VentanaDeposito(cuenta);
        JFrame frame = new JFrame("Deposito");
        frame.setContentPane(ventana.getDeposito());
        //Si no se agrega esta linea siempre seguira corriendo.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

/*
    private void openRetirar (String NombreCliente){
        cuenta = manejador.getAccount(NombreCliente);

        VentanaRetiro ventana = new VentanaRetiro(cuenta);
        JFrame frame = new JFrame("Deposito");
        frame.setContentPane(ventana.getRetirar());
        //Si no se agrega esta linea siempre seguira corriendo.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    */



    public IntefazGraficaBanco() {
        DEPOSITARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //Metodo que extraera el texto que este en el cuadro de texto
               openDepositar(textField1.getText());
            }
        });
        RETIRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //Es para que le aparezca una ventana bonita con el texto descrito.
                JOptionPane.showMessageDialog(null, "prueba");
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "prueba");
            }
        });
    }




}
