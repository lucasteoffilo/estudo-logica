package controller;

import util.Teclado;

public class Questao11C {

	public static void main(String[] args) {

		double num;
		num = Teclado.lerInt("Informe o n�mero de 3 casas. (Entre 100 e 999)");

		if (num - 100 < 100) {
			System.out.println("A centena de " + num + " � 1.");
		} else {
			if (num - 200 < 100) {
				System.out.println("A centena de " + num + " � 2.");
			} else {
				if (num - 300 < 100) {
					System.out.println("A centena de " + num + " � 3.");
				} else {
					if (num - 400 < 100) {
						System.out.println("A centena de " + num + " � 4.");
					} else {
						if (num - 500 < 100) {
							System.out.println("A centena de " + num + " � 5.");
						} else {
							if (num - 600 < 100) {
								System.out.println("A centena de " + num + " � 6.");
							} else {
								if (num - 700 < 100) {
									System.out.println("A centena de " + num + " � 7.");
								} else {
									if (num - 800 < 100) {
										System.out.println("A centena de " + num + " � 8.");
									} else {
										System.out.println("A centena de " + num + " � 9.");
									}
								}
							}
						}
					}

				}
			}

		}
	}
}