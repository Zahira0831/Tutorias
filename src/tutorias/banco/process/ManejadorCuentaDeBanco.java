package tutorias.banco.process;

import tutorias.banco.data.CuentaDeBanco;

import java.util.Objects;
import java.util.Random;

public class ManejadorCuentaDeBanco {


    public CuentaDeBanco getAccount (String nombre) {

        CuentaDeBanco cuentaDeBanco = new CuentaDeBanco();

        Random random = new Random();

        cuentaDeBanco.setNumeroDeCuenta(random.nextInt());

        cuentaDeBanco.setNombre(nombre);

        cuentaDeBanco.setBalance(0.0);

        return cuentaDeBanco;
    }

    public void printAccount (CuentaDeBanco cuentaBanco){

        System.out.println(cuentaBanco);
    }

    public boolean depositAccount (CuentaDeBanco saldoCuenta, double deposito){

        if(Objects.isNull(saldoCuenta)){
            throw new IllegalArgumentException("NO DEJAR LA CUENTA EN NULO");
        }


        try { //Int
            // enta que saldo..... funcione
            saldoCuenta.setBalance(saldoCuenta.getBalance() + deposito);
        } catch (Exception e){  //si falla lo que sea de la linea 33 , devuelve falso.
            return false;
        }
        return true;
    }
    // throws:  se usa cuando el metodo no se va a hacer cargo.
    //cuando quiere o necesite delegar el manejo de la excepcion generada a el metodo invocador
    // try{
  //  saldoDeCuenta.retiroCuenta(...)
    // }catch (IllegalArgumentException e) {
    // }
    public boolean retiroCuenta (CuentaDeBanco saldoDeCuenta, double retiro) throws IllegalArgumentException {

      //  Objects.requireNonNull(saldoDeCuenta, "NO DEJAR SALDO DE CUENTA NULO");
        if(Objects.isNull(saldoDeCuenta)){

         //thorw es como un return pero para excepciones
            throw new IllegalArgumentException("NO DEJAR LA CUENTA EN NULO");
        }



        if (retiro > saldoDeCuenta.getBalance()) {
            return false;
        }

        saldoDeCuenta.setBalance(saldoDeCuenta.getBalance() - retiro);
        printAccount(saldoDeCuenta);

        return true;
    }


}
