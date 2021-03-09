package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de dados String para double
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * M�todo principal apara executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double valor1, valor2, resultado;

		// atribuindo valores
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

		// efetuando o c�lculo
		resultado = valor1 / valor2;

		// exibindo na tela o resultado da divis�o
		System.out.println("O resultado �: " + resultado);

	}

}
