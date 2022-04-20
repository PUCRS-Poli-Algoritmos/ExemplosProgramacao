package br.pucrs.exerprog.cofrinhoList;

public class Moeda implements Comparable<Moeda>{
	private float valor;
	private String nome;
	
	Moeda(float f, String n)
	{
		valor = f;
		nome = n;
	}
	
	public float getValor()
	{
		return valor;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int compareTo(Moeda m){
		int res;
		
		if (m.getValor() == getValor())
			res = 0;
		else if (getValor() < m.getValor())
				res = -1;
		else 
			res = +1;
		return res;
	}
}
