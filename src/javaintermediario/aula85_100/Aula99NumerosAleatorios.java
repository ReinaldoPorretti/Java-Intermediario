package javaintermediario.aula85_100;

import java.util.Random;

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random()* 10));
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt(61));
		
		
		
	}

}
