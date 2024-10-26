package ed_ordena;

public class OrdenacaoPorInsercao {
	
	public static void insertion(int numeros[]) {
		
		final int n = numeros.length; // tamanho do vetor
		int aux; // variavel auxiliar de troca
	
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j >= 0; j--) {
				if (numeros[j] > numeros[j + 1]) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}
	}
}
