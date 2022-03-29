package FilkomTourdanTravel.dataTransaksi;
import FilkomTourdanTravel.Model.Mobil;

//* Input TRAYEK travel (tglberangkat , jamberangkat, ruteasal,
// rutetujuan, sopir travel, mobil)

public class trayekTravel {
    private String tglBerangkat, ruteAsal, ruteTujuan, sopirTravel, mobilTravel;
    private float jamBerangkat;
    private float jarak;
    private final double harga = 10_000; //Harga per 1 Km

    public trayekTravel(String tglBerangkat, String ruteAsal, String ruteTujuan, String sopirTravel, String mobilTravel, float jamBerangkat, float jarak){
        this.tglBerangkat = tglBerangkat;
        this.ruteAsal = ruteAsal;
        this.ruteTujuan = ruteTujuan;
        this.sopirTravel = sopirTravel;
        this.mobilTravel = mobilTravel;
        this.jamBerangkat = jamBerangkat;
        this.jarak = jarak;
    }

    public trayekTravel(){

    }

    public String getTglBerangkat() {
        return tglBerangkat;
    }

    public void setTglBerangkat(String tglBerangkat) {
        this.tglBerangkat = tglBerangkat;
    }

    public String getRuteAsal() {
        return ruteAsal;
    }

    public void setRuteAsal(String ruteAsal) {
        this.ruteAsal = ruteAsal;
    }

    public String getRuteTujuan() {
        return ruteTujuan;
    }

    public void setRuteTujuan(String ruteTujuan) {
        this.ruteTujuan = ruteTujuan;
    }

    public String getSopirTravel() {
        return sopirTravel;
    }

    public void setSopirTravel(String sopirTravel) {
        this.sopirTravel = sopirTravel;
    }

    public String getMobilTravel() {
        return mobilTravel;
    }

    public void setMobilTravel(String mobilTravel) {
        this.mobilTravel = mobilTravel;
    }

    public float getJamBerangkat() {
        return jamBerangkat;
    }

    public void setJamBerangkat(float jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }

    public double getHarga(){
        return harga;
    }

    public void display3(){
        System.out.println("Tanggal berangkat\t: " + this.tglBerangkat);
        System.out.println("Jam berangkat\t\t: " + this.jamBerangkat);
        System.out.println("Rute Asal\t\t\t: " + this.ruteAsal);
        System.out.println("Rute Tujuan\t\t\t: " + this.ruteTujuan);
        System.out.println("Sopir Travel\t\t: " + this.sopirTravel);
        System.out.println("Jarak\t\t\t\t: " + this.jarak);
        System.out.println("Total Harga\t\t\t: " + harga*this.jarak);
        System.out.println();

    }

}



