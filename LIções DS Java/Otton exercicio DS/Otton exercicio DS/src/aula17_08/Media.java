package aula17_08;

public class Media {
    public static void main (String [] args) {   
        double media = 15;
    if ((media > 0) && (media < 5 )) {
        System.out.print("Retido");
    } else if ((media >= 5) && (media <= 7)) {
           System.out.println("Regular");
       }else if ((media > 7) && (media <= 10)) {
               System.out.println("MB");
    }else{
           System.out.println("Erro");
    }
    
    }    
           
}
