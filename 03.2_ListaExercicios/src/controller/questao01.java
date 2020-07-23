package controller;

import util.Teclado;

public class questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valConta, resp;
		
		valConta = Teclado.lerDouble("Insira o valor da conta");
		resp = (valConta*10)/100 + valConta;
		
		System.out.println("O valor total da sua conta com 10% de acréscimo é: R$"+resp);
		
	}

}
