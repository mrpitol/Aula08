import java.util.Scanner;
public class Desafio02 {
	/*Para um ano ser bissexto ele deve ser m�ltiplo de 4, mas n�o ser m�ltiplo de 100 (com exce��o dos anos que forem m�ltiplos de 400).
Crie um programa com uma fun��o que receba um ano em uma vari�vel inteira, fa�a os testes para verificar se ele � bissexto, e retorne uma String dizendo �O ano informado � bissexto� ou �O ano informado n�o � bissexto).
A main do seu programa deve conter a digita��o do ano, a chamada da fun��o e a exibi��o do texto retornado.


	 * */
	public static boolean validaAnoBissexto(int ano) {
		if (ano%400==0 ||ano%4==0 && ano%100!=0 ) {
			{
				return true;
				}
			}
				return false;
		}
	public static void main(String[] args) {
		int ano;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite o ano!");
		ano=leitor.nextInt();
		if (validaAnoBissexto(ano)) 
		{
			System.out.println("O ano informado � bissexto!");
		}else {
			System.out.println("O ano informado N�O � bissexto!");
		}leitor.close();
	}
	}
