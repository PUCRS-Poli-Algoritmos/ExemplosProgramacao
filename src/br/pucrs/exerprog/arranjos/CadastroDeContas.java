package br.pucrs.exerprog.arranjos;

public class CadastroDeContas {
	private ContaCorrente [] cadContas = new ContaCorrente[999];
	private int qtdContas = 0;
	
	public int getQtdContas() {
		return qtdContas;
	}
	public boolean novaConta(ContaCorrente c) {
		boolean res = true;
		
		if (c == null)
			res = false;
		else if (qtdContas == cadContas.length)
				res = false;
			 else {
				 cadContas[qtdContas] = c;
				 qtdContas++;
		}
		return res;
	}
	
	public ContaCorrente getConta(int nroConta) {
		ContaCorrente res = null;
		
		for (int i = 0; i < this.qtdContas; i++)
			if (nroConta == cadContas[i].getNroConta()){
				res = cadContas[i];
				break;
			}
				
		return res;
	}

	public ContaCorrente getContaOpt(int nroConta) {
		ContaCorrente res = null;
		
		int i;
		for (i = 0; i < this.qtdContas; i++)
			if (nroConta == cadContas[i].getNroConta()){
				res = cadContas[i];
				break;
			}
		
		if (i < this.qtdContas)
			if (i > 0 && qtdContas > 1) {
				ContaCorrente aux = cadContas[i-1];
				cadContas[i-1] = cadContas[i];
				cadContas[i] = aux;
			}
		
		return res;
	}
		
	public double getSaldoTotal() {
		double res = 0.0;
		
		for (int i = 0; i < qtdContas; i++)
			res = res + cadContas[i].getSaldo();
		
		return res;
	}
	
	public int conta(int noMinimo) {
		int res = 0; 
		
		if (noMinimo >= 0)
			for (int i = 0; i < qtdContas; i++) {
				if (noMinimo <= cadContas[i].getSaldo())
					res++;
			}
		else
			res = -1;
		
		return res;
	}
	
	public double maiorSaldo(){
		double res = 0.0;
		
		for (int i = 0; i < qtdContas; i++)
			if (cadContas[i].getSaldo() > res)
				res = cadContas[i].getSaldo();
		
		return res;
	}
	
	public boolean remove(int nroConta){
		boolean res = true;
		
		int i;
		for(i = 0; i < qtdContas; i++)
			if (cadContas[i].getNroConta() == nroConta)
				break;
		
		if (i >= qtdContas)
			res = false;
		else {
			for (int j = i; j < qtdContas-1; j++)
				cadContas[j] = cadContas[j+1];
			
			qtdContas--;
		}
			
		return res;
	}
	
	// MUITO cuidado com o retorno deste método.
	public ContaCorrente [] getRefArrayCC() {
		return cadContas;
	}
	
	public ContaCorrente [] getCopiaArrayCC() {
		ContaCorrente [] res = null;
		
		if (cadContas != null)
			res = cadContas.clone();
		
		return res;
	}

	public String toString(){
		String res = "";
		
		for (int i = 0; i < qtdContas; i++)
			res = res + cadContas[i].toString() + "\n";
		
		return res;
	}
}
