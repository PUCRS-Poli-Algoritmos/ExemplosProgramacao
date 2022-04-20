package br.pucrs.exerprog.cofrinhoList;
import java.util.*;

public class Cofrinho {
	private List<Moeda> cofre = new ArrayList<Moeda>();
	
	public void adicionar(Moeda m)
	{
		cofre.add(m);
	}
	
	public double calcularTotal()
	{
		double total = 0;
		int i;
		
		for (i = 0; i < cofre.size(); i++)
			total += cofre.get(i).getValor();
		
		return total;
	}
	
	public int contaMoedas()
	{
		return cofre.size();
	}
	
	// Repare na sobrecarga de método
	public int contaMoedas(float v)
	{
		int i;
		int cont = 0;
		
		for (i = 0; i < cofre.size(); i++)
			if (cofre.get(i).getValor() == v)
				cont ++;
		
		return cont;
	}
	
	public float maiorMoeda()
	{
		int i;
		float maior;
		
		if (cofre.size() >= 1)
			maior = cofre.get(0).getValor();
		else 
			maior = -1;
		
		for (i = 1; i < cofre.size(); i++)
			if (maior < cofre.get(i).getValor())
				maior = cofre.get(i).getValor();
		
		return maior;
	}
	
	public void ordenaCofrinho() {
		Collections.sort(cofre);
	}
	
	public String toString() {
		String res = "";
		
		for (Moeda m:cofre)
			res = res + m.getNome() + " " + m.getValor() + "   ";
		
		return res;
	}
	
}
