package pilhas;

public class PilhaInvertida {
	 int tamanho;
	    int topo;
	    Object vetor[];
	    
	    PilhaInvertida(int tam) {
	        topo = tamanho;
	        tamanho = tam;
	        vetor = new Object[tam];
	    }
	    
	    public boolean vazia() {
	        return (topo == -1);
	    }
	    
	    public boolean cheia() {
	        return (topo >= tamanho - 1);
	    }
	    
	    public void empilhar(Object elem) {
	        if (!cheia()) {
	            topo++;
	            vetor[topo] = elem;        
	        } else {
	            System.out.println("Pilha Cheia");
	        }
	    }
	    
	    public Object desempilhar() {
	        if (vazia()) {
	            System.out.println("Pilha Vazia");
	            return null;
	        } else {
	            Object valorDesempilhado = vetor[topo];
	            topo--;
	            return valorDesempilhado;
	        }
	    }
	    
	    public void exibePilha() {
	        for (int i = 0; i <= topo; i++) {
	            System.out.println("Elemento " + vetor[i] + " posicao " + i);
	        }
	    }
	}