package controller;

import util.Teclado;

public class Vetor {
	public static void main(String[] args) {
		String nome[] = new String[10];
		for (int a = 0; a < 10; a++) {
			nome[a] = Teclado.lerTexto("Informe o nome de uma pessoa:");
		}
		System.out.println("RELAÇÃO DOS NOMES CADASTRADOS");
		for (int a = 0; a < 10; a++) {
			System.out.println(nome[a]);
		}
	}
}