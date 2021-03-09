package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valor espec�fico do vetor tipo String
 * 
 * @author Jo�o Victor
 * @since 11/02/2021
 */
public class BuscarValorVetorString {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		String vetor[];

		// iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new String[3];

		// vari�vel auxiliar para buscar um registro
		String nome = "Jo�o";

		// valorizando o vetor recebendo os dados do usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}

		// varrendo vetor para verificar os registros armazenados
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(nome)) {
				System.out.println("Achei o que voc� procurava na posi��o: " + i);
			}
		}

	}

}