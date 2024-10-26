package ed_ordena;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Tela extends WindowAdapter implements ActionListener {
	public Frame janela;
	public Panel painel, painelBotaoEnvia, painelBotaoBolha, painelBotaoInsertion, painelBotaoBLinear, painelBotaoBBinaria;
	public TextField campo_entrada, resultado, resultadoBolha, resultadoInsertion, resultadoBLinear, resultadoBBinaria;
	public Label instruções;
	public Button botaoEnvia, botaoBolha, botaoInsertion, botaoBLinear, botaoBBinaria;
	int num[]= new int [5];
	int index= 0;
	
	
	
	public Tela() {
		janela = new Frame();
		janela.setTitle("Algoritmos de Ordenação");
		janela.setSize(500,470);
		janela.setBackground(new Color(0,0,0));
		janela.setLayout(null);
		janela.addWindowListener(this);
		
		painel = new Panel();
		painel.setBackground(new Color(0,0,0));
		painel.setSize(300, 400);
		painel.setLocation(10,20);
		painel.setLayout(null);
		
		painelBotaoEnvia = new Panel();
		painelBotaoEnvia.setSize(500, 40);
		painelBotaoEnvia.setLocation(120,155);
		painelBotaoEnvia.setBackground(new Color(0, 0, 0));
		painelBotaoEnvia.setLayout(new FlowLayout());
		
		painelBotaoBolha = new Panel();
		painelBotaoBolha.setSize(150, 40);
		painelBotaoBolha.setLocation(310,225);
		painelBotaoBolha.setBackground(new Color(0, 0, 0));
		painelBotaoBolha.setLayout(new FlowLayout());
        
        painelBotaoInsertion = new Panel();
        painelBotaoInsertion.setSize(150, 40);
        painelBotaoInsertion.setLocation(310,255);
        painelBotaoInsertion.setBackground(new Color(0, 0, 0));
        painelBotaoInsertion.setLayout(new FlowLayout());
        
        painelBotaoBLinear = new Panel();
        painelBotaoBLinear.setSize(150, 40);
        painelBotaoBLinear.setLocation(310,285);
        painelBotaoBLinear.setBackground(new Color(0, 0, 0));
        painelBotaoBLinear.setLayout(new FlowLayout());
        
        painelBotaoBBinaria = new Panel();
        painelBotaoBBinaria.setSize(150, 40);
        painelBotaoBBinaria.setLocation(310,315);
        painelBotaoBBinaria.setBackground(new Color(0, 0, 0));
        painelBotaoBBinaria.setLayout(new FlowLayout());
		
        instruções = new Label("Digite os números a serem ordenados:");
        instruções.setForeground(Color.WHITE);
        instruções.setFont(new java.awt.Font("Arial", Font.ITALIC, 15));
        instruções.setBounds(30,5,400,100);
        
        campo_entrada = new TextField(9);
        campo_entrada.setForeground(Color.black);
        campo_entrada.setFont(new java.awt.Font("Arial", Font.ITALIC, 20));
        campo_entrada.setBounds(160,100,40,23);
        
        resultado = new TextField(9);
        resultado.setForeground(Color.black);
        resultado.setFont(new java.awt.Font("Arial", Font.ITALIC, 20));
        resultado.setBounds(60,140,240,23);
        resultado.setEnabled(false);
        
        resultadoBolha = new TextField(9);
        resultadoBolha.setForeground(Color.black);
        resultadoBolha.setFont(new java.awt.Font("Arial", Font.ITALIC, 10));
        resultadoBolha.setBounds(60,210,240,23);
        resultadoBolha.setEnabled(false);
        
        resultadoInsertion = new TextField(9);
        resultadoInsertion.setForeground(Color.black);
        resultadoInsertion.setFont(new java.awt.Font("Arial", Font.ITALIC, 15));
        resultadoInsertion.setBounds(60,240,240,23);
        resultadoInsertion.setEnabled(false);
        
        resultadoBLinear = new TextField(9);
        resultadoBLinear.setForeground(Color.black);
        resultadoBLinear.setFont(new java.awt.Font("Arial", Font.ITALIC, 20));
        resultadoBLinear.setBounds(60,270,240,23);
        resultadoBLinear.setEnabled(false);
        
        resultadoBBinaria = new TextField(9);
        resultadoBBinaria.setForeground(Color.black);
        resultadoBBinaria.setFont(new java.awt.Font("Arial", Font.ITALIC, 20));
        resultadoBBinaria.setBounds(60,300,240,23);
        resultadoBBinaria.setEnabled(false);
        
        botaoEnvia = new Button ("Envia");
        botaoEnvia.addActionListener(this);
        botaoBolha = new Button ("Ordenar por Bolha");
        botaoBolha.addActionListener(this);
        botaoInsertion = new Button ("Ordenar por Inserção");
        botaoInsertion.addActionListener(this);
        botaoBLinear = new Button ("Ordenar por Busca Linear");
        botaoBLinear.addActionListener(this);
        botaoBBinaria = new Button ("Ordenar por Busca Binária");
        botaoBBinaria.addActionListener(this);
        	
        
        painel.add(campo_entrada);
        painel.add(instruções);
        painel.add(resultado);
        painel.add(resultadoInsertion);
        painel.add(resultadoBolha);
        painel.add(resultadoBLinear);
        painel.add(resultadoBBinaria);
        painelBotaoEnvia.add(botaoEnvia);
        painelBotaoBolha.add(botaoBolha);
        painelBotaoInsertion.add(botaoInsertion);
        painelBotaoBLinear.add(botaoBLinear);
        painelBotaoBBinaria.add(botaoBBinaria);
        janela.add(painel);
        janela.add(painelBotaoEnvia);
        janela.add(painelBotaoBolha);
        janela.add(painelBotaoBLinear);
        janela.add(painelBotaoBBinaria);
        janela.add(painelBotaoInsertion);

	}
	
	public String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== botaoEnvia) {
			if (campo_entrada.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null,"Digite os números para ordenar!");
			}else {
				if (index < num.length) {
                        int valor = Integer.parseInt(campo_entrada.getText());
                        num[index] = valor;
                        index++;
                        campo_entrada.setText("");
                        String formatarString="";
                        for (int i=0;i<5;i++) {
                        	formatarString = formatarString+ (Integer.toString(num[i]))+", ";
                        	resultado.setText(formatarString);
                            }
                        
                        
				}else {
                    JOptionPane.showMessageDialog(null, "Array está cheio.");
                    /*for (int i=0;i<2;i++) {
                    System.out.println(num[i]);
                    }*/
                }
				
			}
		}
		String texto="";
		if (e.getSource()==botaoBolha) {
			long startTime = System.nanoTime(); // Captura o tempo inicial
			OrdenacaoPorBolha.bolha(num);
	        long endTime = System.nanoTime(); // Captura o tempo final
	        
	        long duration = endTime - startTime;
			
			for (int i=0;i<5;i++) {
				
			    texto = texto + (Integer.toString(num[i]))+", ";
				resultadoBolha.setText(texto+"Tempo: "+duration+ " nanosegundos");
			}
		}
		if (e.getSource()==botaoInsertion) {
			long startTime = System.nanoTime(); // Captura o tempo inicial
			OrdenacaoPorInsercao.insertion(num);
	        long endTime = System.nanoTime(); // Captura o tempo final
	        
	        long duration = endTime - startTime;
			
			for (int i=0;i<5;i++) {
				
			    texto = texto + (Integer.toString(num[i]))+", ";
				resultadoInsertion.setText(texto+"Tempo: "+duration+ " nanosegundos");
			}
		}
		/*if (e.getSource()==botaoBBinaria) {
			long startTime = System.nanoTime(); // Captura o tempo inicial
			BuscaBinaria.binaria(num);
	        long endTime = System.nanoTime(); // Captura o tempo final
	        
	        long duration = endTime - startTime;
			
			for (int i=0;i<5;i++) {
				
			    texto = texto + (Integer.toString(num[i]))+", ";
				resultadoBBinaria.setText(texto+"Tempo: "+duration+ " nanosegundos");
			}
		}*/
	}
	
	public void mostraTela() {
        janela.setVisible(true);
    }
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public static void main (String[] args) {
        Tela inicio = new Tela();
        inicio.mostraTela();
	}
}	
	
