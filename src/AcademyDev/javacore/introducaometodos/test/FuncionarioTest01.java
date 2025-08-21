package AcademyDev.javacore.introducaometodos.test;

import AcademyDev.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario();
		funcionario01.nome = "Fernando";
		funcionario01.idade = 28;
		funcionario01.salario = 2500.00;

		Funcionario funcionario02 = new Funcionario();
		funcionario02.nome = "Renata";
		funcionario02.idade = 22;
		funcionario02.salario = 3200.00;

		Funcionario funcionario03 = new Funcionario();
		funcionario03.nome = "Michele";
		funcionario03.idade = 42;
		funcionario03.salario = 9600.00;

		funcionario01.imprime();
		funcionario02.imprime();
		funcionario03.imprime();

		Funcionario[] funcionarios = {funcionario01, funcionario02, funcionario03};


		for (Funcionario f : funcionarios) {
			System.out.println(f);
		}

		double soma = 0;
		for (Funcionario f : funcionarios) {
			soma += f.salario;
		}
		double media = soma / funcionarios.length;
		System.out.println("Média salarial: " + media);
	}
}





