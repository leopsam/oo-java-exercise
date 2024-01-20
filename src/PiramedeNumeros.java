public class PiramedeNumeros {
    public static void main(String[] args) throws Exception {
        int x = 9;
      
        for(int i = 1; i < x+1; i++){
            System.out.println();
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }         
        }   
             
    }
}

/**
    Pirâmide de números
    
    Crie uma pirâmide de números, onde você deve imprimir em cada linha separada a quantidade de números que está sendo iterado no momento. 
    
    Por exemplo, se a sua iteração for de 5 elementos, o resultado final ficaria assim:
    
    1
    22
    333
    4444
    55555
*/

