package Contas;

public class PessoaFisica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta corrente = new Conta();
		corrente.Cliente ="Jose Lumbo Cotingo";
		corrente.saldo = 5000;
		System.out.println("Cliente: " +corrente.Cliente);
		corrente.ExibirSaldo();
		System.out.println("===================================");
		
		Conta corrente2 = new Conta();
		corrente2.Cliente = "Antonio João Brinco Kimbamba";
		corrente2.saldo = 10000;
		System.out.println("Cliente: " +corrente2.Cliente);
		corrente2.ExibirSaldo();
		System.out.println("==================================");
		
		Conta corrente3 = new Conta();
		corrente3.Cliente = "Isabela Fernando";
		corrente3.saldo = 20000;
		System.out.println("Cliente: " +corrente3.Cliente);
		corrente3.ExibirSaldo();
		System.out.println("==================================");
		
		

	}

}
