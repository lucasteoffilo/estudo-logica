package controller;

import util.Teclado;

public class Questao12B {

	public static void main(String[] args) {

		double i = 1, n, n2, n3, maior, menor, med;
		
		while (i >= 1) {
			n = Teclado.lerDouble("Informe um n�mero qualquer maior ou igual 0.");
			n2 = Teclado.lerDouble("Informe outro n�mero qualquer maior ou igual 0.");
			n3 = Teclado.lerDouble("Informe mais um n�mero qualquer maior ou igual 0.");

			if (n < 0) {
				n = 0;
			}
			if (n2 < 0) {
				n2 = 0;				
			}
			if (n3 < 0) {
				n3 = 0;
			}
			maior = n;
			menor = n;
			
			if (n2 > maior) {
				maior = n2;
			}
			if (n3 > maior) {
				maior = n3;
			}
			if (n2 < maior && n2 > 0) {
				menor = n2;
			}
			if (n3 < maior && n3 > 0) {
				menor = n3;
			}
			med = (n + n2 + n3) / 3;

			System.out.println("Maior n�mero: " + maior + " Menor n�mero: " + menor);
			System.out.println("M�dia: " + med);
						
			}
		}
	}

