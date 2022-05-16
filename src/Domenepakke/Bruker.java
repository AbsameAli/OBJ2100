package Domenepakke;

public abstract class Bruker {
    private String brukerNavn;

    public String getBrukerNavn() {
        return brukerNavn;
    }

    public Bruker(String brukerNavn) {
        this.brukerNavn = brukerNavn;
    }

    public void setBrukerNavn(String brukerNavn) {
        this.brukerNavn = brukerNavn;
    }

    @Override
    public String toString() {
        return "Bruker{" +
                "brukerNavn='" + brukerNavn + '\'' +
                '}';
    }
}
