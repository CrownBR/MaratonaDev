package AcademyDev.javacore.Eblocosinicializaçao.test;

import AcademyDev.javacore.Eblocosinicializaçao.dominio.Anime;

public class AnimeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime("One Piece");
		System.out.println(anime.getEpisodios());
	}
}
