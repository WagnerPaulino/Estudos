package stream;

import java.util.Arrays;
import java.util.List;

public class Stream {
	public static void main(String[] args) {

		// Antes do Java 8
		List<String> estados = Arrays.asList("Santa Catarina", 
				"Parana", 
				"São Paulo", 
				"Rio de Janeiro",
				"Brasilia",
				"Ceará");
		//for(String s : estados){
		//	System.out.println(s);
		//}
		//estados.forEach(x -> System.out.println(x));//com lambda
		estados.forEach(System.out::println);/*referencia de metedo... o proprio
		compilador invoca o metodo println e passa os parâmetros correnspondentes 
		para ele*/ 
	}
}
