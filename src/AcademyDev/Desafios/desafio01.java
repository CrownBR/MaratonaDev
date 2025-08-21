package AcademyDev.Desafios;

public class desafio01 {
	public static void main(String[] args) {
		double cotacaoDolar = 5.40;

		// Conversão de Real para Dólar
		double valorEmReal = 10.0;
		double valorEmDolar = valorEmReal / cotacaoDolar;
		System.out.println(valorEmReal + " reais = US$ " + valorEmDolar);

		// Conversão de Dólar para Real
		valorEmDolar = 10.0;
		valorEmReal = valorEmDolar * cotacaoDolar;
		System.out.println(valorEmDolar + " dólares = R$ " + valorEmReal);
	}
}
