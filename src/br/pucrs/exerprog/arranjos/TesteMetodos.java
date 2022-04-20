package br.pucrs.exerprog.arranjos;

public class TesteMetodos {
	public static void main(String [] argc) {
//		um m�todo que recebe um arranjo de inteiros e um 
//		n�mero interio, e inicializa este arranjo com uma 
//		sequ�ncia de n�meros. Esta sequ�ncia inicia-se no 
//		passado por par�metro, e tem cada n�mero da sequ�ncia 
//		incrementado de 1 em 1;
		MetodosArranjos met = new MetodosArranjos();
		
		int [] ar = new int[10];
		met.initArranjo(ar, 100);
		System.out.println(met.exibeTudo(ar));
		
//		Um m�todo que recebe um arranjo de inteiros, 
//		e retorna uma String formatada com o conte�do deste arranjo;
		
		System.out.println(met.arrayToString(ar));
	
	}
}
