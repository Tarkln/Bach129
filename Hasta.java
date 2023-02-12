package Hastane_projesi;

public class Hasta {

    private String isim;

    private String soyİsim;

    private int hastaID;

    private Durum hastaDurumu;


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyİsim() {
        return soyİsim;
    }

    public void setSoyİsim(String soyİsim) {
        this.soyİsim = soyİsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public Durum getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(Durum hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }

    public Hasta(String isim, String soyİsim, int hastaID, Durum hastaDurumu) {

        this.isim = isim;

        this.soyİsim = soyİsim;

        this.hastaID = hastaID;

        this.hastaDurumu = hastaDurumu;

    }

    public Hasta() {

    }

    @Override
    public String toString() {
        return "Hasta{" +
                "isim='" + isim + '\'' +
                ", soyİsim='" + soyİsim + '\'' +
                ", hastaID=" + hastaID +
                ", hastaDurumu=" + hastaDurumu +
                '}';
    }
}
