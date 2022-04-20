package excecoes;

public class DemoVerficada {
	public static void f1() throws InterruptedException{
//	public void f1() {
	    System.out.println("Espere um pouco ...");
	    Thread.sleep(2000);
	    System.out.println("Obrigado");
	}
	
	public static void main(String argc[]) {
		try {
			f1();
		}
		catch (InterruptedException e) {
			
		}
	}

}
