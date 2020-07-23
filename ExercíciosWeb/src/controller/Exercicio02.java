package controller;

import util.Teclado;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Desenvolva um programa em java que leia o nome e a idade de 3 pessoas e
		 * mostre o nome da pessoa mais velha e o nome da pessoa mais nova.
		 */
		int i1, i2, i3, v, n;
		String n1, n2, n3, velha, nova;

		System.out.println("A seguir insira o nome e a idade de 3 pessoas.");
		n1 = Teclado.lerTexto("Nome: ");
		i1 = Teclado.lerInt("Idade: ");
		n2 = Teclado.lerTexto("Nome: ");
		i2 = Teclado.lerInt("Idade: ");
		n3 = Teclado.lerTexto("Nome: ");
		i3 = Teclado.lerInt("Idade: ");

		v = i1;
		n = i1;

		if (i2 > v) {
			v = i2;
		}
		if (i3 > v) {
			v = i3;
		}
		if (i2 < n) {
			n = i2;
		}
		if (i3 < n) {
			n = i3;
		}

		velha = n3;
		nova = n3;

		if (v == i1) {
			velha = n1;
		} else {
			if (v == i2) {
				velha = n2;
			}
			if (n == i1) {
				nova = n1;
			} else {
				if (n == i2) {
					nova = n2;
				}

			}
		}

		System.out.println(nova + " é o(a) mais novo(a) e tem " + n + " anos.");
		System.out.println(velha + " é o(a) mais velho(a) e tem " + v + " anos.");
	}
}
