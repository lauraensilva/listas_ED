package aula03.lsimplesmente;

import java.io.*;
import java.util.*;

public class LSimples {
    public static void escolhas() {
    	System.out.print("Escolha a Opcao:");
        System.out.print(" \n1. Inserir Nó no início");
        System.out.print(" \n2. Inserir Nó no fim");
        System.out.print(" \n3. Inserir Nó em uma posicao");
        System.out.print(" \n4. Localizar Nó");
        System.out.print(" \n5. Ordenar Lista por Bolha");
        System.out.print(" \n6. Exibir lista");
        System.out.print(" \n7. Sair");
        System.out.print("\nOpcao :\t ");
    }

    public static void main(String args[]) {
        ListaSimples Slist = new ListaSimples(); /* Slist = Simples Lista */
        BufferedReader entrada; // ler a entrada de dados
        entrada = new BufferedReader(new InputStreamReader(System.in));
        // InputStreamReader: ponte de fluxos de bytes p/ fluxos de caracteres:
        // ele lê bytes e os
        // decodifica em caracteres usando um especificado charset.

        int valor;
        try {
            escolhas();
            char opcao = entrada.readLine().charAt(0); // Método charAt()
            // retorna o caractere especificado a partir de uma string
            while (opcao != '8') {
                switch (opcao) {
                    case '1' -> {
                        System.out.println("Insere um Nó no inicio da lista");
                        System.out.println("Digite um valor");
                        valor = Integer.parseInt(entrada.readLine());
                        Slist.insereNo_inicio(new IntNoSimples(valor));
                    }
                    case '2' -> {
                        System.out.println("Insire um Valor no final da lista");
                        System.out.println("Digite um valor");
                        valor = Integer.parseInt(entrada.readLine());
                        Slist.insereNo_fim(new IntNoSimples(valor));
                    }
                    case '3' -> {
                        System.out.println("Insire um Valor numa dada posicao");
                        System.out.println("Digite um valor");
                        valor = Integer.parseInt(entrada.readLine());
                        System.out.println("Digite a posicao");
                        int posicao = Integer.parseInt(entrada.readLine());
                        Slist.insereNo_posicao(new IntNoSimples(valor), posicao);
                    }
                    case '4' -> {
                        System.out.println("Localiza um valor");
                        System.out.println("Digite um valor");
                        valor = Integer.parseInt(entrada.readLine());
                        Slist.buscaNo(valor);
                    }
                    case '5' -> {
                        System.out.println("Ordena a lista por Bolha");
                        Slist.ordenaBolha();
                        Slist.exibeLista();
                    }
                    case '6' -> {
                        System.out.println("Exibe a lista");
                        Slist.exibeLista();
                    }
                    
                    default -> System.out.println("Opcao Invalida !");
                }
                System.out.println();
                escolhas();
                opcao = entrada.readLine().charAt(0);
            }
        } catch (IOException | NumberFormatException erro) {
            System.out.println("Erro de Entrada de Dados");
        }
    }
}
