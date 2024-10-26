package arquivo_exclusão;
import java.io.*;

class ArqExclui{
	static StringBuffer memoria = new StringBuffer(); // manipulação de arquivos
	public static void main(String[] args){
		try{
			BufferedReader entrada;
			entrada = new BufferedReader (new InputStreamReader (System.in));
			BufferedReader arqentrada;
			arqentrada = new BufferedReader (new FileReader ("C:\\Users\\laura\\OneDrive\\Área de Trabalho\\doc.txt"));
			System.out.println ("Digite o nome");
			String Nome = entrada.readLine();
			String linha = "";
			while ( (linha = arqentrada.readLine()) != null ) {
				memoria.append (linha + "\n");
			}
			int inicio = -1;
			inicio = memoria.indexOf (Nome);
			if (inicio != -1){
				int fim = memoria.indexOf ("\n", inicio);
				linha = ler (inicio, fim);
				System.out.println ("Deseja excluir? Digite S ou N");
				System.out.println (linha);
				String resp = entrada.readLine ();
				if (resp.equalsIgnoreCase ("S")){
					memoria.delete (inicio, fim + 1);
					System.out.println ("Registro excluido.");
				}
				gravar ();
			}else{
				System.out.println ("Item nao encontrado");
			}
			arqentrada.close ();
		} catch (FileNotFoundException erro){
			System.out.println ("Arquivo nao encontrado!");
		} catch (Exception erro){
			System.out.println ("Erro de Leitura !");
        }
	}
	public static String ler (int primeiro, int ultimo){
		String dados = "";
		char [] destino = new char [ultimo - primeiro];
		memoria.getChars (primeiro, ultimo, destino, 0);
		for (int i = 0; i < destino.length; i++){
			dados += destino [i];
		}
		return dados;
	}
	public static void gravar (){
		try{
			BufferedWriter saida;
			saida = new BufferedWriter (new FileWriter ("C:\\Users\\laura\\OneDrive\\Área de Trabalho\\doc.txt"));
			saida.write (memoria.toString ());
			saida.flush ();
			saida.close ();
		} catch (Exception erro){
			System.out.println ("Erro de gravacao!");
        }
	}
}
