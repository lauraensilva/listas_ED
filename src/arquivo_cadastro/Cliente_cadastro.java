package arquivo_cadastro;
import java.io.*;
import arquivo_busca.Cliente_reg;

public class Cliente_cadastro {
	 public static void main(String[] args) {
	        try {
	            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	            BufferedWriter saida = new BufferedWriter(new FileWriter("C:\\\\Users\\\\laura\\\\OneDrive\\\\Documentos\\\\4 PERIODO\\\\ESTRUTURA DE DADOS\\\\Manipulação de Arquivos\\\\Cliente.txt", true));

	            System.out.println("Digite o nome do cliente");
	            String cliente = entrada.readLine();
	            System.out.println("Digite o dia da semana");
	            String diaSemana = entrada.readLine();
	            System.out.println("Digite o horário");
	            String horario = entrada.readLine();
	            System.out.println("Digite o tipo de serviço (cabelo, barba, unha, etc)");
	            String tipoServico = entrada.readLine();
	            System.out.println("Digite o valor do serviço");
	            String valor = entrada.readLine();

	            Cliente_reg novoCliente = new Cliente_reg(cliente, diaSemana, horario, tipoServico, valor);

	            saida.write(novoCliente.mostraCliente() + "\t");
	            saida.write(novoCliente.mostraDiaSemana() + "\t");
	            saida.write(novoCliente.mostraHorario() + "\t");
	            saida.write(novoCliente.mostraTipoServico() + "\t");
	            saida.write(novoCliente.mostraValor() + "\n");

	            saida.flush();
	            saida.close();
	        } catch (Exception e) {
	            System.out.println("Erro de Gravação");
	        }
	    }
	}