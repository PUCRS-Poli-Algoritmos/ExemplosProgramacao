/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceEx.paisComparador;

/**
 *
 * @author flash
 */
public class Pais implements Comparable<Pais>
{

    private String nome;
    private double area;

    public Pais(String nome, double area) {
        this.nome = nome;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public String getNome() {
        return nome;
    }

    public int compareTo(Pais o) {
        return nome.compareTo(o.getNome());
    }

    public String toString()
    {
        return nome + " ("+area+")";
    }
}
