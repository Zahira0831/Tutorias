package tutorias.zahira.practicaArreglo.ui;

import tutorias.zahira.practicaArreglo.process.ProcesamientoArray;

public interface CLI {

    static void EscenarioPrueba (){

        int [][] matrizProfitQuarter = {
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308}};

        ProcesamientoArray obj = new ProcesamientoArray();

        System.out.println(obj.getMaxValuePerProduct(matrizProfitQuarter));
        System.out.println(obj.getMaxQuarter(matrizProfitQuarter));
        System.out.println(obj.getMinValuePerProduct(matrizProfitQuarter));


    }


}
