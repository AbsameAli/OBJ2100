package Domenepakke;

import java.sql.Time;
import java.time.LocalDateTime;

public class Filmvisning {
    private Integer visningsNr;
    private Film filmen;
    private Kinosal kino;
    private LocalDateTime dato;
    private Time startTid;
    private Double pris;

    public Filmvisning(Integer visningsNr, Film filmen, Kinosal kino, LocalDateTime dato, Time startTid, Double pris) {
        this.visningsNr = visningsNr;
        this.filmen = filmen;
        this.kino = kino;
        this.dato = dato;
        this.startTid = startTid;
        this.pris = pris;
    }

    public Integer getVisningsNr() { return visningsNr; }

    public void setVisningsNr(Integer visningsNr) { this.visningsNr = visningsNr; }

    public Film getFilmen() { return filmen; }

    public void setFilmen(Film filmen) { this.filmen = filmen; }

    public Kinosal getKino() { return kino; }

    public void setKino(Kinosal kino) { this.kino = kino; }

    public LocalDateTime getDato() { return dato; }

    public void setDato(LocalDateTime dato) { this.dato = dato; }

    public Time getStartTid() { return startTid; }

    public void setStartTid(Time startTid) { this.startTid = startTid; }

    public Double getPris() { return pris; }

    public void setPris(Double pris) { this.pris = pris; }


}
