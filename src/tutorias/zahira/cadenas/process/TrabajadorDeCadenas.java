package tutorias.zahira.cadenas.process;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrabajadorDeCadenas {

    public boolean validarLongitud (String cadena){

        if (cadena.length() < 7) {
            //Lanzo una excepcion.
            throw new RuntimeException("La longitud de la cadena es muy corta, minimo 6");
        }
        // No tiene else porque no necesita ya que si no es menor que 7, sale del if y regresa los mayores o igual a  7
            return true;
    }

    public String invertirCaracteres (String cadena) {

        String cadenaInvertida = "";

        for (byte caracter : cadena.getBytes(StandardCharsets.UTF_8)) {

            cadenaInvertida += TrabajadorDeCadenas.invertirMayusMinus((char)caracter);
        }

       return cadenaInvertida;
        }

    private static char invertirMayusMinus(char caracter) {

        // Se utilizo el metodo ASKII
         if (caracter >= 65 && caracter <= 90){

             return (char) ((int) caracter + 32);

         } else if (caracter >= 97 && caracter <= 122 ) {

             return (char) ((int) caracter - 32);
         }
        return caracter;
    }
}





