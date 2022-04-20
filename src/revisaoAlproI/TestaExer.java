package revisaoAlproI;

import java.util.*;

public class TestaExer {

	public static void mostraArray(int [] l){
		for(int i = 0; i < l.length; i++)
			System.out.print(l[i] + " ");
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		ExercRepeticao ex = new ExercRepeticao();
		
		System.out.println("De 0 até 10");
		System.out.println(ex.concatenaInteiros(10));
		System.out.println("De 0 até -10");
		System.out.println(ex.concatenaInteiros(-10));
		System.out.println("De 0 até 0");
		System.out.println(ex.concatenaInteiros(0));

		System.out.println("De 0 até 10");
		mostraArray(ex.arrayInteiros(10));
		System.out.println("De 0 até -10");
		mostraArray(ex.arrayInteiros(-10));
		System.out.println("De 0 até 0");
		mostraArray(ex.arrayInteiros(0));

		
		System.out.println();
		for (int i = -20; i <= 20; i++)
			System.out.println(i + " e primo? " + ex.ePrimo(i));
		
		int[] res;
		System.out.println("\n\nPrimos entre -30 e +30: \n");
		res = ex.listaPrimos(-30, +30);
		mostraArray(res);

		System.out.println("\n\nPrimos entre +30 e -30: \n");
		res = ex.listaPrimos(+30, -30);
		mostraArray(res);

		System.out.println("\n\nPrimos entre 0 e 0: \n");
		res = ex.listaPrimos(0, 0);
		mostraArray(res);

		System.out.println("\n\nPrimos entre 3 e 3: \n");
		res = ex.listaPrimos(3, 3);
		mostraArray(res);
		
		System.out.println();
	}

}
