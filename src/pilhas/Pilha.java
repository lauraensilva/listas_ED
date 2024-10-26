package pilhas;

class Pilha {

	int tamanho;

	int topo;

	Object vetor[];

	Pilha(int tam) {

		topo = -1;

		tamanho = tam;

		vetor = new Object[tam];

	}

	public boolean vazia()

	{
		if (topo == -1)

			return true;

		else

			return false;

	}

	public boolean cheia()

	{
		if (topo >= tamanho)

			return true;

		else

			return false;

	}

	public void empilhar(Object elem)

	{
		if (!cheia())

		{
			topo++;

			vetor[topo] = elem;

		}

		else

		{
			System.out.println("Pilha Cheia");

		}

	}

	public Object desempilhar()

	{
		Object valorDesempilhado;

		if (vazia() == true)

		{
			System.out.print("Pilha Vazia");

			valorDesempilhado = null;

			return valorDesempilhado;

		}

		else

		{
			valorDesempilhado = vetor[topo];

			topo--;

			return valorDesempilhado;

		}

	}

	public void exibePilha()

	{
		for (int i = topo; i >= 0; i--)

			System.out.println("Elemento " + vetor[i] + " posicao " + i);

	}

}