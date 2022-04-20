package br.pucrs.exerprog.revfund;

import java.util.ArrayList;
import br.pucrs.exerprog.arranjos.MetodosArranjos;

public class Basics {
	public String nString(int n) {
		String res = "";
		
		if (n < 0)
			throw new IllegalArgumentException("Nro negativo");
		else 
			for (int i = 0; i <= n; i++)
				res = res + i + " ";
		
		return res;
	}
	
	public int[] nArray(int n) {
		int [] res = new int[n+1];
		
		if (n < 0)
			throw new IllegalArgumentException("Nro negativo");
		else 
			for (int i = 0; i <= n; i++)
				res[i] = i;
		
		return res;
	}
	

	public boolean ePrimo(int n) {
		boolean res = true;
		
		if (n > 1) 
			for (int i = 2; (i < n) && (res == true); i++)
				if (n % i == 0)
					res = false;
				else;
		else res = false;
		
		return res;
	}

	public int[] listaPrimos(int ini, int fim) {
		int prim = ini, ult = fim;
		
		if (ini > fim) {
			prim = fim;
			ult = ini;
		}
		
		int[] res = new int[ult - prim];
		
		for (int i = prim, pos = 0; i <= ult; i++)
			if (this.ePrimo(i))
				res[pos++] = i;
		
		return res;
	}
	
	public static void main(String [] args) {
		Basics bas = new Basics();
		MetodosArranjos metA = new MetodosArranjos();
		
		System.out.println(" n = 10 --> " + bas.nString(10));
		
		int [] resArr = bas.nArray(10);
		System.out.println("\n" + metA.exibeTudo(resArr));
		
		System.out.println("\nÉ primo: 3 -> " + bas.ePrimo(3));
		System.out.println("É primo: 5 -> " + bas.ePrimo(5));
		System.out.println("É primo: 11 -> " + bas.ePrimo(11));
		System.out.println("Não é primo: 4 -> " + bas.ePrimo(4));
		System.out.println("Não é primo: 9 -> " + bas.ePrimo(9));
		System.out.println("Não é primo: 15 -> " + bas.ePrimo(15));
		
		resArr = bas.listaPrimos(2, 100);
		System.out.println("\nLista de primos de 2 à 100");
		for (int i = 0; i < resArr.length; i++)
			if (resArr[i] == 0) {
				System.out.println("");
				break;
			}
			else
				System.out.print(resArr[i] + " ");
	}
}
