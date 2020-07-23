package controller;

import util.Teclado;

public class questao08 {

	public static void main(String[] args) {

		double precoCust, porcent, perc;
		
		precoCust = Teclado.lerDouble("Informe o custo do produto");
		perc = Teclado.lerDouble("Informe um valor percentual");
		porcent = (precoCust*perc) /100;
		
		System.out.println("O valor de venda do produto é de R$"+(porcent+precoCust));
	}

}
