package tutorias.altas.data;

import java.util.ArrayList;

public class Materia {

        private String nombre;
        public static final int CUPO = 15;

       private ArrayList<Alumno> alumnosInscritos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlumnosInscritos(ArrayList<Alumno> alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }


        public void agregarAlumno (Alumno alumno){

        getAlumnosInscritos().add(alumno);
    }



}
