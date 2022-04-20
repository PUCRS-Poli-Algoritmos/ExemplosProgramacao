package interfaceEx.formasGeometricas;

public class Quadrado implements PrimitivaGrafica {
	private Ponto p1, p2;
	private int espessura;
	
	public Quadrado(Ponto p1, Ponto p2, int espessura) {
		this.p1 = p1;
		this.p2 = p2;
		setEspessura(espessura);
	}
	
	@Override
	public double area() {
		double res = 0;
		double lado, x1, x2, y1, y2;
		
		x1 = p1.getX();
		x2 = p2.getX();
		y1 = p1.getY();
		y2 = p2.getY();
		
		lado = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		return lado * lado;
	}
	@Override
	public void setEspessura(int e) {
		espessura = e;
	}
	@Override
	public String getNome() {
		return "Quadrado";
	}
	
	public int getEspessura() {
		return espessura;
	}
	
	public Ponto getP1() {
		return p1;
	}
 
	public Ponto getP2() {
		return p2;
	}
	
	public String toString() {
		return "Chamou Quadrado";
	}
}
