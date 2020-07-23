package controller;

import util.Teclado;

public class DadosPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome; // Variável tipo caracter
		int idade; // Variável tipo número inteiro
		double salario; // Variável tipo número real
		
		nome = Teclado.lerTexto("Insira seu nome completo");
		idade = Teclado.lerInt("Insira sua idade");
		salario = Teclado.lerDouble("Insira o valor do seu último salário");
		
		System.out.println("Olá "+nome+" sua idade é "+idade+" anos e seu último salário foi de: R$"+salario+"." );
		
		
		
	}

}
