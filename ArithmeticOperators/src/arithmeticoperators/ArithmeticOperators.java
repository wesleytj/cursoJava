/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticoperators;

/**
 *
 * @author wesle
 */
public class ArithmeticOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);*/
        
        /*int numero = 5;
        numero++;
        System.out.println("Incrementa numero: " + numero);
        
        int numero2 = 5;
        numero2--;
        System.out.println("Decrementa numero2: " + numero2);
        
        int numero3 = 5;
        int valor = 5 + numero3++;
        System.out.println("Primeiro soma valor com numero3 e depois incrementa numero3: " + valor);
        
        int numero4 = 5;
        int valor2 = 5 + ++numero4;
        System.out.println("Soma valor2 com numero4 já incrementado: " + valor2);*/
        
        /*int x = 4;
        x += 2; // x = x + 2
        System.out.println("Soma atribuida: " + x);
        
        int y = 4;
        y -= 2; // y = y - 2
        System.out.println("Subtração atribuida: " + y);
        
        int z = 4;
        z *= 2; // z = z * 2
        System.out.println("Multiplicação atribuida: " + z);
        
        int o = 4;
        o /= 2; // o = o / 2
        System.out.println("Divisão atribuida: " + o);
        
        int a = 4;
        a %= 2; // a = a % 2
        System.out.println("Resto por atribuição: " + a);*/
        
        /*float valor = (float) 8.4;
        int arBaixo = (int) Math.floor(valor);
        int arCima = (int) Math.ceil(valor);
        int arArit = (int) Math.round(valor);
        System.out.println("O número é: " + valor);
        System.out.println("Arredonda pra baixo: " + arBaixo);
        System.out.println("Arredonda pra cima: " + arCima);
        System.out.println("Arredonda Aritméticamente: " + arArit);*/
        
        double aleatorio = Math.random();
        int number = (int) (aleatorio * 10) + 1;
        System.out.println("Gera um número aleatório");
        System.out.println("O número gerado é: " + aleatorio);
        System.out.println("O inteiro do numero gerado é: " + number);
    }
    
}
