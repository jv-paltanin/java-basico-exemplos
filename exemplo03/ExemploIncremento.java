package exemplo03;

/**
 * Programa para demonstrar o Incremento de valores
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * M�todo principal para exeuctar o programa
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int numero;

		// atribuindo valores a vari�vel
		numero = 1;

		System.out.println(numero); // exibe valor 1

		numero = numero + 1; // incremento

		System.out.println(numero); // exibe valor 2

		numero++; // incremento

		System.out.println(numero); // exibe valor 3

		System.out.println(numero++); // exibe valor 3

		System.out.println(numero); // exibe valor 4

		System.out.println(++numero); // exibe valor 5
	}

}
