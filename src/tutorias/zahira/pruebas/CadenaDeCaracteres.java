package tutorias.zahira.pruebas;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class CadenaDeCaracteres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadenaDeUsuario;
        System.out.println("Favor de ingresar la cadena");
        cadenaDeUsuario = sc.nextLine();


        System.out.println("Tu cadena modificada es"+ cambiarCadena(cadenaDeUsuario));

        Stream.of(cadenaDeUsuario)
                .map(cadenaOriginal -> {
                    char [] cadenaEnConstruccion = new char[cadenaOriginal.length()];

                    for(int i=0; i<cadenaEnConstruccion.length; i++){

                        if(i == cadenaEnConstruccion.length -1) {

                            cadenaEnConstruccion [0] = cadenaOriginal.charAt(i);
                        } else {

                            cadenaEnConstruccion [i+1] = cadenaOriginal.charAt(i);
                        }
                    }
                    return new String(cadenaEnConstruccion);
                } ).forEach(System.out::println);

    }

    public static String cambiarCadena (String cadenaOriginal){

        char [] cadenaEnConstruccion = new char[cadenaOriginal.length()];

        for(int i=0; i<cadenaEnConstruccion.length; i++){

            if(i == cadenaEnConstruccion.length -1) {

                cadenaEnConstruccion [0] = cadenaOriginal.charAt(i);
            } else {

                cadenaEnConstruccion [i+1] = cadenaOriginal.charAt(i);
            }
            }

        //Es para que salga en corchete y comas
      //  return Arrays.toString(cadenaEnConstruccion);

// Aparece tal cual en un String
        return new String(cadenaEnConstruccion);
    }



}
