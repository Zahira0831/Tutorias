package tutorias.banco.data;

public class CuentaDeBanco {

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + "\n balance" + balance + "\n Numero de cuenta" +numeroDeCuenta ;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String nombre;
    private int numeroDeCuenta;
    private double balance;


}
