package controller;

import util.Teclado;

public class DadosPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome; // Vari�vel tipo caracter
		int idade; // Vari�vel tipo n�mero inteiro
		double salario; // Vari�vel tipo n�mero real
		
		nome = Teclado.lerTexto("Insira seu nome completo");
		idade = Teclado.lerInt("Insira sua idade");
		salario = Teclado.lerDouble("Insira o valor do seu �ltimo sal�rio");
		
		System.out.println("Ol� "+nome+" sua idade � "+idade+" anos e seu �ltimo sal�rio foi de: R$"+salario+"." );
		
		
		
	}

}
