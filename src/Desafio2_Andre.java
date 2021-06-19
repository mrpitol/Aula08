import java.util.Scanner;
public class Desafio02 {
    /*Para um ano ser bissexto ele deve ser múltiplo de 4, mas não ser múltiplo de 100 (com exceção dos anos que forem múltiplos de 400).
Crie um programa com uma função que receba um ano em uma variável inteira, faça os testes para verificar se ele é bissexto, e retorne uma String dizendo “O ano informado é bissexto” ou “O ano informado não é bissexto).
A main do seu programa deve conter a digitação do ano, a chamada da função e a exibição do texto retornado.
     * */
    public static String ehBissexto(int ano) {
        if (ano % 4 == 0) {
            //Talvez seja bissexto
            if (ano % 400 == 0) {
                //Com certeza é bissexto, porque é múltiplo de 4 e de 400!
                return "O ano informado é bissexto";    
            }else if(ano % 100 == 0) {
                //Não é bissexto, porque é multiplo de 4, é multiplo de 100, mas não é multiplo de 400!
                return "O ano informado não é bissexto";
            }
            //É bissexto, porque é multiplo de 4, não é multiplo de 400 e nem de 100
            return "O ano informado é bissexto";    
        }else {
            //Não é bissexto porque não é divisível por 4
            return "O ano informado não é bissexto";
        }
    }
    public static void main(String[] args) {
        int ano;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, digite o ano");
        ano = leitor.nextInt();
        System.out.println(ehBissexto(ano));
        leitor.close();
    }
}
