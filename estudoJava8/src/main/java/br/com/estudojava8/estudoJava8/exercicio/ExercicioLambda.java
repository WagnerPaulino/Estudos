package br.com.estudojava8.estudoJava8.exercicio;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercicioLambda {
	
	public static void main(String[] args) {
		Stream<Integer> lista = Stream.of(1,5,4,9,1,5,6,7);
        lista.filter(n -> (n%2 == 0)).map(map -> Integer.valueOf(map)).collect(Collectors.toList()).forEach(System.out::println);
        
		
	}
}
