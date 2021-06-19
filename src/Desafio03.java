import java.util.Scanner;

public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

	 * */
	public static boolean validaLados(int x, int y, int z) {
		if((x+y)>z) {
			return true;
		}return false;
	}
	public static boolean existeTriangulo(int ladoA, int ladoB,int ladoC) {
		return validaLados(ladoA,ladoB,ladoC)&&validaLados(ladoA,ladoC,ladoB)&&validaLados(ladoB,ladoB,ladoC);
		//outra maneira		
	}
	public static String tipoTriangulo(int ladoA, int ladoB,int ladoC) 
	{
		if(existeTriangulo(ladoA,ladoB,ladoC)) 
		{
			if(ladoA==ladoB||ladoA==ladoC) {
				return "Tri�ngulo eq�ilatero";
			}else if (ladoA==ladoB||ladoB==ladoC||ladoC==ladoA) {
				return "Tri�ngulo is�sceles";
			}else {
				return "Tri�ngulo escaleno";
			}
			
		}
		return "Tri�ngulo n�o existe";
	}
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a medida de cada lado do tri�ngulo e tecle Enter ap�s cada uma delas");
        System.out.println(tipoTriangulo(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
        leitor.close();
		
	}
}
