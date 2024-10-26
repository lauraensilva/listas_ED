package arquivo_busca;
import java.io.*;

class ArqBusca{
   static StringBuffer memoria = new StringBuffer();
   // StringBuffer é uma classe de mesmo nível de String que fornece grande
   //parte da funcionalidade de strings. 
   //StringBuffer representa sequências de caracteres crescentes e graváveis.

   public static void main(String[] args){
      try{
         BufferedReader entrada;
         entrada = new BufferedReader (new InputStreamReader (System.in));
         BufferedReader arqentrada;
         arqentrada = new BufferedReader (new FileReader ("C:\\Users\\laura\\OneDrive\\Área de Trabalho\\doc.txt"));

         System.out.println ("Digite o nome");
         String nome = entrada.readLine();
         String endereco = "";
         String telefone = "";
         String linha = "";

         while ((linha = arqentrada.readLine()) != null ) {
            memoria.append (linha + "\n"); 
            // append é o método aloca novas strings concatenadas para o mesmo objeto
         }

         int inicio = -1;
         inicio = memoria.indexOf (nome);
         //indexOf: Método que retorna a posição da primeira ocorrência do(s) 
         //caractere(s) especificado(s) em uma string.

         if (inicio != -1){
            int ultimo = memoria.indexOf ("\t", inicio);
            nome = ler (inicio, ultimo);
            int primeiro = ultimo + 1;
            
            ultimo = memoria.indexOf ("\t", primeiro);
            endereco = ler (primeiro, ultimo);
            primeiro = ultimo + 1;
            
            int fim = memoria.indexOf ("\n", primeiro);
            telefone = ler (primeiro, fim);

            regAgenda regAg1 = new regAgenda (nome, endereco, telefone);
            System.out.println ("Endereco: " + regAg1.mostraEnd () +
            "Telefone: " + regAg1.mostraTel ());
            System.out.println ("Entre com novo endereco");
            endereco = entrada.readLine ();
            regAg1.alteraEnd (endereco);
            System.out.println ("Entre com novo telefone");
            telefone = entrada.readLine ();
            regAg1.alteraTel (telefone);
            memoria.replace (inicio, fim, regAg1.mostraNome () + "\t" +
            regAg1.mostraEnd () + "\t" + regAg1.mostraTel ());
            gravar ();
            arqentrada.close ();
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
         erro.printStackTrace();
      }
   }
}
