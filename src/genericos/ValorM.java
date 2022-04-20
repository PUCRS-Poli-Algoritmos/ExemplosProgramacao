package genericos;

public class ValorM<V> { 
	private String unidade;
	private V val;

	public ValorM(String u, V val) {
		super();
		this.unidade = u;
		this.val = val;
	}
	
	public V getVal() {
		return val;
	}
	
	public String getUnidade() {
		return unidade;
	}
	
	public String toString() {
		return "[" + unidade + val + "]";
	}
}
