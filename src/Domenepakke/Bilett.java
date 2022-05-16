package Domenepakke;

public class Bilett {
    private String billettKode;
    private Integer visningsNr;
    private Boolean erBetalt;

    public String getBillettKode() {
        return billettKode;
    }

    public void setBillettKode(String billettKode) {
        this.billettKode = billettKode;
    }

    public Integer getVisningsNr() {
        return visningsNr;
    }

    public void setVisningsNr(Integer visningsNr) {
        this.visningsNr = visningsNr;
    }

    public Boolean getErBetalt() {
        return erBetalt;
    }

    public void setErBetalt(Boolean erBetalt) {
        this.erBetalt = erBetalt;
    }

    public Bilett(String billettKode, Integer visningsNr, Boolean erBetalt) {
        this.billettKode = billettKode;
        this.visningsNr = visningsNr;
        this.erBetalt = erBetalt;
    }



}
