package tutorias.zahira.cadenas.ui;

import tutorias.zahira.cadenas.process.TrabajadorDeCadenas;

import java.util.Scanner;

public interface CLI {

    public static void main(String[] args) {

        TrabajadorDeCadenas trabajadorDeCadenas = new TrabajadorDeCadenas();
        String cadena;

        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa la cadena");
        cadena = scn.nextLine();


        trabajadorDeCadenas.validarLongitud(cadena);
        System.out.println("Cadena Original" + cadena);

        cadena = trabajadorDeCadenas.invertirCaracteres(cadena);
        System.out.println("Cadena Invertida" + cadena);



    }




}
