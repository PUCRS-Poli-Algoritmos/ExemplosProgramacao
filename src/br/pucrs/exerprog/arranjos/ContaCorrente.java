package br.pucrs.exerprog.arranjos;

public class ContaCorrente {
	private double saldo;
	private int nroConta;
	
	public ContaCorrente(int nroConta, double n) {
		if (n > 0)
			saldo = n;
		
		if (nroConta > 0)
			this.nroConta = nroConta;
		else
			this.nroConta = -1;
	}
	
	public boolean deposito(double valor) {
		boolean res = true;
		
		if (valor > 0)
			saldo += valor;
		else
			res = false;
		
		return res;
	}
	
	public double retirada(double valor) {
		double res = -1;
		
		if (valor <= saldo){ 
			saldo = saldo - valor;
			res = valor;
		}
		
		return res;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNroConta() {
		return nroConta;
	}
	
	public String toString(){
		return "Conta: " + nroConta + ". Saldo: " + saldo + ".";
	}
}
