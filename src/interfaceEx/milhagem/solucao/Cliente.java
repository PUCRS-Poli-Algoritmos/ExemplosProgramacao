package interfaceEx.milhagem.solucao;

import interfaceEx.milhagem.enunciado.CategoriaMilhagem;
import interfaceEx.milhagem.enunciado.Milhagem;
import interfaceEx.milhagem.enunciado.Passageiro;

public class Cliente extends Passageiro implements Milhagem {

	private CategoriaMilhagem cat =null;
	
	public Cliente(String docIdentidade, String nome, int nroBilhete, CategoriaMilhagem cat) {
		super(docIdentidade, nome, nroBilhete);
		if (cat != null)
			this.cat = cat;
		else
			cat = CategoriaMilhagem.None;
	}

	@Override
	public boolean isMembroProgramaMilhagem() {
		if (cat.equals(CategoriaMilhagem.None))
			return false;
		else
			return true;
	}

	@Override
	public CategoriaMilhagem getCategoriaMilhagem() {
		return cat;
	}

	public void setCategoriaMilhagem(CategoriaMilhagem cat) {
		this.cat = cat;
	}
}
