package com.loiane.HerancaPolimorfismo.exerc1;

public class teste {

	public static void main(String[] args) {


		System.out.println("*** Teste Conta Bancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta simples");
		contaSimples.setNumConta("11111");
		
		System.out.println(contaSimples);
		
		contaSimples.depositar(100);
		
		if (contaSimples.sacar(50)) {
			System.out.println("Saque efetuado com sucesso! Novo saldo: " + contaSimples.getSaldo());	
		} else {
			System.out.println("saldo insuficiente para saque de " + 50 + " ; *** ");
		}
	
		//contaSimples.sacar(70);
		//static pois usado dentro de  public static void main
		private static void realizarSaque(ContaBancaria conta, double valor) {
			if (conta.sacar(valor)) {
				System.out.println("Saque efetuado com sucesso! Novo saldo: " + contaSimples.getSaldo());
			} else {
				System.out.println("saldo insuficiente para saque de " + 50 + " ; *** ");
			}
		}
	}

}
