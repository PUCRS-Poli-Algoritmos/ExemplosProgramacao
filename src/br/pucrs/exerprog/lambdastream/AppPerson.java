package br.pucrs.exerprog.lambdastream;
import java.util.List;
import java.util.LinkedList;
public class AppPerson {

	public static void printPersons(List<Person> lstPess, CheckPerson tester) {
	    for (Person p : lstPess){
	        if (tester.test(p)){
	            System.out.println(p);
	        }
	    }
	}
	public static void main(String[] args) {
		List<Person> pessoas = new LinkedList<>();
		CheckPerson l1 = (Person p) -> p.gender() == Person.Sex.MALE;
		
		pessoas.add(new Person("João", 18, Person.Sex.MALE));
		pessoas.add(new Person("José", 24, Person.Sex.MALE));
		pessoas.add(new Person("Paulo", 25, Person.Sex.MALE));
		pessoas.add(new Person("Pedro", 72, Person.Sex.MALE));
		pessoas.add(new Person("Tiago", 65, Person.Sex.MALE));
		pessoas.add(new Person("Maria", 20, Person.Sex.FEMALE));
		pessoas.add(new Person("Joana", 25, Person.Sex.FEMALE));
		pessoas.add(new Person("Paula", 28, Person.Sex.FEMALE));
		pessoas.add(new Person("Ana", 50, Person.Sex.FEMALE));
		pessoas.add(new Person("Luiza", 60, Person.Sex.FEMALE));
		pessoas.add(new Person("Carina", 70, Person.Sex.FEMALE));
		
		System.out.println("Entre 18 e 25:");
		printPersons(pessoas, new CheckMale18_25());
		System.out.println("\nMais que 60:");
		printPersons(pessoas, new CheckOlder_60());
		System.out.println("\nMALE:");
		printPersons(pessoas, l1);
		System.out.println("\nFEMALE:");
		printPersons(pessoas, (Person p) -> p.gender() == Person.Sex.FEMALE);
	}

}
