package aula10_08;
    import javax.swing.JOptionPane;

public class SomaJOptionPane {
   public static void main( String [] args) {
       
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
       int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
       
       int res = a + b;
       JOptionPane.showMessageDialog(null,"O valor da soma é: "+ res);
               
   }
    
}
