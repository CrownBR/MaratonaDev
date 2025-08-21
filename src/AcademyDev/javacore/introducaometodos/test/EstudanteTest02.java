package AcademyDev.javacore.introducaometodos.test;

import AcademyDev.javacore.introducaometodos.dominio.Estudante;
import AcademyDev.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();

		estudante01.nome = "Fernando";
		estudante01.idade = 15;
		estudante01.sexo = 'M';

		estudante02.nome = "Renata";
		estudante02.idade = 16;
		estudante02.sexo = 'F';

		estudante01.imprime();
		estudante02.imprime();
	}
}
