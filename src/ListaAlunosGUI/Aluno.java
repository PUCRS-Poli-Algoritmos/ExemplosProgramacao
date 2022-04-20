package ListaAlunosGUI;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private int matr;
	
	public int getMatr() {
		return matr;
	}
	public void setMatr(int matr) {
		this.matr = matr;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int compareTo(Aluno a)
	{
		int res;
		
		if (getMatr() == a.getMatr())
			res = 0;
		else if (getMatr() < a.getMatr())
			res = -1;
			//res = getMatr() - a.getMatr();
		else
			res = +1;
			//res = a.getMatr() - getMatr();
		
		return res;
	}
	
	public String toString()
	{
		return("Matr = " + getMatr() + " - Nome = " + getNome());
	}

}
