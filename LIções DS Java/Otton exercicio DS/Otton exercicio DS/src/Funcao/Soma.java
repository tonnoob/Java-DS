package Funcao;

import javax.swing.JOptionPane;

public class Soma {
    
     void soma() {
    try{

int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor: "));
int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor: "));

int res = a+b;
        
JOptionPane.showMessageDialog(null, "O valor da soma é: "+ res);
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Caractere INválido!");
        
        }
     } 
     
      void sub() {
    try{

int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor: "));
int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor: "));

int res = a+b;
        
JOptionPane.showMessageDialog(null, "O valor da soma é: "+ res);
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Caractere Inválido!");
        
        }
     } 
       
       void mult() {
    try{
  
int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor; "));
int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor; "));
    
    int res = a+b;
    
JOptionPane.showMessageDialog(null, "O valor da soma é: "+ res);
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Caractere inválido!");
    
    }
       }
       
       void div() {
    try{
  
int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor; "));
int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor; "));
    
    int res = a+b;
    
JOptionPane.showMessageDialog(null, "O valor da soma é: "+ res);
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Caractere inválido!");
    
               }
               }
       }
    
        
      
      
   
