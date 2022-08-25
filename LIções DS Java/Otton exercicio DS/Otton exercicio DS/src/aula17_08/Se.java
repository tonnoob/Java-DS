package aula17_08;

import javax.swing.JOptionPane;

public class Se {
    
    public static void main (String [] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        
        if (idade < 18) {
            System.out.println("Menor");
        }else {
            System.out.println("Maior");
        }
        
    }
}
