package controller;

import util.Teclado;

public class questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomeCompleto, genSexual; // Variable for names
		
		nomeCompleto = Teclado.lerTexto("Insira seu nome completo");
		genSexual = Teclado.lerTexto("Informe seu g�nero sexual");
		
		System.out.println("Ol� "+nomeCompleto+", voc� � do sexo "+genSexual+".");
		
		
	}

}
