import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int x = 4;        
        List<Integer> sequenciaFibonacci = new ArrayList<>();
        
        if(x == 0) System.out.println("x é igual a 0");
        if(x == 1) System.out.println("0");

        if(x != 1 && x != 0){
            sequenciaFibonacci.add(0);
            sequenciaFibonacci.add(1);
             for(int i = 0; i < x; i++){
                int ultimo = (sequenciaFibonacci.get(sequenciaFibonacci.size()-1));
                int penultimo = (sequenciaFibonacci.get(sequenciaFibonacci.size()-2));
                sequenciaFibonacci.add(ultimo + penultimo);
                System.out.print(sequenciaFibonacci.get(i) + " ");
            }
        }       
    }
}

/**
    Dado um número inteiro x, imprima uma sequência de Fibonacci de tamanho x.

    Exemplo de saída para uma sequência de tamanho 5
    0 1 1 2 3

    Exemplo de saída para uma sequência de tamanho 10
    0 1 1 2 3 5 8 13 21 34

    Exemplo de saída para uma sequência de tamanho 10
    0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
*/