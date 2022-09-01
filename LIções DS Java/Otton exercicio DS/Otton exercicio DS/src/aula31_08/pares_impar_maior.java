package aula31_08;

public class pares_impar_maior {
    public static void main(String [] args) {
    int totalpar = 0;
    int totalimpar = 0;
    
        for(int i = 0; i <= 100; i++){
            
            if(i % 2 == 0){
                totalpar = totalpar +i;
                System.out.println(i + " par");
                
            }else{
                totalimpar = totalimpar + i;
                System.out.println(i + "ímpar");
            }
        
        System.out.println("Total de números ímpar" + totalpar);
        System.out.println("Total de números pares" + totalimpar); 
    
    }
        if (totalimpar > totalpar){
            System.out.println("O número impar possui a maior quantidade sendo:" + totalimpar );
        }
        else{
            System.out.println("O numero par possui a maior quantidade sendo:" + totalpar);
            
        }
}
}
    

