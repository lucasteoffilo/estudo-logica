package controller;

import util.Teclado;

public class Exercicio03 {

	public static void main(String[] args) {

		/* 
		 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do
distribuidor seja de 28% e os impostos de 45%, escreva um algoritmo que leia o custo de fábrica
de um carro e escreva o custo ao consumidor.
		 */
		
		double pDistribuidor = 0.28, pImpostos = 0.45, cFabrica, cC;
		cFabrica = Teclado.lerDouble("Informe o custo de fábrica do carro: ");
		cC = (pDistribuidor + pImpostos) * (cFabrica) + cFabrica;
		
		System.out.println("Custo ao consumidor: R$" + cC);
	}

}
