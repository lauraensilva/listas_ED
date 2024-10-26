package arquivo_cadastro;
import java.io.*;
import arquivo_busca.Social_reg;

public class Social_cadastro {
	 public static void main(String[] args) {
	        try {
	            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	            BufferedWriter saida = new BufferedWriter(new FileWriter("c:/RedeSocial.txt", true));

	            System.out.println("Digite o nome da rede social");
	            String redeSocial = entrada.readLine();
	            System.out.println("Digite o nome do perfil");
	            String nome = entrada.readLine();
	            System.out.println("Digite a quantidade de seguidores");
	            String quantSeguidores = entrada.readLine();
	            System.out.println("Digite o assunto");
	            String assunto = entrada.readLine();

	            Social_reg redeSocialObj = new Social_reg(redeSocial, nome, quantSeguidores, assunto);

	            saida.write(redeSocialObj.mostraRedeSocial() + "\t");
	            saida.write(redeSocialObj.mostraNome() + "\t");
	            saida.write(redeSocialObj.mostraQuantSeguidores() + "\t");
	            saida.write(redeSocialObj.mostraAssunto() + "\n");

	            saida.flush();
	            saida.close();
	        } catch (Exception e) {
	            System.out.println("Erro de Gravação");
	        }
	    }
	}