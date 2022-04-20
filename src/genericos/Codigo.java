package genericos;

public class Codigo {
	private String setor;
	private Integer codigo;
	
	public Codigo(String s, Integer c){
		this.codigo = c;
		this.setor = s;
	}

	public String getSetor() {
		return setor;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	public String toString() {
		return "Codigo{" + "setor=" + getSetor() +
				", codigo=" + getCodigo() + "}";		
	}
}
