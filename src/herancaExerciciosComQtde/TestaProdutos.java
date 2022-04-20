package herancaExerciciosComQtde;

public class TestaProdutos {

	public static void main(String[] args) {
		Produto pr1, pr2, pr3, pr4;
		ProdutoPerecivel prpe1, prpe2;
		
		pr1 = new Produto("0001", "Carne Solta", 10);
		pr2 = new Produto("0002", "Presilhas", 5);
		System.out.println("Pr1: " + pr1);
		System.out.println("Pr2: " + pr2);
		
		pr3 = new Produto("0003", "Peixe", 30);
		pr4 = new ProdutoPerecivel("0004", "Frutas", 25, null);
		
		prpe1 = (ProdutoPerecivel)pr4;
		
		System.out.println(pr4);
		
//		System.out.println("Descrição do pr1':" + pr1.descricao);
//		System.out.println("Descrição do pr1':" + pr1.getDescricao());
//		pr1.descricao = "Nova Descrição";
//		System.out.println("Descrição do pr1':" + pr1.descricao);
//		System.out.println("Descrição do pr1':" + pr1.getDescricao());
//		System.out.println("Pr1: " + pr1);
		
//		pr1.retiraEstoque(20);
//		System.out.println("Pr1 retirando 20: " + pr1);
//		
//		pr1.retiraEstoque(12);
//		System.out.println("Pr1 retirando 12: " + pr1);
//		
//		pr1.colocaEstoque(12);
//		System.out.println("Pr1 colocando 12: " + pr1);
//
//		pr2.retiraEstoque(-1);
//		System.out.println("Pr2 retirando -1: " + pr2);
//		
//		pr2.retiraEstoque(0);
//		System.out.println("Pr2 retirando 0: " + pr2);
//		
//		pr2.colocaEstoque(0);
//		System.out.println("Pr2 colocando 0: " + pr2);
//		
//		pr2.colocaEstoque(-2);
//		System.out.println("Pr2 colocando -1: " + pr2);
	}

}
