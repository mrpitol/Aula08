
public class Funcoes {
	// Fun��o para teste de login
	public static boolean login  (String user, String pwd) {
		if (user.equalsIgnoreCase("Comprador")&& pwd.equals("123")){
			return true;
		}return false;
	}
	// fim da fun��o login
	
	//Fun��o Somar Carrinho
	public static void somarCarrinho(double[] produtos) {
		double soma = 0;
		for(int i=0; i<produtos.length;i++) {
			soma = soma + produtos[i];
		}
		
		System.out.println("O total do carrinho � R$" + soma);
	}
	// fim da Fun��o Somar Carrinho
	
	//Fun��o exibir Menu
	public static void exibirMenu() {
		System.out.println("FIAP STORE! A LOJA DOS FIAPERS!");
		System.out.println("1 - Informar todos os valores do carrinho");
		System.out.println("2 - Exibir total do carrinho");
		System.out.println("3 - Sair");
	}
	// Fim da Fun��o exibir Menu

	
	}

	
	
