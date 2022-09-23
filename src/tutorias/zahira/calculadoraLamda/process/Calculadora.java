package tutorias.zahira.calculadoraLamda.process;

public class Calculadora {

   public OperacionAritmetica suma = (primero, segundo) -> primero + segundo;
   public OperacionAritmetica resta = (primero, segundo) -> primero - segundo;
   public OperacionAritmetica multiplicacion = (primero, segundo) -> primero * segundo;
   public OperacionAritmetica division = (primero, segundo) -> primero / segundo;


   public int calcular(OperacionAritmetica operacion, int primero, int segundo){

       return operacion.apply(primero, segundo);
   }
}


