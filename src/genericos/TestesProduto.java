package genericos;

public class TestesProduto {

	public static void main(String[] args) {
		ProdutoG<Codigo> p0 = new ProdutoG<>(new Codigo("set", 001), "descricao", 100.0);
		
		ProdutoG<CodigoVar<String, Integer>> pr = new ProdutoG<>(new CodigoVar<String, Integer>("set", 001), "descricao", 100.0);

		ProdutoG2P<Integer,Float> p1 = new ProdutoG2P<>(112,"TV",1276F);
		ProdutoG2P<String,Integer> p2 = new ProdutoG2P<>("AB","TV",1276);
		
		ProdutoG2P<CodigoVar<String, Integer>,ValorM<Double>> p3 = 
				new ProdutoG2P<>(new CodigoVar<String, Integer>("eletro", 234),"TV",
								 new ValorM("R$", 300.0));
		
		System.out.println("ProdutoG com Codigo: " + p0);
		System.out.println("ProdutoG com Codigo Variavel: " + pr);
		System.out.println("ProdutoG2P: " + p1);
		System.out.println("ProdutoG2P: " + p2);
		System.out.println("ProdutoG2P com codigo e valor: " + p3);
		

	}

}
