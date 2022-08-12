package tutorias.zahira.practicaArreglo.process;

import java.util.ArrayList;
import java.util.Arrays;

public class ProcesamientoArray {

    public ArrayList<Integer> getMaxValuePerProduct (int [][] matrizProfitQuarter){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<matrizProfitQuarter.length; i++){
            int maxValue = Integer.MIN_VALUE;
            for ( int j=0; j<matrizProfitQuarter[i].length; j++){

                if (matrizProfitQuarter[i][j]>maxValue){

                    maxValue = matrizProfitQuarter[i][j];

                }
            }
            list.add(maxValue);
        }
        return list;
    }

    public ArrayList <Integer> getMinValuePerProduct (   int [][] matrizProfitQuarter){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<matrizProfitQuarter.length; i++){
            int minValue = Integer.MAX_VALUE;
            for ( int j=0; j<matrizProfitQuarter[i].length; j++){

                if (matrizProfitQuarter[i][j]<minValue){

                    minValue = matrizProfitQuarter[i][j];

                }
            }
            list.add(minValue);
        }
        return list;
    }

    public int getMaxQuarter (   int [][] matrizProfitQuarter){

        int [] value = new int [matrizProfitQuarter.length];

        for( int i=0; i<matrizProfitQuarter.length; i++){
            for(int j=0; j<matrizProfitQuarter[i].length; j++){

                value [j] += matrizProfitQuarter[i][j];

            }
        }

        System.out.println(Arrays.toString(value));
        return Arrays.stream(value).min().getAsInt();
    }

  /*  public ArrayList <Integer> getMaxValuePerProduct (   int [][] matrizProfitQuarter){

        ArrayList<Integer> list = new ArrayList<>();

        for (int [] renglon:matrizProfitQuarter){
            int maxValue = Integer.MIN_VALUE;
            for ( int celda:renglon){

                if (celda>maxValue){

                    maxValue = celda;

                }
            }
            list.add(maxValue);
        }
        return list;

   */


}
