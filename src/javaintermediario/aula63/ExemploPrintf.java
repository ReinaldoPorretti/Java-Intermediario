package javaintermediario.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("Hello %s", " Olá Mundo!");
		System.out.println();
		System.out.printf("Hello %S", " Olá Mundo!");
		System.out.println();
		
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		
		System.out.printf("%n");
		
		int valor =  123456789;
		System.out.printf("%d", valor);
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		
		System.out.println();
		
		String olaMundo = "Olá, mundo!";
		System.out.printf("%s", olaMundo);
		
		System.out.println();
		
		System.out.printf("%d" , valor);
		
		System.out.println();
		
		System.out.println("");
		
		System.out.printf("%015d" , valor);
		
		System.out.println();
		
		System.out.printf("%d", valor);
		
		
		
	}

}
