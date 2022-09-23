package tutorias.zahira.actividadesCortas.Casting;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        A a1 = new A();
        B b1 = new B();
       // a1 =new C();

        C c1;
        if (a1 instanceof C) {
            c1 = (C) a1;
            System.out.println("El objeto si era de instancia C");
        }

        ArrayList<Object> listaInicial = new ArrayList<>();
        ArrayList<A> listaA = new ArrayList<>();
        ArrayList<B> listaB = new ArrayList<>();
        ArrayList<C> listaC = new ArrayList<>();



        listaInicial.add(new A());
        listaInicial.add(new B());
        listaInicial.add(new C());
        listaInicial.add(new A());
        listaInicial.add(new B());
        listaInicial.add(new C());
        listaInicial.add(new A());
        listaInicial.add(new B());
        listaInicial.add(new C());
        listaInicial.add(new A());

        for (Object recorrer:listaInicial){

            if(recorrer instanceof C){

                listaC.add((C)recorrer);

            }else if(recorrer instanceof B){

                listaB.add((B)recorrer);

            }else if(recorrer instanceof A){

                listaA.add((A)recorrer);

            }
        }
        System.out.println(listaA.size());
        System.out.println(listaB.size());
        System.out.println(listaC.size());

        System.out.println(listaInicial.size());


    }
}
