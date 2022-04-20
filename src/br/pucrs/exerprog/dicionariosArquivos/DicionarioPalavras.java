package br.pucrs.exerprog.dicionariosArquivos;

import java.util.*;


public class DicionarioPalavras {
	private Map<String, Integer> dicPalavra = new HashMap<>();
	
	public boolean addPalavra(String p) {
		boolean res = false;
		Integer nroPal;
		
		nroPal = dicPalavra.get(p);
		
		if (nroPal != null)
			nroPal++;
		else 
			nroPal = 1;
		
		dicPalavra.put(p, nroPal);
		
		return true;
	}
	
	public int getNroOcorrencias(String pal) {
		Integer res = dicPalavra.get(pal);
		
		if (res == null)
			res = 0;
		
		return res;
	}

}
