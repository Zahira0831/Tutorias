package tutorias.zahira.actividadesCortas.Streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {


        Stream.of("Nueve", "Diez","Once","Once")
                                .map(m -> m.toUpperCase())
                                .distinct()
                                .forEach(System.out::println);

        Stream.generate(Math::random)
                    .limit(100)
                    .map(numeros -> numeros*100)
                    .map(numeros -> numeros.intValue())
                    .parallel()
                    .filter(numeros -> numeros > 20 && numeros < 60)
                    .sequential()
                    .sorted()
                    .forEach(System.out::println);

        Stream.of(new Estudiante("Camila"),new Estudiante("Michelle"),new Estudiante("Erandi"))
                                .peek(System.out::println)
                                .filter(m-> m.getNombre().startsWith("M"))
                                .peek(System.out::println)
                                .map(m -> m.getNombre())
                                .forEach(System.out::println);

                        System.out.println("************************************************");


        Stream.of(new Estudiante("Camila"),new Estudiante("Michelle"),new Estudiante("Erandi"))
                .sorted(Comparator.comparing(m -> m.getNombre()))
                .skip(2)
                .map(m -> {
                            return m.getNombre();
                                                }
                                                    )
                .filter(m-> m.startsWith("M"))
                .forEach(System.out::println);
    }


}

