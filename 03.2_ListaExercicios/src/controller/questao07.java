package controller;

import util.Teclado;

public class questao07 {

	public static void main(String[] args) {
				
		double valorComp;
		int prest;
		
		valorComp = Teclado.lerDouble("Infome o valor total da compra");
		prest = Teclado.lerInt("Informe o número de parcelas desejado");
		
		System.out.println("O valor das parcelas é de "+ prest + "x de R$"+ (valorComp/prest));
	}

}
