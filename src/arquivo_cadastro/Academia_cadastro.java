package arquivo_cadastro;
import java.io.*;
import arquivo_busca.Academia_reg;

public class Academia_cadastro {
	public static void main(String[] args) {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida = new BufferedWriter(new FileWriter("C:\\\\Users\\\\laura\\\\OneDrive\\\\Documentos\\\\4 PERIODO\\\\ESTRUTURA DE DADOS\\\\Manipulação de Arquivos\\\\Academia.txt", true));

            System.out.println("Digite o nome da academia");
            String academia = entrada.readLine();
            System.out.println("Digite a atividade física");
            String atividadeFisica = entrada.readLine();
            System.out.println("Digite o nome do aparelho");
            String aparelho = entrada.readLine();
            System.out.println("Digite o horário");
            String horario = entrada.readLine();
            System.out.println("Digite o dia de treino");
            String diaTreino = entrada.readLine();

            Academia_reg academiaObj = new Academia_reg(academia, atividadeFisica, aparelho, horario, diaTreino);

            saida.write(academiaObj.mostraAcademia() + "\t");
            saida.write(academiaObj.mostraAtividadeFisica() + "\t");
            saida.write(academiaObj.mostraAparelho() + "\t");
            saida.write(academiaObj.mostraHorario() + "\t");
            saida.write(academiaObj.mostraDiaTreino() + "\n");

            saida.flush();
            saida.close();
        } catch (Exception e) {
            System.out.println("Erro de Gravação");
        }
    }
}