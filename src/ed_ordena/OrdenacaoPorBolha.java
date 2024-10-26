package ed_ordena;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class OrdenacaoPorBolha {

	

	public static void bolha(int numeros[]) {

		final int n = numeros.length; // tamanho do vetor
		int aux; // variavel auxiliar de troca

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (numeros[j] > numeros[j + 1]) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}
	}
}