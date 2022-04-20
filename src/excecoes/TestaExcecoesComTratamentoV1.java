package excecoes;

public class TestaExcecoesComTratamentoV1 {

		  public static void testa(String ...args){
		    ImpString s1=null, s2=null;
		    int n=0;
		    try{
		      s1 = new ImpString(args[0]);
		      s2 = new ImpString(args[1]);
		      n  = Integer.parseInt(args[2]);
		    }
		    catch(Exception e){
		      System.out.println("Erro ao processar entradas");
		      System.exit(0);
		    }
		    
		    try{
		        s1.impSep(n);
		        s1.impInv(n);
		        s2.impSep(n);
		        s2.impInv(n);
		      }
		      catch(Exception e){
		        System.out.println("Valor inválido");
		        System.exit(0);
		      }
		      System.out.println("Fim do processamento");
		    }
		  
		  public static void main(String args[]) {
			  System.out.print("TestePoilmorfismo 1:");
			  testa("TestePoilmorfismo", "Excecoes", "4");
			  
			  System.out.print("TestePoilmorfismo 2:");
			  testa("TestePoilmorfismo", "Excecoes", "10");
			  
			  System.out.print("TestePoilmorfismo 3:");
			  testa("TestePoilmorfismo", "Excecoes", "TestePoilmorfismo");
			  
			  System.out.print("TestePoilmorfismo 4:");
			  testa("TestePoilmorfismo");
			  
		  }

}
