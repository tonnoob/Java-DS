package aula17_08;

import javax.swing.JOptionPane;

public class Catch2 {
   public static void main( String [] args) {
        try {
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
       int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
       
       int res = a + b;
       JOptionPane.showMessageDialog(null,"O valor da soma é: "+ res);
       
        }catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Caractere Inválido!");
        }
   }
}
