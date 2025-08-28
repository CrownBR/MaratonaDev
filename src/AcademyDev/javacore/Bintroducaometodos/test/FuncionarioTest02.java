package AcademyDev.javacore.Bintroducaometodos.test;

import AcademyDev.javacore.Bintroducaometodos.dominio.Funcionario01;

public class FuncionarioTest02 {
	public static void main(String[] args) {
		Funcionario01 funcionario = new Funcionario01();
		funcionario.nome = "Fernando";
		funcionario.idade = 57;
		funcionario.salarios = new double[]{1200,987.32,2000};

		funcionario.imprime();


	}
}
