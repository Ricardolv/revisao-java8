package com.richard.revisao.explambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Expressoes Lambdas 
 * 
 * @author richard
 */
public class ExpressoesLambdas {

    public static void main(String[] args) {

        //====== Implementacao da classe anonima Runnable =====
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable: expressão lambda 1");
            }
        };

        Runnable run2;
        run2 = () //lista de argumentos 
                -> //seta
                System.out.println("Runnable: expressão lambda 2"); //corpo

        run1.run();
        run2.run();

        //======= Implementacao da classe  Thread =======
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Thread com classer interna!");
            }
        };
        new Thread(r).start();

        new Thread(() -> System.out.println("Thread: expressão lambda 1")).start();

        //Imprime todos os elementos da lista !
        List<Integer> list1 = Arrays.asList(9, 2, 6, 3, 1, 7, 5, 4, 8);
        for (Integer n1 : list1) {
            System.out.print(n1);
        }
        System.out.println("");

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list2.forEach(n2 -> System.out.print(n2));
        System.out.println("");

        //====== Implementacao da classe anonima Comparator  =====
        List<String> palavras = Arrays.asList("rodrigo", "paulo", "caelum");

        Comparator<String> comparador1 = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        //E em seguida utilizamos o Collections.sort para ordenar a lista com o criterio de comparacao definido.
        Collections.sort(palavras, comparador1);

        //podemos fazer desta forma: ha um novo metodo em java.util.List, que e o sort.
        palavras.sort(comparador1);

        //Comparator de maneira bem mais enxuta
        Comparator<String> comparador2 = (s1, s2) -> {
            return Integer.compare(s1.length(), s2.length());
        };
    }

}
