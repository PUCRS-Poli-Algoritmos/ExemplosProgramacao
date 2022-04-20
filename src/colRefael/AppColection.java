package colRefael;

public class AppColection {
    public static void main(String[] args) {
        System.out.println("Inicio");
        ColecaoEncadeada c = new ColecaoEncadeada();
        c.addFirst("A");
        System.out.println("1");
        System.out.println(c);
        c.addFirst("B");
        System.out.println("2");
        System.out.println(c);
        c.addFirst("C");
        System.out.println("3");
        System.out.println(c);
    }
}

