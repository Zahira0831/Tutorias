package tutorias.altas.ui;

import jdk.swing.interop.SwingInterOpUtils;
import tutorias.altas.data.Alumno;
import tutorias.altas.data.Materia;
import tutorias.altas.process.GestorDeArchivos;
import tutorias.altas.process.GestorDeMaterias;

import java.util.ArrayList;
import java.util.Scanner;

public interface CLI {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int menu, menu1;
        String alumnoInscrito;

        Materia materiaMatematicas = new Materia();
        Materia materiaEspañol = new Materia();

        GestorDeMaterias gestorMaterias = new GestorDeMaterias();
        GestorDeArchivos gestorArchivos = new GestorDeArchivos();

        Alumno alumno1;

        gestorMaterias.listaDeMaterias.add(materiaEspañol);
        gestorMaterias.listaDeMaterias.add(materiaMatematicas);


        materiaEspañol.setNombre("Español");
        materiaMatematicas.setNombre("Matematicas");


        gestorArchivos.leerlista(gestorMaterias.listaDeMaterias);
        System.out.println("\n ESTOS SON LOS REGISTROS ACTUALES \n");
        gestorMaterias.imprimirListaOrdenada();
        System.out.println("ALUMNOS FALTANTES EN: \n");

        System.out.println("ESPAÑON : " +gestorMaterias.darAlumnosFaltantes(materiaEspañol));
        System.out.println("MATEMATICAS : " + gestorMaterias.darAlumnosFaltantes(materiaMatematicas));

    do {

        System.out.println("¿QUE QUIERES HACER?");
        System.out.println("1- Agregar Alumno , 2- Imprimir Lista  o  3- Guardar y Salir");
        menu = scn.nextInt();
scn.nextLine();
        switch (menu){

            case 1:

                System.out.println("Ingresa al alumno que se inscribira\n");
                alumnoInscrito = scn.nextLine();
                alumno1 = new Alumno();
//Para generar un nuevo alumno cada vez
                alumno1.setNombre(alumnoInscrito);

                System.out.println("¿A Que Materia quieres ingresar?\n");
                System.out.println("Presiona 1- Español o 2- Matematicas, 3- Salir\n");
                menu = scn.nextInt();
//Para que brinque la linea y no quede trabado.
scn.nextLine();
                //Se realiza un if para ir asignando las variables a los metodos, dependiendo la opcion elegida.

        Materia materiaElegida;

                if(menu==1){

                    materiaElegida = materiaEspañol;

                } else if(menu == 2) {

                    materiaElegida = materiaMatematicas;

                } else  {

                    continue;
            }


                    gestorMaterias.agregarAlumno(alumno1, materiaElegida);



                break;


            case 2:

                gestorMaterias.imprimirListaOrdenada();


                break;

            case 3:

                gestorArchivos.guardarLista(gestorMaterias.listaDeMaterias);

                break;

        }


    }while(menu != 3);

    }

}
