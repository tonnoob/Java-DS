package aula17_08;

import java.util.Scanner;

public class Scanner2 {
    public static void main (String [] args) {
        Scanner cleiton = new Scanner (System.in);
        
        int a, b;
        System.out.println("Insira o valor de a e b: ");
        a = cleiton.nextInt();
        b = cleiton.nextInt();
        
        int res = a + b;
        System.out.println("O resultado da soma é: " + res);
        
        }
    
}
    
