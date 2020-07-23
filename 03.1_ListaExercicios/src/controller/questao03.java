package controller;

import util.Teclado;

public class questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dolar, reais, convers;
		
		dolar = Teclado.lerDouble("Insira o valor desejado para conversão");
		reais = 1.72;
		convers = dolar * reais;
		
		System.out.println("O valor informado equivale a: R$"+convers);
	}

}
