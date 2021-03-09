package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utiliza��o do vetor tipo double
 * 
 * @author Jo�o Victor
 * @since 11/02/2021
 */
public class VetorDouble {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		double vetor[];

		// iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new double[5];

		// valorizando o vetor recebendo os dados do usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		}

		// exibindo os elementos gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}