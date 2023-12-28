package oefening6;

import oefening6.passagier.*;
import oefening6.vlucht.OnbekendePassagierExceptie;
import oefening6.vlucht.PassagierReedsAanwezigExceptie;
import oefening6.vlucht.Vlucht;

public class Main {

    public static void main(String[] args) {
        Vlucht vlucht = new Vlucht(1.0);

        EconomyPassagier erik = new EconomyPassagier("Erik");
        BusinessPassagier jelle = new BusinessPassagier("Jelle");

        VIPPassagier ruben = new VIPPassagier("Ruben");
        ruben.toevoegenVoucher(new Voucher("Cola", 1));
        ruben.toevoegenVoucher(new Voucher("Cola", 1));

        try {

            vlucht.boarding(erik, "A1");

            vlucht.boarding(jelle, "A2");

            vlucht.boarding(ruben, "A3");

            vlucht.boarding(jelle, "A4");

        } catch (PassagierReedsAanwezigExceptie passagierReedsAanwezigExceptie) {
            System.out.println(passagierReedsAanwezigExceptie.getMessage());
        }

        try {

            Passagier gevondenPassagier = vlucht.zoek(ruben);
            gevondenPassagier.geefSpecifiekeInfo();

            Passagier dezeZalNietGevondenWorden = vlucht.zoek(new VIPPassagier("Jonny"));

        } catch (OnbekendePassagierExceptie onbekendePassagierExceptie) {
            System.out.println(onbekendePassagierExceptie.getMessage());
        }
    }
}
