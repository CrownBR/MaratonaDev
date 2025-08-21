package AcademyDev.Desafios;

public class desafio06 {
	public static void main(String[] args) {
		int[] notaAluno1 = {2, 3, 4};
		int[] notaAluno2 = {10, 10, 10};
		int[] notaAluno3 = {7, 7, 7};

		int somaAluno1 = 0;
		somaAluno1 = somaAluno1 + notaAluno1[0];
		somaAluno1 = somaAluno1 + notaAluno1[1];
		somaAluno1 = somaAluno1 + notaAluno1[2];

		int somaAluno2 = 0;
		somaAluno2 = somaAluno2 + notaAluno2[0];
		somaAluno2 = somaAluno2 + notaAluno2[1];
		somaAluno2 = somaAluno2 + notaAluno2[2];

		int somaAluno3 = 0;
		somaAluno3 = somaAluno3 + notaAluno3[0];
		somaAluno3 = somaAluno3 + notaAluno3[1];
		somaAluno3 = somaAluno3 + notaAluno3[2];


		double mediaAluno1 = somaAluno1 / 3.0;
		double mediaAluno2 = somaAluno2 / 3.0;
		double mediaAluno3 = somaAluno3 / 3.0;

		if (mediaAluno1 >= 7) {
			System.out.println("Aprovou");
		} else {
			System.out.println("Reprovou");
		}
		if (mediaAluno2 >= 7) {
			System.out.println("Aprovou");
		} else {
			System.out.println("Reprovou");
		}
		if (mediaAluno3 >= 7) {
			System.out.println("Aprovou");
		} else {
			System.out.println("Reprovou");
		}


	}
}
