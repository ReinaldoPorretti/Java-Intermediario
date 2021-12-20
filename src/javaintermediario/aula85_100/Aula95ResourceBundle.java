package javaintermediario.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

	public static void main(String[] args) {

		System.out.println("Locale atual " + Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("meu_texto");
		
		System.out.println("Olá: " + rb.getString("hello"));
		System.out.println("Mundo: " + rb.getString("world"));
		
		Locale.setDefault(new Locale("pt_BR", "pt_BR"));
		rb = ResourceBundle.getBundle("meu_texto");

		System.out.println();

		System.out.println("Olá pt_BR: " + rb.getString("hello"));
		System.out.println("Mundo: pt_BR " + rb.getString("world"));
	
	}

}
