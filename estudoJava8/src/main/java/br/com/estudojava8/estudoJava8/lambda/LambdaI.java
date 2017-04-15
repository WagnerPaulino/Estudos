package br.com.estudojava8.estudoJava8.lambda;

public class LambdaI {
	public static void main(String[] args) {
		System.out.println("=== Inicio do teste ===");
		// Implementação da classe anonima Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Estudando a expressão lambda.");
			}
		};
		Runnable r2 = ()// Lista de argumentos
		-> /**Seta: Forma de indicar que estamos trabalhando com uma expressão
			 *lambda*/ 
		System.out.println("Estudando a expressão lambda 2.");// Corpo

		r1.run();
		r2.run();
	}
}
