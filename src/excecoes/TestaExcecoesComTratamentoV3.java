package excecoes;

public class TestaExcecoesComTratamentoV3 {

	public static void testa(String... args){
		ImpString s1=null, s2=null;
		int n=0;
		try {
			s1 = new ImpString(args[0]);
			s2 = new ImpString(args[1]);
			n  = Integer.parseInt(args[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Sintaxe:<string><string><int>");
			return;
		}
		catch(NumberFormatException e){
			System.out.println("�ltimo par�metro deve ser int");
		return;
		}
		try{
			s1.impSep(n);
			s1.impInv(n);
			s2.impSep(n);
			s2.impInv(n);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("�ltimo argumento deve ser menor que o tamanho das palavras");
			return;
		}
		System.out.println("Fim do processamento");
	}

	public static void main(String args[]) {
		try{
			System.out.println("\nTeste 1:");
			testa("TestePoilmorfismo", "Excecoes", "4");
		}
		catch (Exception e) {
			System.out.println("Exce��o no TestePoilmorfismo 1!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try{
			System.out.println("\nTeste 2:");
			testa("TestePoilmorfismo", "Excecoes", "10");
		}
		catch (Exception e) {
			System.out.println("Exce��o no TestePoilmorfismo 2!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try{
			System.out.println("\nTeste 3:");
			testa("TestePoilmorfismo", "Excecoes", "TestePoilmorfismo");
		}
		catch (Exception e) {
			System.out.println("Exce��o no TestePoilmorfismo 1!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try{
			System.out.println("\nTeste 4:");
			testa("TestePoilmorfismo");
		}
		catch (Exception e) {
			System.out.println("Exce��o no TestePoilmorfismo 1!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
