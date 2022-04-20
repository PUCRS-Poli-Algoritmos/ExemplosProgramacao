package br.pucrs.exerprog.dicionarios;

import java.util.*;

public class TestaAgenda {
	public static void mostra(List<Map.Entry<String, String>> lista) {
		for (Map.Entry<String,String> aux: lista) {
			System.out.print("Chave: " + aux.getKey());
			System.out.println("  Valor = "+ aux.getValue());
		}	
	}
	public static void main(String[]argc) {
		Agenda ag = new Agenda();
		try {
			ag.cadastra("João", "11111111");
			ag.cadastra("Pedro", "22222222");
			ag.cadastra("Carlos", "33333333");
			ag.cadastra("Ana", "44444444");
			ag.cadastra("Maria", "55555555");
			ag.cadastra("Paula", "66666666");
			ag.cadastra("João", "999999999");
			ag.cadastra("Maria Nro 2", "55555555");
		}
		catch (Exception ex) {
			System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		mostra(ag.buscaTodos()); 
		
		ag.remove("João");
		System.out.println("");
		mostra(ag.buscaTodos());
		
		String fone = ag.busca("Maria");
		System.out.println("\n" + fone);
		
	}
}
