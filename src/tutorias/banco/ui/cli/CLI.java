package tutorias.banco.ui.cli;

import tutorias.banco.data.CuentaDeBanco;
import tutorias.banco.process.ManejadorCuentaDeBanco;

import java.util.Scanner;

public interface CLI {

    Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println("BIENVENIDO AL SISTEMA DE BANCO");
        System.out.println("Favor de ingresar su nombre");
        String nombre = scanner.nextLine();

        CuentaDeBanco cuenta;
        ManejadorCuentaDeBanco manejador = new ManejadorCuentaDeBanco();

        cuenta = manejador.getAccount(nombre);

        int seleccion = 0;

        while(seleccion != 3) {

            System.out.println("QUE QUIERES HACER:");
            System.out.println("1- Deposito, 2- Retiro, 3-Salida");
            seleccion = scanner.nextInt();
            scanner.nextLine();

            switch (seleccion){

                case 1:

                    double deposito;
                    System.out.println("¿Cuanto es lo que quiere depositar?");
                    deposito = scanner.nextDouble();

                    boolean exito = manejador.depositAccount(cuenta, deposito);

                    if (exito) { //El == true es innecesario, ya que funciona igual.
                    System.out.println("TU SALDO NUEVO ES: " );
                    manejador.printAccount(cuenta);
                    } else {
                        System.out.println("No se pudo realizar el deposito");
                        System.out.println("Saldo Disponible: ");
                        manejador.printAccount(cuenta);
                    }

                    break;

                case 2:

                    double retiro;
                    System.out.println("¿Cuanto desea retirar?");
                    retiro = scanner.nextDouble();

                    boolean exitoo = manejador.retiroCuenta(cuenta, retiro);

                    if(exitoo) {
                        System.out.println("Tu dinero restante es: ");
                        manejador.printAccount(cuenta);
                    } else {
                        System.out.println("No se pudo realizar el retiro");
                    }


                    break;

            }



        }


    }


}
