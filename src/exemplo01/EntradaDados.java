package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demosntrar entrada de dados fornecido pelo usu�rio
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * M�todo principal apara executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		String nome;

		// atribuir valor para a vari�vel
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		
		System.out.println("Seu nome �: " + nome);
	}

}
