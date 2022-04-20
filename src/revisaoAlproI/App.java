package revisaoAlproI;

import java.util.ArrayList;

public class App {

	public void executa() {
		ExercRepeticao ex = new ExercRepeticao();
		
		System.out.println("De 0 até 10");
		System.out.println(ex.concatenaInteiros(10));
		System.out.println("De 0 até -10");
		System.out.println(ex.concatenaInteiros(-10));
		System.out.println("Somento o 0");
		System.out.println(ex.concatenaInteiros(0));

		System.out.println("De 0 até 10");
		System.out.println(ex.listaInteiros(10));
		System.out.println("De 0 até -10");
		System.out.println(ex.listaInteiros(-10));
		System.out.println("Somento o 0");
		System.out.println(ex.listaInteiros(0));
		

		
		System.out.println();
		for (int i = 0; i <= 20; i++)
			System.out.println(i + " e primo? " + ex.ePrimo(i));
		for (int i = 0; i >= -20; i--)
			System.out.println(i + " e primo? " + ex.ePrimo(i));
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		System.out.println("\n\n Primos entre -30 e +30: \n");
		res = ex.listaPrimos(-30, +30);
		System.out.println(res);
		
	}

	public static void main(String args[])
	{
		App app = new App();
		app.executa();
	}

}
