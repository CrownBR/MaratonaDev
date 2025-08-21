package AcademyDev.Desafios;

public class desafio010 {
	public static void main(String[] args) {

		int[][] irregular = new int[3][];
		irregular[0] = new int[2];
		irregular[1] = new int[3];
		irregular[2] = new int[4];


		int count = 1;
		for (int i = 0; i < irregular.length; i++) {
			for (int j = 0; j < irregular[i].length; j++) {
				irregular[i][j] = count++;
			}
		}

		System.out.println("Matriz irregular:");
		for (int[] linha : irregular) {
			for (int num : linha) {
				System.out.print(num + " ");
			}
			System.out.println();
		}


		int[][] retangular = new int[3][4];
		count = 1;
		for (int i = 0; i < retangular.length; i++) {
			for (int j = 0; j < retangular[i].length; j++) {
				retangular[i][j] = count++;
			}
		}

		System.out.println("\nMatriz retangular:");
		for (int[] linha : retangular) {
			for (int num : linha) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
