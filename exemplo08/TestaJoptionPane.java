package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utiliza��o do componente JoptionPane acessando
 * atributos est�ticos
 * 
 * @author Jo�o Victor
 * @since 23/02/2021
 */
public class TestaJoptionPane {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// utilizando o JoptionPane com o construtor para exibi��o de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.erroIncluido, "Erro", 0); // 0 - c�digo do �cone de erro

		// utilizando o JoptionPane com o construtor para exibi��o de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - c�digo do �cone
																									// de informa��o

		// utilizando o JoptionPane com o construtor para exibi��o de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 2); // 0 - c�digo do �cone de advert�ncia

		// utilizando o JoptionPane com o construtor para exibi��o de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 3); // 0 - c�digo do �cone de interroga��o
	}
}
