package controller;

public class Questao08 {

	/*
	 * 1) Desenvolver um programa que apresente todos os valores num�ricos inteiros
	 * �mpares situados na faixa de 0 a 20. Para saber se o n�mero � �mpar, ser�
	 * necess�rio verificar essa condi��o com o comando if. Sendo �mpar, mostre-o;
	 * n�o sendo, passe para o pr�ximo passo.
	 */
	public static void main(String[] args) {

		int i = 0;
		
		while (i <= 20) {
			if (!(i % 2 == 0)) {
				System.out.println(i + " � um n�mero �mpar.");
				i = i + 1;
			}
			i++;
		}

	}
}
