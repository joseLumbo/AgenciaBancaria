package Seguro;

import Contas.Conta;

public class SeguroPessoaFisica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta corrente4 = new Conta();
		corrente4.Cliente = "Raul Julio Tito De Oliveira";
		corrente4.saldo = 9000;
		System.out.println("Cliente: " +corrente4.Cliente);
		System.out.println("Saldo: R$ " +corrente4.saldo);

	}

}
