package br.pucrs.exerprog.cofrinhoList;

public class Appl {

	public static void main(String [] argc)
	{
		Cofrinho cof = new Cofrinho();
		float maior;
		Moeda mAux;
		
		mAux = new Moeda(1, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(1, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(1, "centavo de real");
		cof.adicionar(mAux);

		mAux = new Moeda(20, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(20, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(20, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(20, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(20, "centavo de real");
		cof.adicionar(mAux);

		mAux = new Moeda(10, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(10, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(10, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(10, "centavo de real");
		cof.adicionar(mAux);

		mAux = new Moeda(50, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(50, "centavo de real");
		cof.adicionar(mAux);
		mAux = new Moeda(50, "centavo de real");
		cof.adicionar(mAux);
		
		System.out.println("Valor Total: " + cof.calcularTotal());
		System.out.println("Número de Moedas: " + cof.contaMoedas());
		
		System.out.println("");
		maior = cof.maiorMoeda();
		System.out.println("Maior Moeda: " + maior);		
		System.out.println("Quantidade de Moedas deste Valor: " + cof.contaMoedas(maior));
		
		System.out.println("");
		System.out.println("Cofrinho antes : " + cof);
		cof.ordenaCofrinho();
		System.out.println("Cofrinho depois: " + cof);			
	}
}
