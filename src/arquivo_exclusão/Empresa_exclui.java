package arquivo_exclusão;
import java.io.*;
import arquivo_busca.Empresa_reg;

public class Empresa_exclui {
	static StringBuffer memoria = new StringBuffer();

    public static void main(String[] args) {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada = new BufferedReader(new FileReader("C:\\\\Users\\\\laura\\\\OneDrive\\\\Documentos\\\\4 PERIODO\\\\ESTRUTURA DE DADOS\\\\Manipulação de Arquivos\\\\Empresa.txt"));

            System.out.println("Digite o nome da companhia aérea");
            String companhiaAerea = entrada.readLine();
            String linha = "";

            while ((linha = arqentrada.readLine()) != null) {
                memoria.append(linha + "\n");
            }

            int inicio = -1;
            inicio = memoria.indexOf(companhiaAerea);

            if (inicio != -1) {
                int fim = memoria.indexOf("\n", inicio);
                linha = ler(inicio, fim);
                System.out.println("Deseja excluir a companhia aérea? (S/N)");
                System.out.println(linha);
                String resposta = entrada.readLine();

                if (resposta.equalsIgnoreCase("S")) {
                    memoria.delete(inicio, fim + 1);
                    System.out.println("Companhia aérea excluída");
                }

                gravar();
            } else {
                System.out.println("Companhia aérea não encontrada");
            }

            arqentrada.close();
        } catch (Exception e) {
            System.out.println("Erro na exclusão");
        }
    }

    public static String ler(int inicio, int fim) {
        return memoria.substring(inicio, fim);
    }

    public static void gravar() {
        try {
            BufferedWriter saida = new BufferedWriter(new FileWriter("c:/CompanhiaAerea.txC:\\\\Users\\\\laura\\\\OneDrive\\\\Documentos\\\\4 PERIODO\\\\ESTRUTURA DE DADOS\\\\Manipulação de Arquivos\\\\Empresa.txtt"));
            saida.write(memoria.toString());
            saida.flush();
            saida.close();
        } catch (Exception e) {
            System.out.println("Erro ao gravar");
        }
    }
}