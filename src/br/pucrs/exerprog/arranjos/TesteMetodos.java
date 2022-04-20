package br.pucrs.exerprog.arranjos;

public class TesteMetodos {
	public static void main(String [] argc) {
//		um método que recebe um arranjo de inteiros e um 
//		número interio, e inicializa este arranjo com uma 
//		sequência de números. Esta sequência inicia-se no 
//		passado por parâmetro, e tem cada número da sequência 
//		incrementado de 1 em 1;
		MetodosArranjos met = new MetodosArranjos();
		
		int [] ar = new int[10];
		met.initArranjo(ar, 100);
		System.out.println(met.exibeTudo(ar));
		
//		Um método que recebe um arranjo de inteiros, 
//		e retorna uma String formatada com o conteúdo deste arranjo;
		
		System.out.println(met.arrayToString(ar));
	
	}
}
