package aula14_09;
public class While_Somando_Impar {
    public static void main(String [] args){
            int impar = 0;
            int par = 0;
            int i = 0;
            while (i <= 100) {
                if (i % 2 == 0) {
                    System.out.println(i + " par");
                    par = par + i;
            } else {
                System.out.println(i + " impar");
                impar = impar + i;
            }
            
            i++;
        }
        System.out.println("O total da soma par é:" + par);
        System.out.println("O total da soma impar é:" + impar);
        
            
    }
    
}


