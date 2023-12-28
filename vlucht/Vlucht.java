package oefening6.vlucht;

import oefening6.passagier.Passagier;

import java.util.Map;
import java.util.TreeMap;

public class Vlucht {

    private final double identificatienummer;
    private Map<Passagier, String> passagiers;

    public Vlucht(double identificatienummer) {
        this.identificatienummer = identificatienummer;
        passagiers = new TreeMap<>();
    }

    public double getIdentificatienummer() {
        return identificatienummer;
    }

    public void boarding(Passagier p, String plaats) throws PassagierReedsAanwezigExceptie {
        if (passagiers.put(p, plaats) != null) {
            throw new PassagierReedsAanwezigExceptie(p.getNaam());
        }
    }

    public Passagier zoek(Passagier p) throws OnbekendePassagierExceptie {
        if (passagiers.containsKey(p)) {
            return p;
        } else {
            throw new OnbekendePassagierExceptie(p.getNaam());
        }
    }

}
