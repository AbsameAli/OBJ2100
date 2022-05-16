package Domenepakke;

public class Kunde extends Bruker{
    private String kundeNr;

    public String getKundeNr() {
        return kundeNr;
    }

    public void setKundeNr(String kundeNr) {
        this.kundeNr = kundeNr;
    }

    public Kunde(String brukerNavn, String kundeNr) {
        super(brukerNavn);
        this.kundeNr = kundeNr;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundeNr='" + kundeNr + '\'' +
                '}';
    }
}
