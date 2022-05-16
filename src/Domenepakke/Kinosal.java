package Domenepakke;

public class Kinosal {
    private String kinoNavn;
    private Integer kinoSalNr;
    private String kinoSalNavn;

    public String getKinoNavn() {
        return kinoNavn;
    }

    public void setKinoNavn(String kinoNavn) {
        this.kinoNavn = kinoNavn;
    }

    public Integer getKinoSalNr() {
        return kinoSalNr;
    }

    public void setKinoSalNr(Integer kinoSalNr) {
        this.kinoSalNr = kinoSalNr;
    }

    public String getKinoSalNavn() {
        return kinoSalNavn;
    }

    public void setKinoSalNavn(String kinoSalNavn) {
        this.kinoSalNavn = kinoSalNavn;
    }

    public Kinosal(String kinoNavn, Integer kinoSalNr, String kinoSalNavn) {
        this.kinoNavn = kinoNavn;
        this.kinoSalNr = kinoSalNr;
        this.kinoSalNavn = kinoSalNavn;
    }

    @Override
    public String toString() {
        return "Kinosal{" +
                "kinoNavn='" + kinoNavn + '\'' +
                ", kinoSalNr=" + kinoSalNr +
                ", kinoSalNavn='" + kinoSalNavn + '\'' +
                '}';
    }
}
