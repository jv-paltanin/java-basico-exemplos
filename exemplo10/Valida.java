/**
 * 
 */
package exemplo10;

/**
 * Classe respons�vel por armazenar os m�todos de valida��o de dados
 * 
 * @author Jo�o Victor
 * @since 23/02/2021
 */
public class Valida {

	// m�todo para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = tira os espa�os da vari�vel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// fim do m�todo

	// m�todo para verificar String v�lida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	} // fim m�todo

	// m�todo para verificar se � n�mero
	public static boolean isNumber(String args) {

		try {
			return true;
		} catch (Exception e) {
			return false;
		}
	} // fim do m�todo
}
