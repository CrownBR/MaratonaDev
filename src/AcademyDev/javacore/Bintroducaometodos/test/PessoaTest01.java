package AcademyDev.javacore.Bintroducaometodos.test;

import AcademyDev.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
//		 	pessoa.nome = " Fernando;
		pessoa.setNome("Fernando");
		pessoa.setIdade(70);
//		pessoa.imprime();
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}
}
