package AcademyDev.Desafios;

public class desafio05 {
	public static void main(String[] args) {
		// Calculando média simples
		double nota1 = 10.0;
		double nota2 = 4.0;
		double nota3 = 2.0;
		double mediaAluno1 = (nota1 + nota2 + nota3) / 3;
		if (mediaAluno1 >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}
}
