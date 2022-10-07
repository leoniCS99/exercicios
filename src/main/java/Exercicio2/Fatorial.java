package Exercicio2;

//1.2 - Calcular fatorial de um numero recursivamente Ex: 5! =1*2*3*4*5 = 120

public class Fatorial {

    public static void main(String[] args) {
        System.out.println(fatorial(9));

    }

    private static int fatorial(int n){
        if (n == 0){
            return 1;
        }else {
            return n * fatorial(n-1);
        }
    }

}


