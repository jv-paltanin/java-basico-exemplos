package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do comando Switch
 * 
 * @author jvictorp
 * @since 08/02/2021
 */
public class CondicionalSwitch {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		int mes;

		// capturando os dados do usu�rio
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s"));

		// exibindo o m�s escolhido pelo usu�rio
		switch (mes) {
		case 1: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Janeiro");
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Fevereiro");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Mar�o");
			break;
		}
		case 4: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Abril");
			break;
		}
		case 5: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Maio");
			break;
		}
		case 6: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Junho");
			break;
		}
		case 7: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Julho");
			break;
		}
		case 8: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Agosto");
			break;
		}
		case 9: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Setembro");
			break;
		}
		case 10: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Outubro");
			break;
		}
		case 11: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Novembro");
			break;
		}
		case 12: {
			JOptionPane.showMessageDialog(null, "M�s escolhido - Dezembro");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "N�o consta no calend�rio!");
		}
	}

}
