package exemplo04;

/**
 * Programa para demonstrar a utliza��o do comando de repeti��o Do While
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int i;

		// inicializando a vari�vel
		i = 0;

		// efetuando o la�o de repeti��o para exibir o cubo de um n�mero
		do {
			System.out.println(i + " ao cubo � " + ((i * i) * i));
			i++;
		} while (i < 10);
	}

}
