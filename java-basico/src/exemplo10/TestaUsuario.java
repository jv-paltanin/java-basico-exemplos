package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utiliza��o de exce��es em Java
 * 
 * @author Jo�o Victor
 * @since 23/02/2021
 */
public class TestaUsuario {

	// m�todo para verificar String vazia
	public void receberDados() {
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usu�rio", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Nome v�lido!", "Cadastro de Usu�rio", 1);
		}

		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, "Nome v�lido!", "Cadastro de Usu�rio", 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usu�rio", 0);
		}

		if (Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, "Idade V�lida", "Cadastro de Uus�rio", 0);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalido, "Cadastro de Uus�rio", 0);
		}

	} // fim do m�todo

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// instanciando o objeto do tipo Usuario Usuario admin = new Usuario();
		new TestaUsuario().receberDados();
	}

}