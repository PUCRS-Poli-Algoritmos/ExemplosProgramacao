package br.pucrs.exerprog.dicionariosArquivos;


public class TabelaPalavras {
	private class Entry {
		private String pal;
		private Integer nro;
		public String getPal() {
			return pal;
		}
		public void setPal(String pal) {
			this.pal = pal;
		}
		public Integer getNro() {
			return nro;
		}
		public void setNro(Integer nro) {
			this.nro = nro;
		}


	}
	private int maxTab;
	private Entry [] tabPalavra;
	private int qtdPal = 0;

	public TabelaPalavras(int max) {
		maxTab = max;
		tabPalavra = new Entry[maxTab];
	}

	private void increaseTab() {
		int novoMax = maxTab + (maxTab / 2);
		Entry[] novo = new Entry[novoMax];

		for (int i = 0; i < maxTab; i++)
			novo[i] = tabPalavra[i];

		maxTab = novoMax;
		tabPalavra = novo;
	}

	private int procuraPal(String pal) {
		int i;

		for (i = 0; i < qtdPal && !tabPalavra[i].getPal().equals(pal); i++);

		if (i < qtdPal)
			return i;
		else
			return -1;
	}

	public boolean addPalavra(String p) {
		boolean res = false;
		Integer nroPal, pos;

		if (qtdPal == maxTab)
			increaseTab();

		pos = procuraPal(p);

		if (pos != -1) {
			nroPal = tabPalavra[pos].getNro();
			nroPal++;
		}
		else {
			nroPal = 1;
			pos = qtdPal;
			qtdPal++;
		}
		
		tabPalavra[pos] = new Entry();
		tabPalavra[pos].setNro(nroPal);
		tabPalavra[pos].setPal(p);


		return true;
	}

	public Integer getNroOcorrencias(String pal) {
		Integer res, pos;

		pos = procuraPal(pal);

		if (pos != -1) 			
			res = tabPalavra[pos].getNro();
		else
			res = 0;

		return res;
	}

}
