package AcademyDev.javacore.introducaometodos.test;

import AcademyDev.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		double result = calculadora.divideDoisNumeros(20d,0d);
		System.out.println(result);
		System.out.println(calculadora.divideDoisNumeros02(20D, 0D));
		System.out.println("------------------");
		calculadora.imprimeDivisaoDeDoisNumeros(86d, 0d);

		}

	}


