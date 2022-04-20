package br.pucrs.exerprog.arranjos;

public class TestaCadContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CadastroDeContas cad = new CadastroDeContas();
		
		cad.novaConta(new ContaCorrente(1, 100.0));
		cad.novaConta(new ContaCorrente(10, 1000.0));
		cad.novaConta(new ContaCorrente(2, 10.0));
		cad.novaConta(new ContaCorrente(20, 120.0));
		cad.novaConta(new ContaCorrente(3, 200.0));
		cad.novaConta(new ContaCorrente(30, 30000.0));
		cad.novaConta(new ContaCorrente(234, 1.0));
		
		System.out.println("Todas as contas");
		System.out.println(cad);
		
		System.out.println(cad.getConta(1));
		System.out.println(cad.getConta(20));
		System.out.println(cad.getConta(400));

		System.out.println("\n\nRemove contas:");
		System.out.println("20 -> " + cad.remove(20));
		System.out.println("Todas: \n" + cad);
		System.out.println("234 -> " + cad.remove(234));
		System.out.println("Todas: \n" + cad);
		System.out.println("1 -> " + cad.remove(1));
		System.out.println("Todas: \n" + cad);
		System.out.println("500 -> " + cad.remove(500));
		System.out.println("Todas: \n" + cad);

		System.out.println("\n\nTestando o getConta");
		System.out.println(cad.getContaOpt(30));
		System.out.println("Todas: \n" + cad);
		System.out.println(cad.getContaOpt(30));
		System.out.println("Todas: \n" + cad);
		System.out.println(cad.getContaOpt(30));
		System.out.println("Todas: \n" + cad);
		System.out.println(cad.getContaOpt(30));
		System.out.println("Todas: \n" + cad);
		System.out.println(cad.getContaOpt(30));
		System.out.println("Todas: \n" + cad);
		System.out.println(cad.getContaOpt(30));
		System.out.println("Todas: \n" + cad);
		
		ContaCorrente [] ctaAuxRef = cad.getRefArrayCC();
		ContaCorrente [] ctaAuxCop = cad.getCopiaArrayCC();
		
		cad.novaConta(new ContaCorrente(9999, 100000.0));
		cad.novaConta(new ContaCorrente(8888, 100000.0));
		
		System.out.println("Cadastro da contas:\n" + cad);
		
		System.out.println("Ref do cadastro de contas:");
		int cont = 0;
		for (ContaCorrente c:ctaAuxRef){
			System.out.print(c + " ");
			cont++;
			if (cont >= cad.getQtdContas())
				break;
		}
		
		System.out.println("\n\n Copia do cadastro de contas:");
		cont = 0;
		for (ContaCorrente c:ctaAuxCop){
			System.out.print(c + " ");
			cont++;
			if (cont >= cad.getQtdContas())
				break;
		}
		

	}

}
