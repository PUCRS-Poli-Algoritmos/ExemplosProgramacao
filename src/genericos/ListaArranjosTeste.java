package genericos;

public class ListaArranjosTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListaArranjos<String> l1 = new ListaArranjos<>(30);
		
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		System.out.println(l1);
		
		l1.add(0,"X");
		System.out.println(l1);
		
		l1.add(3, "Y");
		System.out.println(l1);
		
		l1.add(6, "Z");
		System.out.println(l1);
		
		l1.add(8, "W");
		System.out.println(l1);
		
		l1.remove(3);
		System.out.println(l1);

		l1.remove(0);
		System.out.println(l1);
		
		l1.remove(4);
		System.out.println(l1);

		l1.remove(4);
		System.out.println(l1);

		l1.remove(0);
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		l1.remove(0);		
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		

	}

}
