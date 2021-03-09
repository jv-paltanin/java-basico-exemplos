package exemplo06;

/**
 * Classe para demonstrar a utiliza��o do objeto Pessoa
 * 
 * @author Jo�o Victor
 * @since 17/02/2021
 */
public class TestaPessoa {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o objeto pessoa
		Pessoa joao;

		// inicializando o objeto joao (inst�ncia de objeto)
		joao = new Pessoa();

		// atribuindo os valores ao objeto joao
		joao.nome = "Jo�o Victor Paltanin";
		joao.dataNascimento = "16/04/2001";
		joao.altura = 1.83;
		joao.peso = 77;
		joao.sexo = "Masculino";

		// declarando o onjeto pessoa maria
		Pessoa maria;

		// inicializando o objeto maria (inst�ncia de objeto)
		maria = new Pessoa();

		// atribuindo os valores ao objeto maria
		maria.nome = "Maria Josias";
		maria.dataNascimento = "12/08/2005";
		maria.altura = 1.52;
		maria.peso = 65;
		maria.sexo = "Feminino";

		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.nome);
		System.out.println("Data de Nascimento: " + joao.dataNascimento);
		System.out.println("Altura: " + joao.altura);
		System.out.println("Peso: " + joao.peso);
		System.out.println("Sexo: " + joao.sexo);

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto maria
		System.out.println("Nome: " + maria.nome);
		System.out.println("Data de Nascimento: " + maria.dataNascimento);
		System.out.println("Altura: " + maria.altura);
		System.out.println("Peso: " + maria.peso);
		System.out.println("Sexo: " + maria.sexo);

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto joao
		joao.exibirDados();

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto maria
		maria.exibirDados();
	}

}
