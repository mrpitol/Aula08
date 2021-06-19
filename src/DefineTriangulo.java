import java.util.Scanner;
public class DefineTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um programa que peça que o usuário digite os valores dos 3 lados de um triângulo.
O seu programa deverá validar se o triângulo existe. (A regra para isso é que a soma de quaisquer 2 lados do triângulo tem que ser SEMPRE maior do que o terceiro e nenhum lado deve ser zero).
Além disso, caso o triângulo exista, o seu programa deverá mostrar o tipo dele.*/
		//PRIMEIRA ETAPA - Receber as medidas de 3 lados
		Scanner leitor = new Scanner(System.in);
		double ladoA, ladoB, ladoC;
		System.out.println("Digite a medida do ladoA da figura:");
		ladoA = leitor.nextDouble();
		System.out.println("Digite a medida do ladoB da figura:");
		ladoB = leitor.nextDouble();
		System.out.println("Digite a medida do ladoC da figura:");
		ladoC = leitor.nextDouble();
		
		//SEGUNDA ETAPA - Validar se o Triangulo Existe
		// O ladoA + ladoB > que ladoC && O ladoB + ladoC > que ladoA & O ladoA + ladoC > que ladoB e nenhum lado deve ser zero - && (ladoA !=0) && (ladoB !=0) && (ladoC !=0) 
		
		//if (lado1 != 0 && lado2 != 0 && lado3 != 0)
		//{
		//soma1 = lado1 + lado2;
		//soma2 = lado1 + lado3;
		//soma3 = lado2 + lado3;
		//if(soma1 < lado3 || soma2 < lado2 || soma3 < lado1)
		//{
		if ((ladoA + ladoB > ladoC)&& (ladoB + ladoC > ladoA)&& (ladoA + ladoC > ladoB)) {
			System.out.println("O triagulo Existe");
		//TERCEITA ETAPA - Validar o Tipo
			if ((ladoA == ladoB) && (ladoA == ladoC)) {
				System.out.println("O triagulo é EQUILÁTERO");
			}else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)){
				System.out.println("O triagulo é ESCALENO");
			}else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
				System.out.println("O triagulo é ISÓCELES");
			}		
		}else {
			System.out.println("O triagulo Não Existe");
		}
		
		
		leitor.close();
	}}

