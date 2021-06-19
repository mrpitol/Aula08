
public class Funcoes {
	// Função para teste de login
	public static boolean login  (String user, String pwd) {
		if (user.equalsIgnoreCase("Comprador")&& pwd.equals("123")){
			return true;
		}return false;
	}
	// fim da função login
	
	
	public static void somarCarrinho(double[] produtos) {
		double soma = 0;
		for(int i=0; i<produtos.length;i++) {
			soma = soma + produtos[i];
		}
		
		System.out.println("O total do carrinho é R$" + soma);
	}
	
	public static void exibirMenu() {
		System.out.println("FIAP STORE! A LOJA DOS FIAPERS!");
		System.out.println("1 - Informar todos os valores do carrinho");
		System.out.println("2 - Exibir total do carrinho");
		System.out.println("3 - Sair");
	}

}
