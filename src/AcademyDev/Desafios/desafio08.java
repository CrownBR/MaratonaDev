package AcademyDev.Desafios;

public class desafio08 {
	public static void main(String[] args) {
		String[][] aluno = new String[3][4];
		aluno[0][0] = "Nome";
		aluno[0][1] = "Nascimento";
		aluno[0][2] = "CPF";
		aluno[0][3] = "RG";


		for (int i = 0; i < aluno.length; i++) {
			for (int j = 0; j < aluno[i].length; j++) {
				System.out.print(aluno[i][j] + " "); // imprime cada elemento da linha
			}
			System.out.println(); // pula linha depois de cada linha
		}



	}
}

//1,2,3,4,5 Meses
// 31, 28, 31, 30 dias
//int[][] dias = new int[3][3];
//dias[0][0] = 31;
//dias[0][1] = 28;
//dias[0][2] = 31;
//
//dias[1][0] = 31;
//dias[1][1] = 28;
//dias[1][2] = 31;
//
//		for (int i = 0; i < dias.length; i++) {
//		for (int j = 0; j < dias[i].length; j++) {
//		System.out.println(dias[i][j]);
//
//			}
//					System.out.println("----------------");
//			for (int[] arrBase: dias){
//		for (int num: arrBase){
//		System.out.println(num);
//				}
//						}
//
//						}

		/*int[][][] aluno1 = new int[0][1][2];
		double[][] notas = {
				{7.5, 8.0, 9.0, 10},
				{6.0, 5.5, 7.0, 8.5},
				{9.0, 9.5, 8.0, 10.0},
		};

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Aluno " + (i+1) + ":");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}*/

