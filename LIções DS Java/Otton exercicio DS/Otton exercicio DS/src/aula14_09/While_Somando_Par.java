package aula14_09;
public class While_Somando_Par {
    public static void main(String [] args) {
            int par = 0;
            int i = 0;
            while (i <= 100) {
                if (i % 2 == 0) {
                    par = par + i;
                    System.out.println(i + " par");
            } else {
                System.out.println(i + " impar");
            }
            
            i++;
        }
        System.out.println("O total da soma par é:" + par);
            
    }
    
}
