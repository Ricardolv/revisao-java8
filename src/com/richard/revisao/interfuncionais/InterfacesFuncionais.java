package com.richard.revisao.interfuncionais;

/**
 * Interfaces Funcionais 
 * 
 * @author richard
 */
public class InterfacesFuncionais {
    
    
    interface Num {
        double getValue();
    }
    
    interface ValorNumerico1 {
        boolean teste(int n);
    }
    
    interface ValorNumerico2 {
        boolean teste(int n1, int n2 );
    }
    
    public static void main(String[] args) {
        
        //Expressao lambda utilizada como uma constante 
        Num num = () -> 777.11;
        System.out.println(num.getValue());
        
        //Utilizacao da classe math com a estrutura lambda
        Num n2 = () -> Math.random() * 100;
        System.out.println(n2.getValue());
        System.out.println(n2.getValue());
        
        ValorNumerico1 isPar = (int i) -> (i % 2) == 0; 
        System.out.println("isPar: " + isPar.teste(89) );
        System.out.println("isPar: " + isPar.teste(90) );
        
        ValorNumerico2 isDiv = (x, y) -> (x % y) == 0; 
        System.out.println("isDiv: " + isDiv.teste(10, 2) );
        System.out.println("isDiv: " + isDiv.teste(10, 3) );
        
        ValorNumerico1 expressao1 = i -> (i % 2) == 0; 
        System.out.println("expressao1: " + expressao1.teste(89) );
        System.out.println("expressao1: " + expressao1.teste(90) );
        
        //bloco lambda
        ValorNumerico2 expressao2 = (x, y) -> {
            int w = x + y;
            return w > 1000;
        };
        System.out.println("expressao2: " + expressao2.teste(10, 20) );
    
    }
    
    
}
