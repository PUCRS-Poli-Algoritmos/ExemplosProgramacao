package br.pucrs.exerprog.conjuntos;

import java.util.*;

public class OperListasComConjuntos<A> {

	public List<A> union(List<A> l1, List<A> l2) {
		List<A> res = new LinkedList<>();
		Set<A> auxSet = new HashSet<>(l1);
		//Set<A> auxSet = new LinkedHashSet<>(l1);
		
		auxSet.addAll(l2);
		
		res.addAll(auxSet);
		return res;
	}

	public List<A> intersect(List<A> l1, List<A> l2) {
		List<A> res = new LinkedList<>();
		Set<A> estaEmL1 = new HashSet<>(l1);
//		Set<A> estaEmL1 = new LinkedHashSet<>(l1);
		Set<A> resSet = new HashSet<>();
//		Set<A> resSet = new LinkedHashSet<>();
		
		for (A aux:l2) 
			if (estaEmL1.contains(aux))
				resSet.add(aux);
		
		res.addAll(resSet);
		return res;
	}


}
