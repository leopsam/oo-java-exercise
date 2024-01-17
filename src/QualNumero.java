public class QualNumero {
    public static void main(String[] args) throws Exception {
        int numero = -2;
        String positivoNegativo = "";
        
        if(numero > 0){
            positivoNegativo = "positivo";
        }else{
            positivoNegativo = "negativo";
        }
       
        if(numero % 2 == 0){
           System.out.println("É par e " + positivoNegativo);
        } else {
            System.out.println("É impar e " + positivoNegativo);
        }
    }
}

/**
    Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    
    Exemplos de Saída
    -5 é ímpar e negativo.
    10 é par e positivo.
*/