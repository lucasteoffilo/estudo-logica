package controller;
import util.teclado;
public class BubbleSort {
	public static void main(String[] args) {
		int[] vet = {8,9,3,5,1};
		int aux =0;
		int i =0;
		
		System.out.println("vetor desordenado: ");
		for(i=0;i<5;i++) {
			System.out.println(""+vet[i]);
			
		}
		System.out.println("");
		
	
for(i=0;i<5;i++) {
	for(int j=0; j<4;j++) {
		if(vet[j] >vet[j+1]) {
			aux = vet[j];
			vet[j]=vet[j+1];
			vet[j+1]=aux;
		}
	}
}
system.out.println("vetor organizado:");
for(i=0;i<5;i++) {
	System.out.println(""+vet[i]);
}
	}
}
