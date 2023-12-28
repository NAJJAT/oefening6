package oefening6.vlucht;

public class OnbekendePassagierExceptie extends Exception {

    public OnbekendePassagierExceptie(String naam) {
        super(naam + " is een onbekende passagier!");
    }
}
