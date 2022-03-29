package FilkomTourdanTravel.dataTransaksi;
import FilkomTourdanTravel.Model.Mobil;
import FilkomTourdanTravel.dataTransaksi.trayekTravel;
import FilkomTourdanTravel.tampilan.Main;
// ada 2 input :
// * Input TRAYEK travel (tglberangkat , jamberangkat, ruteasal,
// rutetujuan, sopir travel, mobil)
// * Input PemesananTravel (tglpemesanan, nama pemesan, alamat, tlp)

public class pemesananTravel {

    private String tglPemesanan, namaPemesan, alamatPemesanan, telpPemesanan;

    public pemesananTravel(String tglPesesanan, String namaPemesan, String alamatPemesanan, String telpPemesanan){
        this.tglPemesanan = tglPesesanan;
        this. namaPemesan = namaPemesan;
        this.alamatPemesanan = alamatPemesanan;
        this.telpPemesanan = telpPemesanan;
    }
    public pemesananTravel(){

    }

    public String getTglPemesanan() {
        return tglPemesanan;
    }

    public void setTglPemesanan(String tglPemesanan) {
        this.tglPemesanan = tglPemesanan;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getAlamat() {
        return alamatPemesanan;
    }

    public void setAlamatPemesanan(String alamat) {
        this.alamatPemesanan = alamat;
    }

    public String getTelp() {
        return telpPemesanan;
    }

    public void setTelp(String telp) {
        this.telpPemesanan = telp;
    }

    public void display4(){
      System.out.println("Tanggal pemesanan\t: " + this.tglPemesanan);
        System.out.println("Nama pemesan\t\t: " + this.namaPemesan);
        System.out.println("Alamat\t\t\t\t: " + this.alamatPemesanan);
        System.out.println("Telepon\t\t\t\t: " + this.telpPemesanan);
        System.out.println();

    }







}

