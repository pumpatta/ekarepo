package fi.academy.harjoitukset;

public class Henkilo {

    private String etunimi;
    private String sukunimi;
    private int ika;
    final int id;

    public Henkilo(String etunimi, String sukunimi, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
        this.id = 0;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIka() {

        return ika;
    }

    public void setIka(int ika) {
        if (ika < 0) return;
        this.ika = ika;
    }

    @Override
    public String toString() {
        return this.etunimi + " " + this.sukunimi + ", " + this.ika;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Henkilo h = (Henkilo)obj;
        if (etunimi.equals(h.etunimi) && sukunimi.equals(h.sukunimi) ) {
            return true;
        }
        return false;
    }

}
