package excecoes;

public class DemoSemTrat {
	public static double divide(int a,int b) {
		double resp = a/b; // se b == 0 lança ArithmeticException 
		return (resp);
	}

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		double result = divide(n1,n2);
		System.out.println("Resultado: "+result);
	}

}
