package exemplo03;

/**
 * Programa para demonstrar o Decremento de valores
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class ExemploDecremento {

	/*
	 * M�todo principal para exeuctar o programa
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int numero;

		numero = 1;

		System.out.println(numero); // exibe valor 1

		numero = numero - 1; // decremento

		System.out.println(numero); // exibe valor 0

		numero = 10;

		numero--; // decremento

		System.out.println(numero); // exibe valor 9

		numero--; // decremento
		numero--; // decremento

		System.out.println(numero); // exibe valor 7

	}

}