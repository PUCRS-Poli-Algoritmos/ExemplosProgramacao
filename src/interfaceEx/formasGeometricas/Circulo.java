package interfaceEx.formasGeometricas;

public class Circulo implements PrimitivaGrafica {
	
	private Ponto centro;
	private double raio;
	private int espessura;
	
	public Circulo(Ponto centro, double raio, int espessura) {
		this.centro = centro;
		this.raio = raio;
		setEspessura(espessura);
	}

	@Override
	public double area() {
		return PI * raio * raio;
	}

	@Override
	public void setEspessura(int e) {
		this.espessura = e;
	}

	@Override
	public String getNome() {
		return "Circulo";
	}

	public Ponto getCentro() {
		return centro;
	}

	public double getRaio() {
		return raio;
	}

	public int getEspessura() {
		return espessura;
	}
	
	public String toString() {
		return "Chamou Circulo";
	}
}
