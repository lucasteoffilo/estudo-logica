package controller;

import util.Teclado;

public class questao02 {

	public static void main(String[] args) {

		int hora, minuto, tempo;
		
		hora = Teclado.lerInt("Informe a hora atual");
		minuto = Teclado.lerInt("Informe os minutos atuais");
		tempo = (hora*60)+minuto;
		
		System.out.println("Desde as 00:00h de hoje, se passaram "+tempo+" minutos.");
	}

}
