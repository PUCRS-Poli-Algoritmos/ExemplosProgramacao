package genericos;

public class ListaArranjos<E> {
	private E [] lista;
	private int qtde = 0;
	
	public ListaArranjos() {
		this(20);
	}
	
	public ListaArranjos(int tam){
		
		if (tam <= 0)
			tam = 20;
		
//		lista = new E[tam];
		lista = ((E[]) new Object[tam]);
	}
	
	public boolean add(E c) {
		boolean res = true;
		
		if (c == null)
			res = false;
		else if (qtde == lista.length)
				res = false;
			 else {
				 lista[qtde] = c;
				 qtde++;
		}
		return res;
	}
	
	public boolean add(int pos, E c) {
		boolean res = true;
		
		if (c == null || pos < 0 || pos > qtde || qtde == lista.length)
			res = false;
		else {
			for (int i = qtde-1; i >= pos; i--)
				lista[i+1] = lista[i];
			
			lista[pos] = c;
			qtde++;
		 }
		
		return res;
	}
	
	public E get(int pos) {
		E res = null;
		
		if (pos >=0 && pos < qtde)
			res = lista[pos];
				
		return res;
	}

	
	public boolean remove(int pos){
		boolean res = true;
		
		int i;
		
		if (pos >= 0 && pos < qtde) {
			for (int j = pos; j < qtde-1; j++)
				lista[j] = lista[j+1];
			
			qtde--;
		}
		else
			res = false;
			
		return res;
	}

	public String toString(){
		String res = "->";
		
		for (int i = 0; i < qtde; i++)
			res = res + lista[i].toString() + " ";
		
		res = res + "\n";
		
		return res;
	}
}
