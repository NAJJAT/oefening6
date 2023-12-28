package oefening6.passagier;

public class EconomyPassagier extends Passagier {

    public EconomyPassagier(String naam) {
        super(naam);
    }

    @Override
    public void geefSpecifiekeInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return this.naam + " van het type " + this.getClass().getSimpleName();
    }
}
