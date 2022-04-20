package br.pucrs.exerprog.dicionarios;

import java.util.*;

public class Agenda {
	private Map<String, String> agenda = new HashMap<>();
//	private Map<String, String> agenda = new LinkedHashMap<>();
	
//	public void cadastra(String nome, String fone) throws IllegalArgumentException {
	public void cadastra(String nome, String fone)  {
		if (nome == null || fone == null || nome.equals("") || fone.equals(""))
			throw new IllegalArgumentException();
		else if (agenda.containsKey(nome))
				throw new IllegalArgumentException();
		else agenda.put(nome, fone);
		}
	
	public String busca(String nome){
		return agenda.get(nome);
	}
	
	public String remove(String nome) {
		return agenda.remove(nome);
	}
	
	public List<Map.Entry<String, String>> buscaTodos() {
		List<Map.Entry<String, String>> res = new ArrayList<>();
		Set<Map.Entry<String, String>> set = new HashSet<>();
		
		set = agenda.entrySet();
		
		res.addAll(set);
		
		return res;
	}
}

