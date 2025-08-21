package AcademyDev.javacore.introducaometodos.test;

import AcademyDev.javacore.introducaometodos.dominio.ImpressoraEstudante;
import AcademyDev.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest01 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();

		estudante01.nome = "Fernando";
		estudante01.idade = 15;
		estudante01.sexo = 'M';

		estudante02.nome = "Renata";
		estudante02.idade = 16;
		estudante02.sexo = 'F';

		System.out.println("#################");

		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
	}

}
