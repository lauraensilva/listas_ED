package arquivo_cadastro;

import java.io.*;
import arquivo_busca.Produto_reg;

class Produto_cadastro {

	public static void main(String[] args) {
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter saida = new BufferedWriter(new FileWriter("C:\\\\Users\\\\laura\\\\OneDrive\\\\Documentos\\\\4 PERIODO\\\\ESTRUTURA DE DADOS\\\\Manipulação de Arquivos\\\\Produto.txt", true));

			System.out.println("Digite o nome do produto");
			String nome = entrada.readLine();
			System.out.println("Digite a marca");
			String marca = entrada.readLine();
			System.out.println("Digite a unidade de medida");
			String unidade = entrada.readLine();
			System.out.println("Digite o valor");
			String valor = entrada.readLine();
			System.out.println("Digite a quantidade");
			String quantidade = entrada.readLine();

			Produto_reg produto = new Produto_reg(nome, marca, unidade, valor, quantidade);

			saida.write(produto.mostraNome() + "\t");
			saida.write(produto.mostraMarca() + "\t");
			saida.write(produto.mostraUnidade() + "\t");
			saida.write(produto.mostraValor() + "\t");
			saida.write(produto.mostraQuantidade() + "\n");

			saida.flush();
			saida.close();
		} catch (Exception e) {
			System.out.println("Erro de Gravação");
		}
	}
}