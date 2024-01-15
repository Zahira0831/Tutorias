package tutorias.banco.ui.gui;

import tutorias.banco.data.CuentaDeBanco;
import tutorias.banco.process.ManejadorCuentaDeBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDeposito {

    CuentaDeBanco cuenta;
    ManejadorCuentaDeBanco manejador = new ManejadorCuentaDeBanco();

    private String NombreCliente;

    private JTextField textField1;
    private JButton ACEPTARButton;
    private JButton CANCELARButton;

    private JPanel Deposito;
    private JLabel Ventana;



    public String getNombreCliente() {
        return this.NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public JPanel getDeposito() {
        return Deposito;
    }

//Muestra el nombre del cliente que se le asigno en la ventana de la case InterfarGraficaBanco

    public VentanaDeposito(CuentaDeBanco cliente) {
        this();
        cuenta = cliente;
        Ventana.setText("Ventana Deposito de: "+cliente.getNombre());
    }

//Se genera un objeto de tipo ActionListener
//Un objeto que es de una subclase de tipo ActionListener.

    public VentanaDeposito() {

        ACEPTARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double deposito = Double.valueOf(textField1.getText());
                boolean exito = manejador.depositAccount(cuenta, deposito);
                if (exito){
                    JOptionPane.showMessageDialog(null, "DEPOSITO EXITOSO, NUEVO BALANCE: " + cuenta.getBalance());
                }
            }
        });
        CANCELARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
