package genericos;

public class CodigoVar<S, C> {
	private S setor;
	private C codigo;
	
	public CodigoVar(S s, C c){
		this.codigo = c;
		this.setor = s;
	}

	public S getSetor() {
		return setor;
	}

	public C getCodigo() {
		return codigo;
	}
	
	public String toString() {
		return "Codigo{" + "setor=" + getSetor() +
				", codigo=" + getCodigo() + "}";		
	}
}
