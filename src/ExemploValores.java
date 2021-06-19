
public class ExemploValores {
	public static void teste(int a) {
        a = 100;
        System.out.println("NA FUNÇÃO, A VALE " + a);
    }
    public static void zeraVetor(int b[]) {
        for(int i=0;i<b.length;i++) {
            b[i] = 0;
        }
        System.out.println("\n\n\n");
        System.out.println("PRINTANDO O VETOR NA FUNÇÃO");
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
    }
    public static void main(String[] args) {
        int a = 0;
        int b[] = {5,6,7,9,10};
        System.out.println("NA MAIN, A VALE " + a);
        teste(a);
        System.out.println("NA MAIN, A VALE " + a);
        System.out.println("\n\n\n");
        System.out.println("PRINTANDO O VETOR NA MAIN");
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
        zeraVetor(b);
        System.out.println("\n\n\n");
        System.out.println("PRINTANDO O VETOR NA MAIN");
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
    }

}
