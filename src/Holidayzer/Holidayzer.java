package Holidayzer;

public class Holidayzer {

    static Feriados[] feriados = {
        new Feriados("01-01-2024", "Confraternização Mundial"),
        new Feriados("12-02-2024", "Carnaval"),
        new Feriados("13-02-2024", "Carnaval"),
        new Feriados("29-03-2024", "Sexta-feira Santa"),
        new Feriados("21-04-2024", "Tiradentes"),
        new Feriados("01-05-2024", "Dia do Trabalho"),
        new Feriados("30-05-2024", "Corpus Christi"),
        new Feriados("07-09-2024", "Independência do Brasil"),
        new Feriados("12-10-2024", "Nossa Senhora Aparecida"),
        new Feriados("02-11-2024", "Finados"),
        new Feriados("15-11-2024", "Proclamação da República"),
        new Feriados("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
        new Feriados("25-12-2024", "Natal")
    }; 
    public static void main(String[] args) {  
        imprimirFeriados();
        verificaFeriado();
    }

    public static void imprimirFeriados() {
        for(int i = 0; i < feriados.length; i++){
            System.out.println(feriados[i].getDate() + " => " + feriados[i].getName());  
        }
    }

    public static void verificaFeriado() {
        String x = "25-12-2024";

        for(int i = 0; i < feriados.length; i++){
            if(feriados[i].getDate() == x){
                System.out.println("Dia " + feriados[i].getDate() + " é " + feriados[i].getName() + "!");
                break;
            }
            if(feriados.length == i+1){
                System.out.println("Dia " + x + " não é feriado");
            }
        }
    }
       
}

/**
Holidayzer

Vamos criar uma aplicação Java que será um calendário de feriados! Para isso, queremos:

Uma função que imprime a lista com todos os feriados

Uma função que recebe uma data como parâmerto e retorna uma mensagem.

Se o dia não for feriado, imprime: “Dia não é feriado 🥲”
Se o dia for feriado, retorna: “Dia é ! 🎉”
Os feriados devem ser objetos criados a partir de uma classe. Lembre-se de utilizar o conceito de encapsulamento (com getters e setters conforme a necessidade).

Utilize mais parâmetros e funções caso sinta necessidade.

📅 Lista de Feriados

"01-01-2024" => "Confraternização Mundial"
"12-02-2024" => "Carnaval"
"13-02-2024" => "Carnaval"
"29-03-2024" => "Sexta-feira Santa"
"21-04-2024" => "Tiradentes"
"01-05-2024" => "Dia do Trabalho"
"30-05-2024" => "Corpus Christi"
"07-09-2024" => "Independência do Brasil"
"12-10-2024" => "Nossa Senhora Aparecida"
"02-11-2024" => "Finados"
"15-11-2024" => "Proclamação da República"
"20-11-2024" => "Dia Nacional de Zumbi e da Consciência Negra"
"25-12-2024" => "Natal"
💡 Dicas

Para criar uma função na classe App ⇒ public static <tipo> <nome-da-funcao> (params) { … }
Para criar uma variável que pode ser usada globalmente no App, adicione a palavra static antes da declaração ⇒ Ex: static int numero = 5;
Essas dicas são necessárias pois o método main() precisa ser estático 😄
*/

