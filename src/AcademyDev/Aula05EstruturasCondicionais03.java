package AcademyDev;

public class Aula05EstruturasCondicionais03 {
	public static void main(String[] args) {
		// Doar se salario > 5000
		double salario = 3000;
		String mensagemDoar = "Eu vou doar 500 pro Fernando";
		String mensagemNãoDoar = "Ainda não tenho condições, mas vou ter!";
		// (condicao) ? verdadeiro : falso
		String resultado;
		if(salario > 5000) {
			resultado = mensagemDoar;
		}else {
			resultado = mensagemNãoDoar;
		}
		System.out.println(resultado);
	}
}
