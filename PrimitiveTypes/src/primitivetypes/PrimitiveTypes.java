package primitivetypes;

import java.util.Scanner;

/**
 *
 * @author Wesley Jacques
 */
public class PrimitiveTypes {

    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String aluno = sc.nextLine();
        System.out.printf("Digite a nota do(a) %s: ", aluno);
        float nota = sc.nextFloat();
        System.out.printf("A nota do(a) %s é %.1f .", aluno, nota);*/
        
        /*System.out.println("======== Conversão de Tipos ========");
        System.out.println("Converta um tipo Integer para String:");
        int number = 5;
        String txt = Integer.toString(number);
        System.out.println("Agora number é uma String: " + txt);
        System.out.println("====================================");*/
        
        System.out.println("======== Conversão de Tipos ========");
        System.out.println("Converta uma String para Integer:");
        String txt = "132";
        int number = Integer.parseInt(txt);
        System.out.println("Agora txt é um Integer: " + number);
        System.out.println("====================================");
    }
    
}
