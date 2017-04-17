package br.com.estudojava8.estudoJava8.exercicio;

import javax.swing.JOptionPane;

public class ExercicioLambda {
		
	static int num;
	
	public static void main(String[] args) {
		
		do{
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero"));
			if(num >10){
				for(int i =0;i <num; i++ ){
					int y = i;
					Runnable run = () -> System.out.println(y*num+90);
					run.run();
				}
			}
		}while(num != 0);
	
	}
}
