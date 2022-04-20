package br.pucrs.exerprog.conjuntos;

import java.util.*;
import br.pucrs.util.MyTimer;

public class Testa {

	/**
	 * @param args
	 */
	
	
	public static <A> void mostra(List<A> l){
		int length = 20;
		int cont = 0;
		for (A aux:l){
			cont++;
			if (cont > 20){
				System.out.println("");
			    cont = 0;
			}
			System.out.print(aux + " ");
		}
	
		System.out.println("");
	}
	
	public static List<Integer> geraLista(int qtd, int seed){
		List<Integer> l = new LinkedList<>();
		Random r = new Random();
		
		if ((qtd > 0) && (seed > 0))
			for (int i = 0; i < qtd; i++)
				l.add(r.nextInt(seed));
		else
			l = null;
		
		return l;
	}
	
	public static void main(String[] args) {
		OperListasSemConjuntos<Integer> op1 = new OperListasSemConjuntos<>();
		OperListasComConjuntos<Integer> op2 = new OperListasComConjuntos<>();
		List<Integer> l1 = new LinkedList<>();
		List<Integer> l2 = new LinkedList<>();
		MyTimer t = new MyTimer();
		
		l1.add(2);
		l1.add(1);
		l1.add(7);
		l1.add(14);
		l1.add(2);
		
		l2.add(7);
		l2.add(1);
		l2.add(24);
		l2.add(32);
		l2.add(1);
		l2.add(14);
		l2.add(15);
		
		mostra(l1);
		mostra(l2);
		System.out.println("Resultados");
		System.out.println("União:");
		mostra(op1.union(l1, l2));
		mostra(op2.union(l1, l2));
		
		System.out.println("Intersecção:");
		mostra(op1.intersect(l1, l2));
		mostra(op2.intersect(l1, l2));
		System.out.println("----------------------");
		
		System.out.println("Gerando lista l1 - union - 1.000.000 de elementos, de 0 a 30");
		l1 = geraLista(1000000, 30);
		System.out.println("Gerando lista l2 - union - 1.000.000 de elementos, de 0 a 30");
		l2 = geraLista(1000000, 30);
		//Interessante: ver o que acontece se gerar valores entre 0 e 29 -
		//   impacto importante na performance pois muito rapidamente
		//   encontra os repetidos
		
		System.out.println("Resultados - union:");
		t.start();
		op1.union(l1, l2);
		t.stop();
		System.out.println("Tempo: " + t.getTempo());
		
		t.start();
		op2.union(l1, l2);
		t.stop();
		System.out.println("Tempo: " + t.getTempo());
		System.out.println("----------------------");

		System.out.println("Resultados - intersection:");
		t.start();
		op1.intersect(l1, l2);
		t.stop();
		System.out.println("Tempo: " + t.getTempo());
		
		t.start();
		op2.intersect(l1, l2);
		t.stop();
		System.out.println("Tempo: " + t.getTempo());
		System.out.println("----------------------");
	}

}
