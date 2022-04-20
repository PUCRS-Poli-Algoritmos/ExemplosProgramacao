package br.pucrs.exerprog.lambdastream;

class CheckMale18_25 implements CheckPerson {
    public boolean test(Person p) {
        return (p.gender()==Person.Sex.MALE &&
            p.age() >= 18 &&
            p.age() <= 25);
    }
}
