package aula31_08;
public class soma_impares_pares {
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
        }
        System.out.println("Total de números ímpar" + totalpar);
        System.out.println("Total de números pares" + totalimpar);      
    }
}
    
            

