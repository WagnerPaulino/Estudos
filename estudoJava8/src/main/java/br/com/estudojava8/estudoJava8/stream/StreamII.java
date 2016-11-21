package br.com.estudojava8.estudoJava8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamII {
	public static void filtro(List<String> lista, Predicate<String> condicao){
		for(String s: lista){
			if(condicao.test(s)){
				System.out.println(s);
			}
		}
	}
	
	
	public static void main(String[] args) {	
		
		List<String> estados = Arrays.asList("Santa Catarina", "Parana", "São Paulo", "Rio de Janeiro", "Brasilia",
				"Ceará");
		
		System.out.println("Estados que iniciam com a letra S");
		filtro(estados, (s)-> s.startsWith("S"));
		
		System.out.println("\nEstados que finalizam com a letra A");
		filtro(estados, (s)-> s.endsWith("a"));
		
		System.out.println("\nImprime toda a lista");
		filtro(estados, (s)-> true);
		
		System.out.println("\nNão Imprime toda a lista");
		filtro(estados, (s)-> false);
		
		System.out.println("\nImprime os nomes com mais de 10 caracteres");
		filtro(estados, (s)-> s.length()>10);
		
	}
}
