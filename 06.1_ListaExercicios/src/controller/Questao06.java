package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {

		System.out.println("Cod  -  Planeta  - Gravidade R.");
		System.out.println(" 1   -  Mercúrio -   0,37");
		System.out.println(" 2   -  Vênus   -    0,88");
		System.out.println(" 3   -  Marte   -    0,38");
		System.out.println(" 4   -  Júpier  -    2,64");
		System.out.println(" 5   -  Saturno -    1,15");
		System.out.println(" 6   -  Urano   -    1,17");
		
		// "\n para pular linha dentro do sysout"

		double pesoT, pesoP;
		int cod;

		cod = Teclado.lerInt("Informe o 'Cod' do planeta desejado.");
		pesoT = Teclado.lerDouble("Informe o seu peso em KG");

		switch (cod) {

		case 1:
			pesoP = (pesoT / 10) * 0.37;
			System.out.println("Seu peso em mercúrio é: " + pesoP);
			break;
		case 2:
			pesoP = (pesoT / 10) * 0.88;
			System.out.println("Seu peso em vênus é: " + pesoP);
			break;
		case 3:
			pesoP = (pesoT / 10) * 0.38;
			System.out.println("Seu peso em marte é: " + pesoP);
			break;
		case 4:
			pesoP = (pesoT / 10) * 2.64;
			System.out.println("Seu peso em júpiter é: " + pesoP);
			break;
		case 5:
			pesoP = (pesoT / 10) * 1.15;
			System.out.println("Seu peso em saturno é: " + pesoP);
			break;
		case 6:
			pesoP = (pesoT / 10) * 1.17;
			System.out.println("Seu peso em urano é: " + pesoP);
			break;
		default:
			System.out.println("'Cod' informado inválido.");

		}

	}

}
