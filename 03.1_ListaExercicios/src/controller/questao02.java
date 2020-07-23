package controller;

import util.Teclado;

public class questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4, multip, adic;
		
		num1 = Teclado.lerInt("Insira um número inteiro");
		num2 = Teclado.lerInt("Insira mais um número inteiro");
		num3 = Teclado.lerInt("Insira mais um número inteiro");
		num4 = Teclado.lerInt("Insira mais um número inteiro");
		
		multip = num1 * num2 * num3 * num4;
		adic = num1 + num2 + num3 + num4;
		
		System.out.println("A soma dos números informados é: "+adic);
		System.out.println("A multiplicação dos números informados é: "+multip);
	}

}
