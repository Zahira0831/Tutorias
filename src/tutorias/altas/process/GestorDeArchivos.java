package tutorias.altas.process;

import tutorias.altas.data.Alumno;
import tutorias.altas.data.Materia;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;

public class GestorDeArchivos {

    static final Path ARCHIVO_DE_GUARDADO = Path.of("salon.txt");

    public void guardarLista (ArrayList<Materia> listaDeMaterias ){



        //"try" se pone el codigo del algoritmo, lo que deberia hacer, asumiendo que nada falla.
        // "catch" propone soluciones en dado caso que falle el codigo try, es muy comun que solo se haga un print line
             //   donde diga donde fallo.

        try {

            if(!ARCHIVO_DE_GUARDADO.toFile().exists()){
                ARCHIVO_DE_GUARDADO.toFile().createNewFile();
            }

            Files.write(ARCHIVO_DE_GUARDADO,("").getBytes(StandardCharsets.UTF_8), StandardOpenOption.TRUNCATE_EXISTING);

            listaDeMaterias.stream()
                    .sorted(Comparator.comparing(Materia::getNombre))
                    .forEach(materia -> {
                        materia.getAlumnosInscritos()
                                .stream()
                                .sorted(Comparator.comparing(Alumno::getNombre))
                                .forEach(alumno -> {
                                    try {
                                        Files.write(ARCHIVO_DE_GUARDADO,(materia.getNombre()+","+alumno.getNombre()+ "\n").getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                         e.printStackTrace();
                                    }
                                });
                    });
       } catch (IOException e) {
        e.printStackTrace();
    }


    }
     public  ArrayList<Materia> leerlista (ArrayList<Materia> listaDeMaterias){
        Materia español;
        Materia matematicas;

        if(listaDeMaterias.get(0).getNombre().equals("Matematicas")){
            matematicas = listaDeMaterias.get(0);
            español = listaDeMaterias.get(1);
        } else {
            matematicas = listaDeMaterias.get(1);
            español = listaDeMaterias.get(0);
        }

         try {
           /*  Files.readAllLines(ARCHIVO_DE_GUARDADO)
                     .stream()
                     .forEach(System.out::println); */
             for(String line: Files.readAllLines(ARCHIVO_DE_GUARDADO)){
                String nombreAlumno = line.split(",") [1];
                String nombreMateria = line.split(",") [0];

                Alumno alumno = new Alumno();
                alumno.setNombre(nombreAlumno);
                if (nombreMateria.equals("Matematicas")){
                    matematicas.agregarAlumno(alumno);
                } else {
                    español.agregarAlumno(alumno);
                }
             }
         } catch (IOException e) {
             e.printStackTrace();
         }

        return null;
     }



}
/*
Path path = Path.of("ejemplo.txt");
        try {
            if(!path.toFile().exists()){
                path.toFile().createNewFile();
            }
            Files.write(path,"hola -> HOLA\n".getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            Files.readAllLines(path)
                .stream()
                .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
 */