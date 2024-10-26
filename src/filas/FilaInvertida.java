package filas;

public class FilaInvertida {
	int tamanho;
    int inicio;
    int fim;
    int total;
    Object vetor[];
    
    FilaInvertida(int tam) {
        inicio = 0;
        fim = tam - 1;
        total = 0;
        tamanho = tam;
        vetor = new Object[tam];
    }
    
    public boolean vazia() {
        return total == 0;
    }
    
    public boolean cheia() {
        return total >= tamanho;
    }
    
    public void enfileirar(Object elem) {
        if (!cheia()) {
            if (inicio == 0) { 
                inicio = tamanho - 1;
            } else {
                inicio--;
            }
            vetor[inicio] = elem; 
            total++;
        } else {
            System.out.println("Fila Cheia");
        }
    }
    
    public Object desenfileirar() {
        if (vazia()) {
            System.out.println("Fila Vazia");
            return null;
        } else {
            Object excluido = vetor[fim];
            fim--;
            if (fim < 0) {
                fim = tamanho - 1; 
            }
            total--;
            return excluido;
        }
    }
    
    public void exibeFila() {
        System.out.println("Elementos na Fila Invertida:");
        for (int i = 0; i < total; i++) {
            int pos = (inicio + i) % tamanho;
            System.out.println("Posicao " + pos + " Valor " + vetor[pos]);
        }
    }
}