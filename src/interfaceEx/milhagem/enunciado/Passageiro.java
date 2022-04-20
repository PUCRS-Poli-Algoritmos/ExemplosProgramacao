package interfaceEx.milhagem.enunciado;


public class Passageiro {
    int nroBilhete;
    String nome;
    String docIdentidade;
    
	public Passageiro(String docIdentidade, String nome, int nroBilhete) {
		super();
		this.docIdentidade = docIdentidade;
		this.nome = nome;
		this.nroBilhete = nroBilhete;
	}
	
	public int getNroBilhete() {
		return nroBilhete;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDocIdentidade() {
		return docIdentidade;
	}
	
	public String toString(){
		return(getNroBilhete()+", "+getNome()+", "+getDocIdentidade());
	}
}
