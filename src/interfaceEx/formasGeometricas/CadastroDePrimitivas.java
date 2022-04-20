package interfaceEx.formasGeometricas;

import java.util.*;
public class CadastroDePrimitivas {

	private ArrayList<PrimitivaGrafica> cad = new ArrayList<>(); 

	public void addPrimitiva(PrimitivaGrafica p) {
		cad.add(p);
	}

	public String toString() {
		String res = "";
		
		for (PrimitivaGrafica p: cad) {
			res += p.getNome();
			
			if (p instanceof Circulo) {
				res += " com centro em (" +
			           ((Circulo)p).getCentro().getX() + 
			           ", " +
			           ((Circulo)p).getCentro().getX() + ") e raio " +
			           ((Circulo)p).getRaio();
			}
			else if (p instanceof Ponto) {
				
			}
			else if (p instanceof Quadrado) {
				
			}
		}
		
		return res;
	}

	public static  void main(String [] args) {
		PrimitivaGrafica pr1, pr2, pr3;
		ArrayList<PrimitivaGrafica> cad = new ArrayList<>();
		
		pr1 = new Ponto(1,1);
		pr2 = new Circulo(new Ponto(2,2), 3.0, 2);
		pr3 = new Quadrado(new Ponto(3,3), new Ponto(5,5), 3);
		
		cad.add(pr1);
		cad.add(pr2);
		cad.add(pr3);
		
		for (PrimitivaGrafica pr:cad) {
			System.out.println("Nome: " + pr.getNome());
			System.out.println("Area: " + pr.area());
			System.out.println(pr);
		}
		
	}
}
