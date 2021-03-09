package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de tipos de dados
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * M�todo principal apara executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int valor1, valor2, resultado;

		// recebendo valores do usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

		// calculando o resultado da soma
		resultado = valor1 + valor2;

		// exibindo o resultado da soma
		System.out.println("O resultado da soma �: " + resultado);
	}

}
