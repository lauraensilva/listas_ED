package filas;

import java.io.*;

class usaFila {

	public static void escolhas() {

		System.out.println("Escolha a Opcao:");

		System.out.print("\n1. Inserir");

		System.out.print(" \n2. Saída");

		System.out.print(" \n3. Exibir a Fila");

		System.out.print(" \n4. Sair");

		System.out.print("\n. Opcao :\t ");

	}

	public static void main(String args[]) {

		Fila objFila = new Fila(4);

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

					if (!objFila.cheia())

					{
						System.out.println("Digite Valor: ");

						valor = entrada.readLine();

						objFila.enfileirar(valor);

					}

					else

					{
						System.out.println("Fila Cheia ! ");

					}

					break;

				case '2':

					if (objFila.vazia() == false)

					{
						System.out.println(objFila.desenfileirar());

					}

					else

					{
						System.out.println("Fila Vazia ! ");

					}

					break;

				case '3':

					objFila.exibeFila();

					break;

				default:
					System.out.println("Opcao Invalida !");

				}

				System.out.println();

				escolhas();

				opcao = entrada.readLine().charAt(0);

			}

		} catch (Exception erro) {

			System.out.println("Erro de Entrada de Dados");

		}

	}
}