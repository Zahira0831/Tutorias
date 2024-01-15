package tutorias.zahira.practicaArreglo.tests;

import org.junit.Assert;
import org.junit.Test;
import tutorias.zahira.practicaArreglo.process.ProcesamientoArray;

import java.util.ArrayList;

public class ProcesamientoArrayTest {

   private static int [][] matrizProfitQuarter = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}};


    @Test
    public void getMaxValuePerProduct_Test () {

           ArrayList<Integer> objetivo = new ArrayList<>();
                   objetivo.add(483);
                   objetivo.add(500);
                   objetivo.add(474);
                   objetivo.add(415);
            ProcesamientoArray obj = new ProcesamientoArray();
            Assert.assertEquals(objetivo, obj.getMaxValuePerProduct(matrizProfitQuarter));

         //   System.out.println(obj.getMaxValuePerProduct(matrizProfitQuarter));
           // System.out.println(obj.getMaxQuarter(matrizProfitQuarter));
           // System.out.println(obj.getMinValuePerProduct(matrizProfitQuarter));


        }

    @Test
    public void getMinValuePerProduct_Test () {

        ArrayList<Integer> objetivo = new ArrayList<>();
        objetivo.add(111);
        objetivo.add(158);
        objetivo.add(160);
        objetivo.add(114);
        ProcesamientoArray obj = new ProcesamientoArray();
        Assert.assertEquals(objetivo, obj.getMinValuePerProduct(matrizProfitQuarter));

    }
}




