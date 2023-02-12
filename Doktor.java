package Hastane_projesi;

public class Doktor {

    private String isim;

    private String soyİsim;

    private String unvan;

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

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public Doktor(String isim, String soyİsim, String unvan) {

        this.isim = isim;

        this.soyİsim = soyİsim;

        this.unvan = unvan;
    }

    public Doktor() {

    }

    @Override
    public String toString() {
        return "Doktor{" +
                "isim='" + isim + '\'' +
                ", soyİsim='" + soyİsim + '\'' +
                ", unvan='" + unvan + '\'' +
                '}';
    }
}
