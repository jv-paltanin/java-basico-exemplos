package exemplo09;

/**
 * Classe respons�vel por instanciar um objeto Professor e exibir os seus dados
 * 
 * @author Jo�o Victor
 * @since 23/02/2021
 */
public class TestaProfessor {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// criando um objeto do tipo professor e instanciando
		Professor jose = new Professor();
		jose.setNome("Jos� Aparecido da Silva");
		jose.setCpf("123.123.123-12");
		jose.setSalario(1500.00);
		jose.setMateria("Matem�tica");

		jose.mostrarDados();
	}

}
