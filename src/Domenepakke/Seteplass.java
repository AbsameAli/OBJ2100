package Domenepakke;

public class Seteplass {
    private Integer radNr;
    private Integer seteNr;
    private Kinosal kino;

    public Seteplass(Integer radNr, Integer seteNr, Kinosal kino) {
        this.radNr = radNr;
        this.seteNr = seteNr;
        this.kino = kino;
    }

    public Integer getRadNr() { return radNr; }

    public void setRadNr(Integer radNr) { this.radNr = radNr; }

    public Integer getSeteNr() { return seteNr; }

    public void setSeteNr(Integer seteNr) { this.seteNr = seteNr; }

    public Kinosal getKino() { return kino; }

    public void setKino(Kinosal kino) { this.kino = kino; }
}
