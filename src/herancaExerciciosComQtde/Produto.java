package herancaExerciciosComQtde;

public class Produto {
	private String cod;
	private String descricao;
	private int qtde;
	
	public Produto(String c, String d, int q) {
		cod = c;
		descricao = d;
		qtde = q;
	}
	
	public String getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public void colocaEstoque(int n) {
		if (n >= 0)
			qtde += n;
	}
	
	public int retiraEstoque(int n) {
		int res = n;
		
		if (n >= 0) 
			if (n < qtde)
				qtde -= n;
			else {
				res = qtde;
				qtde = 0;
			}
		
		return res;
	}
	
	public String toString() {
		return "Codigo: " + getCod() +
				"\n\tDescrição: " + getDescricao() +
				"\n\tQuantidade: " + qtde;
	}
}
