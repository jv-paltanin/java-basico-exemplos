package exemplo01;

/**
 * Programa para demonstrar opera��es aritm�ticas
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class OperadoresAritmeticos {

	/*
	 * M�todo principal apara executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int adicao, subtracao, multiplicacao, modulo;
		double divisao;

		// exemplo de adi��o
		adicao = 10 + 5;

		// exemplo de subtra��o
		subtracao = 10 - 5;

		// exemplo de multiplica��o
		multiplicacao = 10 * 5;

		// exemplo de divis�o
		divisao = 10 / 5;

		// exemplo de m�dulo
		modulo = 10 % 5;

		// exibindo as vari�veis no console
		System.out.println("10 + 5 = " + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("10 * 5 = " + multiplicacao);
		System.out.println("10 / 5 = " + divisao);
		System.out.println("10 % 5 = " + modulo);

	}

}
