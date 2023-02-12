package Hastane_projesi;

import java.util.Arrays;

public class Hastane extends VeriBankasi {

    Doktor doktor = new Doktor();

    Hasta hasta = new Hasta();

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }

    public Hastane(Doktor doktor, Hasta hasta) {

        this.doktor = doktor;

        this.hasta = hasta;

    }

    public Hastane() {

    }

    public Doktor getDoktor() {

        return doktor;


    }

    @Override
    public String toString() {
        return "Hastane{" +
                "doktor=" + doktor +
                ", hasta=" + hasta +
                ", doctorIsimleri=" + Arrays.toString(doctorIsimleri) +
                ", doctorSoyIsimleri=" + Arrays.toString(doctorSoyIsimleri) +
                ", unvanlar=" + Arrays.toString(unvanlar) +
                ", hastaIsimleri=" + Arrays.toString(hastaIsimleri) +
                ", hastaSoyIsimleri=" + Arrays.toString(hastaSoyIsimleri) +
                ", durumlar=" + Arrays.toString(durumlar) +
                ", hastaIDleri=" + Arrays.toString(hastaIDleri) +
                '}';
    }
}

