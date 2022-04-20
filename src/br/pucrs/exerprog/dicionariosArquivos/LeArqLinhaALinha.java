package br.pucrs.exerprog.dicionariosArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;



public class LeArqLinhaALinha implements Iterable<String> {

	private class MyIterator implements Iterator<String>  {

		private BufferedReader arq;
		
		public MyIterator(String nm) {
			try {
				arq = new BufferedReader(new FileReader(nm));
			}
			catch(IOException ex) {
				try {
				arq.close();
				}
				catch (IOException ex1) {
					ex1.printStackTrace();
					System.exit(-2);
				}
			}
		}
		@Override
		public boolean hasNext() {
			throw new RuntimeException();
		}

		@Override
		public String next() {
			String res = null;
			
			try{ 
				res = arq.readLine();
			}
			catch (IOException ex){
				ex.printStackTrace();
				System.exit(-1);
			}
			
			return res;
		}

	}
	private FileReader arq;
	private BufferedReader bufArq;
	private String nome;

	public LeArqLinhaALinha(String nm) {
		nome = nm;
	}
	@Override
	public Iterator<String> iterator() {
		return new MyIterator(nome);
	}

}
