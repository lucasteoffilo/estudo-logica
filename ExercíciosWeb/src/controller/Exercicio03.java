package controller;

import util.Teclado;

public class Exercicio03 {

	public static void main(String[] args) {

		/* 
		 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do
distribuidor seja de 28% e os impostos de 45%, escreva um algoritmo que leia o custo de f�brica
de um carro e escreva o custo ao consumidor.
		 */
		
		double pDistribuidor = 0.28, pImpostos = 0.45, cFabrica, cC;
		cFabrica = Teclado.lerDouble("Informe o custo de f�brica do carro: ");
		cC = (pDistribuidor + pImpostos) * (cFabrica) + cFabrica;
		
		System.out.println("Custo ao consumidor: R$" + cC);
	}

}
