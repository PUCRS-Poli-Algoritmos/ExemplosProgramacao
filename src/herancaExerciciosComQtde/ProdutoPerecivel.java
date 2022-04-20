package herancaExerciciosComQtde;

import java.time.*;

public class ProdutoPerecivel extends Produto {
	private LocalDate dataValidade;
	
	public ProdutoPerecivel(String c, String d, int q, LocalDate dt) {
		super(d, d, q);
		dataValidade = dt;
	}
	
	public int retiraEstoque(int n, LocalDate dtCorrente) {
		int res = n;
		Period difDate = Period.between(dtCorrente, dataValidade);
		
		if (difDate.getMonths() > 2 || (difDate.getMonths() == 2 && difDate.getDays() > 0))
			res = 0;
		else
			res = super.retiraEstoque(n);
		
		return res;
	}
	
	//
	// É necessário sobrescrever a original. Se não, temos comportamento 
	//    inconsistente.
	//
	@Override
	public int retiraEstoque(int n) {
		return retiraEstoque(n, LocalDate.now());
	}
	
	public void colocaEstoque(int n, LocalDate dtCorrente){
		if (dtCorrente.equals(dataValidade))
			super.colocaEstoque(n);		
	}
	//
	// É necessário sobrescrever a original. Se não, temos comportamento 
	//    inconsistente.
	//
	public void colocaEstoque(int n) {
		colocaEstoque(n, LocalDate.now());
	}
	
	public String toString() {
		return super.toString() + "\n\tData de Validade: " + dataValidade;
	}

}
