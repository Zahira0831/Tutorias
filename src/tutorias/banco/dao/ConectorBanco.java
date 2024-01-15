package tutorias.banco.dao;

import tutorias.banco.data.CuentaDeBanco;

import java.io.IOException;
import java.sql.*;

public class ConectorBanco {

    public static CuentaDeBanco getClientByName (String nombreCliente){
        String DB_URL="jdbc:mysql://localhost:3306/Banco", USER= "root" , PASS= "LuffyNami31", QUERY= "select * from banco.cliente where nombre = '" +nombreCliente+"'";
        System.out.println(QUERY);
           CuentaDeBanco cuentaDeBanco = new CuentaDeBanco();
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
                cuentaDeBanco.setNombre(rs.getString("nombre"));
              //  cuentaDeBanco.setNumeroDeCuenta(rs.getString("numero_de_cuenta"));
                cuentaDeBanco.setBalance(rs.getDouble("balance"));
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return cuentaDeBanco;
    }

    public static void main(String[] args) {

        CuentaDeBanco cuentaDeBanco = getClientByName("Armando Gonzalez");

        System.out.println(cuentaDeBanco);
        /*
        String DB_URL="jdbc:mysql://localhost:3306/Banco", USER= "root" , PASS= "LuffyNami31", QUERY= "Select*From Cliente;";


        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
*/


    }

}
