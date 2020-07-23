package controller;

import util.Teclado;

public class questao10 {

	public static void main(String[] args) {

		int eleitores, votB, nul, val;
		
		eleitores = Teclado.lerInt("Informe o número de eleitores do município");
		votB = Teclado.lerInt("Informe o número de votos brancos");
		nul = Teclado.lerInt("Informe o número de votos nulos");
		val = Teclado.lerInt("Informe o número de votos válidos");
		
		System.out.println("Percentual de votos brancos: "+ (votB*100)/eleitores);
		System.out.println("Percentual de votos nulos: "+ (nul*100)/eleitores);
		System.out.println("Percentual de votos validos: "+ (val*100)/eleitores);
	}

}
