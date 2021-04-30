package com.loiane.HerancaPolimorfismo.exerc1;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	@Override
	public String toString() {
		String s = "ContaBancaria[";
		s += " nomeCliente: " + nomeCliente;
		s += " numConta: " + numConta;
		s += " saldo: " + saldo;
		s += "]";
		// TODO Auto-generated method stub
		return s;
	}
	
	
	public boolean sacar(double valor) {
		if ((saldo - valor)  >=0) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		//TODO
		saldo += valor;
	}

	
	
}
