package oefening6.passagier;

public class BusinessPassagier extends GeprivilegieerdePassagier {

    public BusinessPassagier(String naam) {
        super(naam);
    }

    @Override
    public void geefSpecifiekeInfo() {
        System.out.println(this.toString() + " en heeft volgende vouchers: " + this.vouchers);
    }

    @Override
    public String toString() {
        return this.naam + " van het type " + this.getClass().getSimpleName();
    }
}
