package Hastane_projesi;

public class Durum {

    private String aktuelDurum;

    private boolean aciliyet;

    public String getAktuelDurum() {
        return aktuelDurum;
    }

    public void setAktuelDurum(String aktuelDurum) {
        this.aktuelDurum = aktuelDurum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public Durum(String aktuelDurum, boolean aciliyet) {
        this.aktuelDurum = aktuelDurum;
        this.aciliyet = aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;

    }

    public Durum() {

    }

    @Override
    public String toString() {
        return "Durum{" +
                "aktuelDurum='" + aktuelDurum + '\'' +
                ", aciliyet=" + aciliyet +
                '}';
    }

}
