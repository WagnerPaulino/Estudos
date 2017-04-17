package br.com.estudojava8.estudoJava8.threads;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando) {

		if (!estaExecutando) {
			tique = true;
			notify();/*Notifica a outra thread*/
			return;
		}
		System.out.print("Tique ");

		tique = true;

		notify();
		try {
			while (tique) {
				wait()/*Diz para esta thread esperar até que ela seja notificada novamente*/;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void taque(boolean estaExecutando) {

		if (!estaExecutando) {
			tique = false;
			notify();
			return;
		}
		System.out.println("Taque");

		tique = false;

		notify();
		try {
			while (!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
