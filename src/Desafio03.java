import java.util.Scanner;

public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

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
				return "Triângulo eqüilatero";
			}else if (ladoA==ladoB||ladoB==ladoC||ladoC==ladoA) {
				return "Triângulo isósceles";
			}else {
				return "Triângulo escaleno";
			}
			
		}
		return "Triângulo não existe";
	}
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a medida de cada lado do triângulo e tecle Enter após cada uma delas");
        System.out.println(tipoTriangulo(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
        leitor.close();
		
	}
}
