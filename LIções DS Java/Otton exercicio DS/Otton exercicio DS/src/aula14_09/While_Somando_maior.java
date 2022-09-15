package aula14_09;

public class While_Somando_maior {
    public static void main(String [] args) {
            int totalimpar = 0;
            int totalpar = 0;
            int i = 0;
            while (i <= 100) {
                if (i % 2 == 0) {
                    System.out.println(i + " par");
                    totalpar = totalpar + i;
            } else {
                System.out.println(i + " impar");
                totalimpar = totalimpar + i;
            }
            
            i++;
        }  
        if (totalimpar > totalpar){
            System.out.println("O número impar possui maior valor sendo: " + totalimpar);
        
        }else {
            System.out.println("O número par possui maior valor sendo: " + totalpar);
    }
}
}
    

    

