/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceEx.paisComparador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author flash
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> lista = new ArrayList<String>();

        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Felipe");
        lista.add("Aarão");

        Collections.sort(lista);

        for(String s : lista)
            System.out.println(s);

        System.out.println();

        List<Pais> lista2 = new ArrayList<Pais>();
        lista2.add(new Pais("Brasil",1200));
        lista2.add(new Pais("Argentina",60));
        lista2.add(new Pais("Uruguai",20));
        lista2.add(new Pais("Israel",5));
        lista2.add(new Pais("Estados Unidos",3200));
        Collections.sort(lista2);
        
        for(Pais p : lista2)
            System.out.println(p);

        Collections.sort(lista2, new PaisComparadorArea());

        System.out.println();

        for(Pais p : lista2)
            System.out.println(p);
    }

}
