package controller;

import util.Teclado;

public class questao10 {

	public static void main(String[] args) {
		
		double valor, tarifa;
		int tempo;
		
		tempo = Teclado.lerInt("Informe a quantidade de dias em atraso");
		valor = Teclado.lerDouble("Informe o valor da prestação em atraso");
		tarifa = 0.2; // Taxa de Juros
		
		
		System.out.println("O valor atualizado da sua prestação é: R$"+(valor+(valor*(tarifa/100)*tempo)));
	}

}
