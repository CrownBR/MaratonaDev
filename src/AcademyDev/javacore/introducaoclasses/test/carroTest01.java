package AcademyDev.javacore.introducaoclasses.test;


import AcademyDev.javacore.introducaoclasses.dominio.carro;

public class carroTest01 {
	public static void main(String[] args) {
		carro carro1 = new carro();
		carro carro2 = new carro();

		carro1.nome = "320i";
		carro1.modelo = "BMW";
		carro1.ano = 2025;
		System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);

		carro2.nome = "Fusca";
		carro2.modelo = "Volk";
		carro2.ano = 1997;
		System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);

	}
}




