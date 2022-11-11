package tutorias.altas.ui;

import jdk.swing.interop.SwingInterOpUtils;
import tutorias.altas.data.Alumno;
import tutorias.altas.data.Materia;
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

        Alumno alumno1 = new Alumno();

        gestorMaterias.listaDeMaterias.add(materiaEspañol);
        gestorMaterias.listaDeMaterias.add(materiaMatematicas);


        materiaEspañol.setNombre("Español");
        materiaMatematicas.setNombre("Matematicas");


    do {

        System.out.println("¿QUE QUIERES HACER?");
        System.out.println("1- Agregar Alumno o 2- Imprimir Lista");
        menu = scn.nextInt();

        switch (menu){

            case 1:

                System.out.println("Ingresa al alumno que se inscribira");
                alumnoInscrito = scn.nextLine();

                alumno1.setNombre(alumnoInscrito);

                System.out.println("¿A Que Materia quieres ingresar?\n");
                System.out.println("Presiona 1- Matematicas o 2- Español, 3- Salir\n");
                menu = scn.nextInt();

                //Se realiza un if para ir asignando las variables a los metodos, dependiendo la opcion elegida.

        Materia materiaElegida;

                if(menu==1){

                    materiaElegida = materiaEspañol;

                } else if(menu == 2) {

                    materiaElegida = materiaMatematicas;

                } else  {

                    continue;
            }

                    if(gestorMaterias.validarCupo(materiaElegida) == false){

                        System.out.println("NO HAY ESPACIO, CAMBIA DE MATERIA");

                        //Se brincan el resto de las lineas faltantes de todo el ciclo y regresa a la linea 32.
                        continue;
                    }


                    if(gestorMaterias.revisarAlumnoEnMateria(alumno1, materiaElegida) == false){

                        System.out.println("EL ALUMNO YA SE ENCUENTRA DENTRO DE LA LISTA");

                        continue;
                    }

                    gestorMaterias.agregarAlumno(alumno1, materiaElegida);



                break;


            case 2:

                gestorMaterias.imprimirListaOrdenada();


                break;

        }


    }while(menu == 3);



    }




}
