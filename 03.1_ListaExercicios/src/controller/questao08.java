package controller;

import util.Teclado;

public class questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double dist, consuMed, gasto;
	dist = Teclado.lerDouble("Insira a dist�ncia a ser percorrida");
	consuMed = 12.7; // Refer�ncia para o HB20 Gasolina na estrada
	gasto = dist/consuMed;
	
	System.out.println("O consumo de combust�vel aproximado para esta viagem � de: "+gasto+" Litros de Gasolina.");
	
	
	}

}
