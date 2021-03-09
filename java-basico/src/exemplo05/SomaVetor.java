package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para mostrar a soma de um vetor do tipo inteiro
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class SomaVetor {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetor[];

		// declarando vari�vel auxiliar para somaro vetor
		int soma;

		// inicializando a vari�vel de soma
		soma = 0;

		// iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new int[5];

		// recebendo os valores do usu�rio usando o comando FOR
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}

		// somando o vetor com aux�lio do comando FOR
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		// exibindo o resultado da soma do vetor
		System.out.println(soma);
	}

}
