package exemplo04;

/**
 * Program para demonstrar la�o de repeti��o while
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int indice;

		// inicializando a vari�vel
		indice = 0;

		// efetuando o la�o de repeti��o para exibir o cubo de um n�mero
		while (indice < 10) { // in�cio do la�o de repeti��o

			System.out.println(indice + " ao cubo � " + ((indice * indice) * indice));
			indice++;

		} // fim do la�o de repeti��o
	}

}
