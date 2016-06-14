
package com.richard.revisao.stream;

import java.util.Arrays;
import java.util.List;

/**
 *  Lambda Stream
 *  
 *  E uma sequencia de elementos.
 *  Nesta ha funcoes para operacoes em massa, 
 *  promovendo assim, facil manipulacao dos elementos.
 *  
 *  - Nao e uma estrutira de dados 
 *  - Utilizacao conjunta com as expressoes lambdas 
 *  - Nao ha acesso indexado
 *  - Facilmente convertido para matrizes e listas 
 *  - Suporte a lazy access
 *  - Pipeline, interacao interna
 *  
 * @author richard
 */
public class LambdaStream {
    
    public static void main(String[] args) {
        
        //Antes do Java 8
        List<String> lista1 = Arrays.asList(
            "Minas Gerais", "Santa Catarina",
            "Sao Paulo", "Brasilia", "Ceara");
        
        for (String s : lista1) {
            System.out.println(s);
        }
        System.out.println("------------------------------");
        
        //lambda
        lista1.forEach(x -> System.out.println(x));
        System.out.println("------------------------------");
        
        //melhorada
        lista1.forEach(System.out::println);
        

        
       
    }
    
}
