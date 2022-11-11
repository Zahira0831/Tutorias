package tutorias.zahira.actividadesCortas.Streams;

public class Estudiante {

        private float calificacion;
        private String nombre;

        public Estudiante(String nombre) {
            this.nombre = nombre;
        }



    @Override
    public String toString() {
        return "Estudiante{" +
                "calificacion=" + calificacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }




    public Estudiante(float calificacion, String nombre) {
        this.calificacion = calificacion;
        this.nombre = nombre;
    }



    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}



