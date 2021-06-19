
public class ExemploValores {
	public static void teste (int a) {
		a= 100;
		System.out.println("NA FUNÇÃO, A VALE "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		System.out.println("NA main, A VALE "+a);
		teste(a);
		System.out.println("NA main, A VALE "+a);
		
		
	}

}
