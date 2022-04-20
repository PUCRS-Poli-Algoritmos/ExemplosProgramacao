package interfaceEx.milhagem.solucao;

import interfaceEx.milhagem.enunciado.Passageiro;

public class Funcionario extends Passageiro {

	private String matricula = null;
	
	public Funcionario(String docIdentidade, String nome, int nroBilhete, String matr) {
		super(docIdentidade, nome, nroBilhete);
		matricula = matr;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
