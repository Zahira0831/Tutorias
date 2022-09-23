package tutorias.zahira.calculadoraLamda.ui;


import tutorias.zahira.calculadoraLamda.process.Calculadora;
import tutorias.zahira.calculadoraLamda.process.OperacionAritmetica;

import java.util.Scanner;

public interface CLI {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();


        int menu, primero, segundo;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingresa el 1er digito");
        primero = entrada.nextInt();

        System.out.println("Ingresa el 2do digito");
        segundo = entrada.nextInt();

        System.out.println("Que Operacion Quieres Hacer: " +
                            "1.Suma /n  2.Resta /n 3. Multiplicacion /n 4.Division" );
        menu = entrada.nextInt();

        switch (menu) {

            case 1:

                System.out.println(calculadora.suma.apply(primero, segundo));
                System.out.println(calculadora.calcular((p, s) -> p + s, primero, segundo ));

            break;

            case 2:

                System.out.println(calculadora.resta.apply(primero, segundo));

                break;

            case 3:

                System.out.println(calculadora.multiplicacion.apply(primero, segundo));

                break;

            case 4:

                System.out.println(calculadora.division.apply(primero, segundo));

                break;
        }
    }


}
