
package com.richard.revisao.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Lambda Stream  
 * Precidate
 * Intercao interna
 * 
 * @author richard
 */
public class LambdaStream2 {
   
    public static void filtro(List<String> lista, Predicate<String> condicao) {

//        for(String s : lista)
//            if(condicao.test(s))
//                System.out.println(s);

        lista.stream().filter(condicao::test)
                      .forEach(System.out::println);
    }
    public static void main(String[] args) {
        
        List<String> lista1 = Arrays.asList(
            "Minas Gerais", "Santa Catarina", "Sao Paulo",
            "Brasilia", "Ceara");
        
        System.out.println("Estados que iniciam com aletra s:");
        filtro(lista1, (s) -> s.startsWith("S"));
        
        System.out.println("-----------------------------------");
        System.out.println("Estados que finalizam com aletra a:");
        filtro(lista1, (s) -> s.endsWith("a"));
        
        System.out.println("-----------------------------------");
        System.out.println("Impreme a lista");
        filtro(lista1, (s) -> true);
        
        System.out.println("-----------------------------------");
        System.out.println("Impreme os estados com mais de 10 caracteres:");
        filtro(lista1, (s) -> s.length() > 10);
    }
    
}
