/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceEx.paisComparador;

import java.util.Comparator;

/**
 *
 * @author flash
 */
public class PaisComparadorNome implements Comparator<Pais> {

    public int compare(Pais o1, Pais o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
    
}
