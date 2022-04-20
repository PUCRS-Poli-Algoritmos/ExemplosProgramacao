package br.pucrs.exerprog.lambdastream;

public class Person {
    public enum Sex { MALE,FEMALE }
    private String nome;
    private int idade;
    private Sex sexo;

    public Person(String nome, int idade,Sex sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String name() {return nome;}

    public int age() {return idade;}

    public Sex gender(){return sexo;}

    @Override
    public String toString() {
    	return nome + "-" +
    			idade + "-" +
    			sexo;
 }
}
