public class DuplicadosNao {
    public static void main(String[] args) throws Exception {
        
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};      
       
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }

            }

        }   
             
    }
}

/**
   Duplicados não!
    
    Escreva um código que encontre os elementos em comum que existem em dois arrays e imprima no console quais são esses elementos, um a um.
    
    // Exemplo com as seguintes entradas:
    
    array1 => "Morango", "Banana", "Maçã", "Uva", "Caqui"
    array2 => "Manga", "Caqui", "Morango", "Amora"
    
    // A saída seria:
    Morango
    Caqui
*/

