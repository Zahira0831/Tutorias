package tutorias.zahira.actividadesCortas.Streams;

import java.util.stream.Stream;

public class streamWithOptional {

    public static void main(String[] args) {

        String s =
        Stream.of("Uno","Dos","Tres","Cuatro","Cinco")
                    .findAny()
                    .get();
        System.out.println(s);

        //ENCONTRAR SI HAY AL MENOS UNA CALIFICACION MAYOR A 90.

        boolean existeUnNoventaYMas =
        Stream.of(new Calificacion(90),new Calificacion(60), new Calificacion(80))
                .map(promedio -> promedio.calificaciones)
                .filter(cali -> cali >= 90)
                .findAny()
                .isPresent();
        if (existeUnNoventaYMas) {

            System.out.println("SI LO ENCONTRE");
        }


        Stream.of(new Calificacion(90),new Calificacion(60), new Calificacion(80))
                .map(promedio -> promedio.calificaciones)
                .filter(cali -> cali >= 95)
                .findAny()
                .ifPresent(impresion -> System.out.println("SI LO ENCONTRE"));

Runnable runnable;

        Stream.of(new Calificacion(90),new Calificacion(60), new Calificacion(80))
                .map(promedio -> promedio.calificaciones)
                .filter(cali -> cali >= 95)
                .findAny()
                .ifPresentOrElse(impresion -> System.out.println("SI LO ENCONTRE"), () -> System.out.println("NO LO ENCONTRE"));

        Stream.of(new Calificacion(90),new Calificacion(60), new Calificacion(80))
                .map(promedio -> promedio.calificaciones)
                .filter(cali -> cali >= 95)
                .findFirst()
                .ifPresentOrElse(impresion -> System.out.println("SI LO ENCONTRE"), () -> System.out.println("NO LO ENCONTRE"));


        existeUnNoventaYMas =
        Stream.of(new Calificacion(90),new Calificacion(60), new Calificacion(80))
                .map(promedio -> promedio.calificaciones)
                .anyMatch(cali -> cali >= 95);
        if (existeUnNoventaYMas) {

            System.out.println("SI LO ENCONTRE");
        } else {
            System.out.println("NO ENCONTRE NADA");
        }



        existeUnNoventaYMas =
                Stream.of(new Calificacion(90),new Calificacion(60), new Calificacion(80))
                        .map(promedio -> promedio.calificaciones)
                        .allMatch(cali -> cali >= 95);
        if (existeUnNoventaYMas) {

            System.out.println(".allMatch      SI LO ENCONTRE");
        } else {
            System.out.println(".allMatch     NO ENCONTRE NADA");
        }





        existeUnNoventaYMas =
                Stream.of(new Calificacion(90),new Calificacion(60), new Calificacion(80))
                        .map(promedio -> promedio.calificaciones)
                        .noneMatch(cali -> cali >= 95);
        if (existeUnNoventaYMas) {

            System.out.println(".noneMatch     SI LO ENCONTRE");
        } else {
            System.out.println(".noneMatch     NO ENCONTRE NADA");
        }


    }


}
class Calificacion{

    public float calificaciones;

    public Calificacion(float cal) {
        this.calificaciones = cal;
    }

    @Override
    public String toString() {
        return "Calificaciones ='" + calificaciones + '\'' +
                '}';
    } }