package tutorias.zahira.actividadesCortas.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
//generador de lista/coleccion de valores.
        List<String> lista =Arrays.asList(new String []{"Hola","Como estas", "Que tal"});

//declaramos la corrida de datos String(Lista)
        Stream<String> datos = lista.stream();

//forEach para recorrer cada uno de los elementos de la corrida de stream.
        datos.forEach(v -> System.out.println(v));

//Hay error de compilacion por duplicar un stream que ya se utilizo y consumio.
        //stream.forEach(v -> System.out.println(v));

//Podemos generar contenedores nuevos solo con variable.stream
        lista.stream().forEach((String v) -> System.out.println(v));
//Aunque parezca igual es in nuevo contenedor por el variable.stream()
        lista.stream().forEach((String v) -> {
                                            System.out.println(v);
                                             });

        lista.stream().forEach(System.out::println);

// .of genera un String de valores, solo qu este no se puede reutilizar.
        Stream.of("Hola","Como estas", "Que tal").forEach(System.out::println);

        System.out.println();
        Stream.of(new String []{"Hola","Como estas", "Que tal"}).forEach(System.out::println);


//.generate : Genera valores aleatoriosdel metodo indicado.
        Stream.generate(Math::random).limit(5).forEach(System.out::println);


        Stream.iterate(1,t -> t*2).limit(5).forEach(System.out::println);


     //   Stream.iterate(1,t -> (t-1) + (t-2)).limit(5).forEach(System.out::println);



        Stream.<String> builder().add("Primero").add("Segundo").add("Tercero").build().forEach(System.out::println);

//Declarar una variable que guarde el builder
        Stream.Builder<String> declaracion = Stream.<String> builder().add("Primero").add("Segundo").add("Tercero");
        declaracion.accept("Cuarto");
        declaracion.build().forEach(System.out::println);


        System.out.println();
        lista.stream()
                .filter(v -> v.startsWith("C"))
                .forEach(System.out::println);


    }





}
