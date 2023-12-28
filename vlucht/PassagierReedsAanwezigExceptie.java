package oefening6.vlucht;

public class PassagierReedsAanwezigExceptie extends Exception {

    public PassagierReedsAanwezigExceptie(String naam) {
        super("De Passagier met naam '" + naam + "' is reeds aanwezig op deze vlucht!");
    }
}
