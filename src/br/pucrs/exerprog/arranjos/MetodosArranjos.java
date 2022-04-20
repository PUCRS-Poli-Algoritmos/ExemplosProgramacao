package br.pucrs.exerprog.arranjos;

public class MetodosArranjos {
	public String exibeTudo(int [] ar){
		StringBuffer res = new StringBuffer("");
		int nroElem = 0;
		
		for (int i = 0; i < ar.length; i++){
			nroElem++;
			if (nroElem >=20){
				res.append('\n');
				nroElem = 0;
			}
			res.append(ar[i]);
			res.append(' ');
		}
		
		return res.toString();
	}

	public void initArranjo(int [] ar, int valor) {
		if (ar != null)
			for (int i = 0; i < ar.length; i++)
				ar[i] = valor++;
	}
	
	public String arrayToString(int [] ar) {
		String str = "";
		
		for (int i: ar)
			str += i + " ";
		
		return str;
	}

}
