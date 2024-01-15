package tutorias.banco.test;

import org.junit.Assert;
import tutorias.banco.data.CuentaDeBanco;
import org.junit.Test;
import tutorias.banco.process.ManejadorCuentaDeBanco;

public class ManejadorCuentaBancoTest {

    public void printAccount (CuentaDeBanco cuentaBanco){

        System.out.println(cuentaBanco);
    }


    @Test
    public void depositAccountExceptionTest (){
        CuentaDeBanco saldoCuenta = null;
        double deposito=200;

        ManejadorCuentaDeBanco manejador = new ManejadorCuentaDeBanco();
        Assert.assertThrows(IllegalArgumentException.class,()->{manejador.depositAccount(saldoCuenta,deposito);});

        }



    @Test
    public void retiroCuentaBalanceSuficienteTest () {

        CuentaDeBanco saldoDeCuenta = new CuentaDeBanco();
        saldoDeCuenta.setBalance(500);
        double retiro=200;

        ManejadorCuentaDeBanco manejador = new ManejadorCuentaDeBanco();
        Assert.assertEquals(true,manejador.retiroCuenta(saldoDeCuenta,retiro));
    }

    @Test
    public void retiroCuentaBalanseInsuficienteTest () {

        CuentaDeBanco saldoDeCuenta = new CuentaDeBanco();
        saldoDeCuenta.setBalance(100);
        double retiro=200;

        ManejadorCuentaDeBanco manejador = new ManejadorCuentaDeBanco();
        Assert.assertEquals(false,manejador.retiroCuenta(saldoDeCuenta,retiro));
    }

    @Test
    public void retiroCuentaExcepcionTest () {

        CuentaDeBanco saldoDeCuenta = null;
        double retiro=200;

        ManejadorCuentaDeBanco manejador = new ManejadorCuentaDeBanco();
    //Manejo De Excepciones
        Assert.assertThrows(IllegalArgumentException.class,()->{manejador.retiroCuenta(saldoDeCuenta,retiro);});
    }


}
