package Domenepakke;

public class Film {
    private Integer filmNr;
    private String filmNavn;

    public Integer getFilmNr() {
        return filmNr;
    }

    public void setFilmNr(Integer filmNr) {
        this.filmNr = filmNr;
    }

    public String getFilmNavn() {
        return filmNavn;
    }

    public void setFilmNavn(String filmNavn) {
        this.filmNavn = filmNavn;
    }

    public Film(Integer filmNr, String filmNavn) {
        this.filmNr = filmNr;
        this.filmNavn = filmNavn;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmNr=" + filmNr +
                ", filmNavn='" + filmNavn + '\'' +
                '}';
    }

}
