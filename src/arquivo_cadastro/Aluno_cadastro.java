package arquivo_cadastro;
import java.io.*;
import arquivo_busca.Aluno_reg;

public class Aluno_cadastro {
	public static void main(String[] args) {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida = new BufferedWriter(new FileWriter("C:\\\\Users\\\\laura\\\\OneDrive\\\\Documentos\\\\4 PERIODO\\\\ESTRUTURA DE DADOS\\\\Manipulação de Arquivos\\\\Aluno.txt", true));

            System.out.println("Digite o nome do aluno");
            String nome = entrada.readLine();
            System.out.println("Digite o curso");
            String curso = entrada.readLine();
            System.out.println("Digite a turma");
            String turma = entrada.readLine();
            System.out.println("Digite o período (MT - matutino, VP - vespertino, NT - noturno)");
            String periodo = entrada.readLine();

            Aluno_reg aluno = new Aluno_reg(nome, curso, turma, periodo);

            saida.write(aluno.mostraNome() + "\t");
            saida.write(aluno.mostraCurso() + "\t");
            saida.write(aluno.mostraTurma() + "\t");
            saida.write(aluno.mostraPeriodo() + "\n");

            saida.flush();
            saida.close();
        } catch (Exception e) {
            System.out.println("Erro de Gravação");
        }
    }
}