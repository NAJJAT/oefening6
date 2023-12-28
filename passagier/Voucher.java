package oefening6.passagier;

public class Voucher {

    private String naamDrankje;
    private int identificatieNummer;

    public Voucher(String naamDrankje, int identificatieNummer) {
        this.naamDrankje = naamDrankje;
        this.identificatieNummer = identificatieNummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voucher voucher = (Voucher) o;

        if (identificatieNummer != voucher.identificatieNummer) return false;
        return naamDrankje != null ? naamDrankje.equals(voucher.naamDrankje) : voucher.naamDrankje == null;
    }

    @Override
    public int hashCode() {
        int result = naamDrankje != null ? naamDrankje.hashCode() : 0;
        result = 31 * result + identificatieNummer;
        return result;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "naamDrankje='" + naamDrankje + '\'' +
                ", identificatieNummer=" + identificatieNummer +
                '}';
    }
}
