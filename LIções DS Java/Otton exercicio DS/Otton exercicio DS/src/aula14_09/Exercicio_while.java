package aula14_09;
public class Exercicio_while {
    public static void main (String [] args) {
/*faça um algoritomo em java utilizando a estrutura enquanto (while) de 1 a 100
separe os numeros pares dos impares*/       
            int i = 0;
            while (i <= 100) {
                if (i % 2 == 0) {
                    System.out.println(i + " par");
            } else {
                System.out.println(i + " impar");
            }
            
            i++;
        }
    }
}