/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula17_08;

public class triângulo {
    
    public static void main (String [] args ) {
        
        int a = -15;
        int b = -15;
        int c = 15; 
        
        if ((a == b) && (a == c ) && (b == c)) {
            System.out.print("Triangulo Equilátero ");
    } else if ((a == b) || (a == c) || (b == c)) {
           System.out.println("Triângulo Isósceles ");
       }else if ((a != b ) && (a != c) && (b != c)) {
               System.out.println("Triângulo Escaleno ");
    }else{
           System.out.println("Erro");
    }
            
    }
    
}
