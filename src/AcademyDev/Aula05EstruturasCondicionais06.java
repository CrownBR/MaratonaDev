package AcademyDev;

public class Aula05EstruturasCondicionais06 {
	public static void main(String[] args) {
		// Utilizando SWITCH e Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
		// Considerando 1 como Domingo
		byte dia = 3;
		switch (dia){
			case 1:
			case 7:
				System.out.println("FDS");
			case 2:
				System.out.println("Dia útil");
				break;
			case 3:
				System.out.println("Dia útil");
				break;
			case 4:
				System.out.println("Dia útil");
				break;
			case 5:
				System.out.println("Dia útil");
				break;
			case 6:
				System.out.println("Dia útil");
				break;
			default:
				System.out.println("Opção inválida");
				break;

		}
	}
}
