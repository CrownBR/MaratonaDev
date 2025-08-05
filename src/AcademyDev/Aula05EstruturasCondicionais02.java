package AcademyDev;

public class Aula05EstruturasCondicionais02 {
	public static void main(String[] args) {
		// idade < 15 categoria infantil
		// idade >= 15 && idade < 18 categoria juvenil
		// idade >= 18 categoria adulto
		int idade = 12;
		String categoria;

		if(idade <15){
			System.out.println("Categoria infantil");
		} else if (idade >=15 && idade < 18){
			System.out.println("Categoria Juvenil");
		} else {
			System.out.println("Categoria Adulto");
		}

	}
}
