package AcademyDev.Desafios;

public class desafio07 {
	public static void main(String[] args) {

		int[] notaAluno1 = {2, 3, 4};
		int[] notaAluno2 = {10, 10, 10};
		int[] notaAluno3 = {7, 7, 7};

		int[][] todosAlunos = {notaAluno1, notaAluno2, notaAluno3};

		for (int i = 0; i < todosAlunos.length; i++) {
			int soma = 0;

			for (int j = 0; j < todosAlunos[i].length; j++) {
				soma += todosAlunos[i][j];
			}

			double media = soma / 3.0;

			if (media >= 7) {
				System.out.println("Aluno " + (i + 1) + " Aprovou com média: " + media);
			} else {
				System.out.println("Aluno " + (i + 1) + " Reprovou com média: " + media);
			}
		}
	}
}
