package AcademyDev.javacore.introducaometodos.dominio;

public class Funcionario {
	public String nome;
	public int idade;
	public double salario;

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
				"Idade: " + idade + "\n" +
				"Salário: " + salario + "\n";
	}

	public void imprime() {

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("-------------------------");


	}
}

