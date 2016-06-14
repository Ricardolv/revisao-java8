package com.richard.revisao.interacaointerna;

import java.util.Arrays;
import java.util.List;

/**
 * Interacao Interna 
 * 
 * @author richard
 */
public class InteracaoInterna {
    
    public static void main(String[] args) {
        
        List<String> itens = Arrays.asList("item1", "item2", "item3");
        
        //Interacao Externa:
        
        //for tradicional
        for (int i = 0; i < itens.size(); i++) {
            //System.out.println(itens.get(i));
        }
        
        //versao 5 do java 
        for (String str : itens) {
            //System.out.println(str);
        }
        
        //intercao interna
        itens.forEach( (str) -> System.out.println(str) );
        
        
        
        
    }
}
