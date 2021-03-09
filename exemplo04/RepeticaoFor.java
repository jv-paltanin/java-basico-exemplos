package exemplo04;

/**
 * Programa para demonstrar a utliza��o do comando de repeti��o For
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class RepeticaoFor {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// efetuando o la�o de repeti��o para exibir o cubo de um n�mero
		for (int i = 0; i < 10; i++) { // in�cio do la�o for
			System.out.println(i + " ao cubo � " + ((i * i) * i));
		} // fim do la�o for
	}

}
