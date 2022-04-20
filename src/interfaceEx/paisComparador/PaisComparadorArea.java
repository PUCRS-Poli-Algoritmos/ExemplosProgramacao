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
public class PaisComparadorArea implements Comparator<Pais>
{

    public int compare(Pais o1, Pais o2) {
        return (int) (o1.getArea() - o2.getArea());
    }

}
