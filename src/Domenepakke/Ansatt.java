package Domenepakke;

public class Ansatt extends Bruker {
    private Double pinKode;
    private Boolean erPlanlegger;

    public Double getPinKode() {
        return pinKode;
    }

    public void setPinKode(Double pinKode) {
        this.pinKode = pinKode;
    }

    public Boolean getErPlanlegger() {
        return erPlanlegger;
    }

    public void setErPlanlegger(Boolean erPlanlegger) {
        this.erPlanlegger = erPlanlegger;
    }

    public Ansatt(String brukerNavn, Double pinkode, Boolean erPlanlegger) {
        super(brukerNavn);
        this.pinKode = pinkode;
        this.erPlanlegger = erPlanlegger;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pinKode=" + pinKode +
                ", erPlanlegger=" + erPlanlegger +
                '}';
    }
}
