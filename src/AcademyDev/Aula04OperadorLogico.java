package AcademyDev;
// && (and) || (or) !
public class Aula04OperadorLogico {
	public static void main(String[] args) {
		/*int idade = 29;
		float salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
		System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
		System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);
	*/
		/*double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
		System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
	*/
		// = += -+ *= /= %=
		double bonus = 1800;
		bonus += 1000;
		System.out.println(bonus);
		// ++ --
		int contador = 0;
		contador += 1;
		System.out.println(contador);
	}
}
