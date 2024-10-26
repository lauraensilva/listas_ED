package pilhas;

import java.io.*;

class usaPilhaInvertida {

	public static void escolhas() {

		System.out.println("Escolha a Opcao:");

		System.out.print("\n1. Inserir");

		System.out.print(" \n2. Saída-Descarregar-Pilha");

		System.out.print(" \n3. Exibir a Pilha");

		System.out.print(" \n4. Sair");

		System.out.print("\n. Opcao :\t ");

	}

	public static void main(String args[]) {

		Pilha objPilha = new Pilha(4);

		BufferedReader entrada;

		entrada = new BufferedReader(

				new InputStreamReader(System.in));

		Object valor;

		try {

			escolhas();

			char opcao = entrada.readLine().charAt(0);

			while (opcao != '4') {

				switch (opcao) {

				case '1':

					if (objPilha.cheia() == false)

					{
						System.out.println("Digite valor: ");

						valor = entrada.readLine();

						objPilha.empilhar(valor);

					}

					else

					{
						System.out.println("Pilha Cheia ! ");

					}

					break;

				case '2':

					if (objPilha.vazia() == false)

					{
						System.out.println(objPilha.desempilhar());

					}

					else

					{
						System.out.println("Pilha Vazia ! ");

					}

					break;

				case '3':

					objPilha.exibePilha();

					break;

				default:
					System.out.println("Opcao Invalida !");

				}

				System.out.println();

				escolhas();

				opcao = entrada.readLine().charAt(0);

			}

		} catch (Exception erro) {

			System.out.println("Erro de Entrada de Dados. Provável Pilha Cheia");

		}

	}

}