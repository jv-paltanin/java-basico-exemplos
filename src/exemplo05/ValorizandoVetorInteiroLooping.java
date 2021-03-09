package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar como valorizar um vetor inteiro recebido pelo
 * usu�rio usando o FOR
 * 
 * @author Jo�o Victor
 * @since 11/02/2021
 */
public class ValorizandoVetorInteiroLooping {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetor[];

		// inicializando o vetor e definindo o seu tamanho
		vetor = new int[5];

		// recebendo os valores do usu�rio usando o comando FOR
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}

		// exibindo os valor usando o comando FOR
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}