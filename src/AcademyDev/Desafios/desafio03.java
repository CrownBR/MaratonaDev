package AcademyDev.Desafios;

public class desafio03 {

	public static void main(String[] args) {
		calculaSalarioComDescontoFixo();
		calculaSalarioComDescontoPercentual();
	}

	// Método 1: desconto fixo
	public static void calculaSalarioComDescontoFixo() {
		double salarioBruto = 2500;
		double descontoSalario = 250;
		double salarioLiquido = salarioBruto - descontoSalario;
		System.out.println("Salário líquido com desconto fixo: " + salarioLiquido);
	}

	// Método 2: desconto percentual
	public static void calculaSalarioComDescontoPercentual() {
		double salarioBruto = 2500;
		double percentualDesconto = 10; // 10%
		double valorDesconto = salarioBruto * (percentualDesconto / 100);
		double salarioLiquido = salarioBruto - valorDesconto;
		System.out.println("Salário líquido com desconto percentual: " + salarioLiquido);
	}
}
