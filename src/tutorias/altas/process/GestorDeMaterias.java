package tutorias.altas.process;

import tutorias.altas.data.Alumno;
import tutorias.altas.data.Materia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

import static tutorias.altas.data.Materia.CUPO;

public class GestorDeMaterias {

    public ArrayList<Materia> listaDeMaterias = new ArrayList<>();


    public boolean validarCupo (Materia materia){
        //todo ese return directamente genera un TRUE al cumplirse o un FALSE si no se cumple.
        //Solo cuando es boolean se puede hacer.
        return materia.getAlumnosInscritos().size() <= CUPO;
    }

    public int darAlumnosFaltantes (Materia materia){

        return CUPO - materia.getAlumnosInscritos().size();

    }

    public Boolean revisarAlumnoEnMateria (Alumno alumno, Materia materia){

//Si se usa el metodo contains, se necesita agregar un metodo equals en la clase de la variable seleccionada.
        return materia.getAlumnosInscritos().contains(alumno);
    }


    public void  agregarAlumno (Alumno alumno, Materia materia) {

        //! es para negar la validacion.
        if(!validarCupo(materia)){
            System.out.println("LISTA LLENA");

    //Cuando se trata de un metodo void, el return solo sirve para salir del metodo si ese if no se cumple.
            return;
        }

        if(revisarAlumnoEnMateria(alumno,materia)) {
            System.out.println("NO SE PUEDE AGREGAR, PORQUE YA ESTA");
        return;
        }

        //El metodo esta en clase Materia
            materia.agregarAlumno(alumno);
    }




    public void imprimirListaOrdenada (){

        /*
        listaDeMaterias.stream()
                .sorted(Comparator.comparing(Materia::getNombre))
                .map(lista -> lista.getAlumnosInscritos())
                .forEach(System.out::println);
*/

        listaDeMaterias.stream()
                .sorted(Comparator.comparing(Materia::getNombre))
                .forEach(materia -> {
                    materia.getAlumnosInscritos()
                            .stream()
                            .sorted(Comparator.comparing(Alumno::getNombre))
                            .forEach(alumno -> System.out.println(materia.getNombre()+","+alumno.getNombre()));
                        });
    }
    }

/*

ArrayList<Materia> listaM = new ArrayList<>();
        listaM
            .stream()
            .sorted(Comparator.comparing(Materia::getNombre))
            .forEach(materia->{
            materia.getLista()
                .stream()
                .sorted(Comparator.comparing(Alumno::getNombre))
                .forEach(alumno->
                    System.out.println(materia.getNombre()+","+alumno.getNombre()));
        });
 */