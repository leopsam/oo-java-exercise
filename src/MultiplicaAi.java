public class MultiplicaAi {
    public static void main(String[] args) throws Exception {
        int x = 7;

        System.out.println("Tabela de multiplicação por " + x);
      
            for(int i = 1; i < 11; i++){
                int calc = x;   
                System.out.println(x + " x " + i + " = " + (calc * i));
            }
             
    }
}

/**
    Escreva um código que deve imprimir a tabela de multiplicação de algum número fornecido além de exibir um cabeçalho com o nome Tabela de multiplicação de X, onde X é o número a ser multiplicado.

    Exemplo de saída
    Tabela de multiplicação por 5
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
*/

