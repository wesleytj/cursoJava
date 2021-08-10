/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaryoperator;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class TernaryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 0, n2 = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Operador Ternário ===");
        System.out.println("Digite o valor para n1: ");
        n1 = sc.nextInt();
        System.out.println("Digite o valor para n2: ");
        n2 = sc.nextInt();        
        int maior = n1 > n2 ? n1 : n2;
        System.out.println("O maior valor digitado foi: " + maior);
    }
    
}
