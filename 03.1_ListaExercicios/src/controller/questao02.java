package controller;

import util.Teclado;

public class questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4, multip, adic;
		
		num1 = Teclado.lerInt("Insira um n�mero inteiro");
		num2 = Teclado.lerInt("Insira mais um n�mero inteiro");
		num3 = Teclado.lerInt("Insira mais um n�mero inteiro");
		num4 = Teclado.lerInt("Insira mais um n�mero inteiro");
		
		multip = num1 * num2 * num3 * num4;
		adic = num1 + num2 + num3 + num4;
		
		System.out.println("A soma dos n�meros informados �: "+adic);
		System.out.println("A multiplica��o dos n�meros informados �: "+multip);
	}

}
