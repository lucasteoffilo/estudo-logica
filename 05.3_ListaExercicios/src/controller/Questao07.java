package controller;

public class Questao07 {

	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 3 até 21.
	 */
	public static void main(String[] args) {
		
		int s = 0;
		for (int i = 3; i <= 21; i++) {
			if (i%2==0) {
				s = s + i;
			}
		}
		System.out.println("A soma dos valores pares entre 3 e 21 = " + s);
		
		
		

	}

}
