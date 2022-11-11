package tutorias.zahira.convertidor.process;

import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {

        int menu=1, numero;
        Scanner scn = new Scanner(System.in);

        System.out.println("1. Decimal a Binario"
                            + "2. Decimal a Octal"
                            + "3. Binario a Decimal"
                            + "4. Octal a Decimal"
                            + "5. Hexadecimal a Decimal");
        menu = scn.nextInt();

        switch (menu) {

            case 1:
                System.out.println("Que numero utilizaras");
                numero = scn.nextInt();


                break;

            case 2:

                break;

            case 3:


                break;

            case 4:

                break;
        }



    }

}
