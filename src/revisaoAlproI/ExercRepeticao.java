package revisaoAlproI;

import java.util.*;

public class ExercRepeticao {
	public String concatenaInteiros(int n) {
		String res = "";
		int incr = 1;
		
		if (n < 0)
			incr = -1;
		
		for (int i = 0; i != n + incr; i = i + incr)
			res = res + i + " ";
		
		return res;
	}

	public int[] arrayInteiros(int n) {
		int[] res;
		int incr = 1;
		
		if (n < 0) {
			incr = -1;
			res = new int[(n * -1) + 1];
		}
		else {
			res = new int[n + 1];
		}
		
		int pos = 0;
		for (int i = 0; i != n + incr; i = i + incr)
			res[pos++] = i;
		
		return res;
	}
	
	public boolean ePrimo(int n) {
		boolean res = false;
		
		if (n < 0)
			res = false;
		else if (n == 1)
			res = true;
		else {
			int i;
			for (i = 2; (i < n) && (n % i != 0); i++);
			if (i == n)
				res = true;
		}
		
		return res;
	}
	
	public int[] listaPrimos(int n1, int n2) {
		int[] res;
		int[] resFinal;
		int ini, fim, tam, pos = 0;
		
		if (n1 < n2) {
			ini = n1;
			fim = n2;
		}
		else {
			ini = n2;
			fim = n1;
		}
		
		tam = (fim - ini) + 2;
		res = new int[tam];
		for (int i = ini; i <= fim; i++ )
			if (ePrimo(i)) {
				res[pos++] = i;
			}
		
		resFinal = new int[pos];
		for (int i = 0; i < pos; i++)
			resFinal[i] = res[i];
		
		return resFinal;
	}
}
