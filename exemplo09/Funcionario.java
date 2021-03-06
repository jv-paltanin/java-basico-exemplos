package exemplo09;

/**
 * Classe para demonstrar o conceito de heran�a de m�todos e atributos
 * 
 * @author Jo�o Victor
 * @since 23/02/2021
 */
public abstract class Funcionario {

	// atributos do objeto funcion�rio
	private String nome;
	private String cpf;
	private double salario;

	// m�todos para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// m�todo simples para exibir atributos
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Sal�rio: " + salario);
	}

} // fim da classe
