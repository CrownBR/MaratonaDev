package AcademyDev.javacore.Csobrecargametodos.test;

import AcademyDev.javacore.Csobrecargametodos.dominio.Anime;

public class animeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime();
		anime.init("Akudama","TV",12);
		anime.init("Akudama","TV",12, "Ação");
		anime.imprime();
	}
}
