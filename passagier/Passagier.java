package oefening6.passagier;

public abstract class Passagier implements Comparable<Passagier> {

    protected String naam;

    public Passagier(String naam) {
        this.naam = naam;
    }

    public abstract void geefSpecifiekeInfo();

    @Override
    public int compareTo(Passagier o) {
        return this.naam.compareTo(o.naam);
    }

    public String getNaam() {
        return naam;
    }
}
