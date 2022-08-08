package Contas;

public class Conta {
	//Criando os atributos
	public String Cliente;
	public double saldo;
	//construtor
	public Conta() {
		System.out.println("==================================");
		System.out.println("Agencia Bancaria 512");
	}
	
	public void ExibirSaldo() {
		System.out.println("Saldo R$ " +saldo);
	}

}
