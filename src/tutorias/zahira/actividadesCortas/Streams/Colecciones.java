package tutorias.zahira.actividadesCortas.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Colecciones {

    public static void main(String[] args) {

        List<Estudiante> lista = Arrays.asList(
                        new Estudiante(80,"Camila"),
                        new Estudiante(90, "Alex"),
                        new Estudiante(80,"Alejandro"),
                        new Estudiante(50, "Roberto"),
                        new Estudiante(60, "Gaby"));


        lista.stream()
                    .sorted(Comparator.comparing(Estudiante::getCalificacion).reversed().thenComparing(Estudiante::getNombre))
                    .forEach(System.out::println);

        System.out.println("*********************************************************************************");

        //Determinar cuantos estudiantes tienen mas de 70
        long estudiantes =
        lista.stream()
                .filter(estudiante -> estudiante.getCalificacion() > 70 )
                .count();
        System.out.println(estudiantes);


        //Encontrar al alumno con la menor calificacion entre todos los que sacaron mas de 70

        lista.stream()
                .filter(estudiante -> estudiante.getCalificacion() > 70)
                .min(Comparator.comparing(Estudiante::getCalificacion).thenComparing(Estudiante::getNombre))
                .ifPresent(System.out::println);

        System.out.println("*********************************************************************************");

        //Encontrar al alumno que entre todos los que reprobaron quien tenia mejor calificacion

        lista.stream()
                .filter(estudiante -> estudiante.getCalificacion() <  70)
                .max(Comparator.comparing(Estudiante::getCalificacion).thenComparing(Estudiante::getNombre))
                .ifPresent(System.out::println);


        Optional<Estudiante> empate =
        lista.stream()
                .filter(estudiante -> estudiante.getCalificacion() > 70)
                .min(Comparator.comparing(Estudiante::getCalificacion).thenComparing(Estudiante::getNombre));
        if(empate.isPresent()){
            float calificacionMax;

            calificacionMax = empate.get().getCalificacion();

            estudiantes =
                    lista.stream()
                            .filter(estudiante -> estudiante.getCalificacion()  == calificacionMax )
                            .count();
            System.out.println(estudiantes);
        }

        List<Character>aToD = Arrays.asList('a','b','c','d');
        List<Character>eToG = Arrays.asList('e','f','g');
        Stream<List<Character>> stream = Stream.of(aToD,eToG);

        stream
               .flatMap(l -> l.stream())
                .map(c->(int)c)
          //      .forEach((i-> System.out.format("code : %d",i)));

                .forEach(System.out::println);


        List<Integer> list =
                Stream.of(1,2,3,4,5).collect(
                        () -> new ArrayList <>(),  //Creating the container
                        (l,i) -> l.add(i),  //
                        (l1,l2) -> l1.addAll(l2)
                        );

        System.out.println(list);


        List<Integer> list2 =
                Stream.of(1,2,3,4,5).collect(
                        ArrayList :: new,  //Creating the container
                        ArrayList :: add,  //Adding An Element
                        ArrayList :: addAll // Combining elements
                );

        System.out.println(list2);


        List<Integer> list3 =
                Stream.of(1,2,3,4,5).collect(

                Collectors.toList() );

        System.out.println(list3);



        int suma =
        Stream.of(1,2,3,4,5).reduce(
                0,  //Creating the container
                (v1,v2) -> v1 + v2
        );
        System.out.println(suma);

        int promedio =
                Stream.of(1,2,3,4,5).reduce(
                        0,  //Creating the container
                        (v1,v2) -> v1 + v2
                     //   s -> s/5

                );
        System.out.println(promedio);


    }




}
