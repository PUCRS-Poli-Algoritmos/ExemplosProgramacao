package br.pucrs.exerprog.conjuntos;

import java.util.*;

public class OperListasSemConjuntos<A> {
	public List<A> union(List<A> l1, List<A> l2) {
		List<A> res = new LinkedList<>();
		
		for (A aux:l1)
			if (!res.contains(aux))
				res.add(aux);
		
		for (A aux:l2)
			if (!res.contains(aux))
				res.add(aux);
		return res;
	}

	public List<A> intersect(List<A> l1, List<A> l2) {
		List<A> res = new LinkedList<>();

		for (A auxL1:l1)
			if (!res.contains(auxL1) && l2.contains(auxL1))
				res.add(auxL1);

//		for (A auxL2:l2)
//			if (!res.contains(auxL2) && l1.contains(auxL2))
//				res.add(auxL2);

		return res;
	}

}
