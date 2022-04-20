package excecoes;

public class ImpString {
	private String str;
	public ImpString(String s){
		str = s;
	}
	public void impSep(int n){
		String aux = "";
		for(int i=0; i<n; i++){
			aux = aux + str.charAt(i);
			if (i < n-1) 
				aux = aux + '-';
		}
		System.out.println(aux); 
	}
	
	public void impInv(int n){
		String aux = "";
		for(int i=n-1; i>=0; i--)
			aux = aux + str.charAt(i);
		System.out.println(aux);
	}
}
