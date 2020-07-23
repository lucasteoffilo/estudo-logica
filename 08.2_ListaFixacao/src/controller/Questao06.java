package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte ao usuário time de futebol que ele
		 * torce. Se o time informado for um dos 4 principais cariocas (Flamengo,
		 * Fluminense, Botafogo e Vasco), informar as cores oficiais do time apontado.
		 * Se o time não for um dos 4 principais cariocas, exibir a informação “Seu time
		 * não é um dos 4 principais times cariocas”.
		 */

		String a = Teclado.lerTexto("Informe o seu time de futebol.");

		switch (a) {

		case "Flamengo":
			System.out.println("Vermelho e Preto");
			break;
		case "Fluminense":
			System.out.println("Verde e Branco");
			break;
		case "Botafogo":
			System.out.println("Preto e Branco");
			break;
		case "Vasco":
			System.out.println("Branco e Preto");
			break;
		default:
			System.out.println("O seu time não é um dos quatro cariocas.");
			break;
		}

	}

}
