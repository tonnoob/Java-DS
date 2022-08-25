package aula24_08;
public class Desafio_ordenar {
    public static void main(String [] args) {
        
        int a = 3;
        int b = 3;
        int c = 1;
        
    if (a < b ){
        if (b < c ) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (a < c) { 
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);   
        }
    }
    else if (b < c) {
        if (a < c) { 
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
    }
    }
    else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
