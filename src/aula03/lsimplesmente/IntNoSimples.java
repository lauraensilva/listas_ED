package aula03.lsimplesmente;

public class IntNoSimples {
    int valor;
    IntNoSimples prox;/*variável com mesmo nome da classe, 
                      onde prox faz referência ao próximo elemento da lista. */
    IntNoSimples(int valorNo){
        valor = valorNo;
        prox = null;
    }
}