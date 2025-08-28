package AcademyDev.javacore.Dconstrutores.test;

import AcademyDev.javacore.Dconstrutores.dominio.Anime;


public class animeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime("Akudama","TV",12, "Ação", "Production IG");

//Iniciei Com Construtores!
//		anime.init("Akudama","TV",12);
//		anime.init("Akudama","TV",12, "Ação");
		anime.imprime();
	}
}


