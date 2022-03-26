package FilkomTourdanTravel.Model;

public class Mobil {
    private String noPlat;
    private String merkMobil;
    private String warnaMobil;
    private int tahunKeluaranMobil;
    private int jumlahKursi;

    public Mobil (String noPlat, String merkMobil, String warnaMobil, int tahunKeluaranMobil, int jumlahKursi){
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaranMobil = tahunKeluaranMobil;
        this.jumlahKursi = jumlahKursi;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public String getWarnaMobil() {
        return warnaMobil;
    }

    public void setWarnaMobil(String warnaMobil) {
        this.warnaMobil = warnaMobil;
    }

    public int getTahunKeluaranMobil() {
        return tahunKeluaranMobil;
    }

    public void setTahunKeluaranMobil(int tahunKeluaranMobil) {
        this.tahunKeluaranMobil = tahunKeluaranMobil;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;

    }
    public void display(){
        System.out.println("No. Plat\t\t\t: " + this.noPlat);
        System.out.println("Merk Mobil\t\t\t: " + this.merkMobil);
        System.out.println("Warna Mobil\t\t\t: " + this.warnaMobil);
        System.out.println("Tahun Keluaran\t\t: " +this.tahunKeluaranMobil);
        System.out.println("Jumlah Kursi\t\t: " + this.jumlahKursi);
    }
}
