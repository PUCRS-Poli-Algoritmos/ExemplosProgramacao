package br.pucrs.exerprog.lambdastream;

class CheckOlder_60 implements CheckPerson {
    public boolean test(Person p) {
        return p.age() >= 60; }
}
