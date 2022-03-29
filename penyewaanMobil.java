package FilkomTourdanTravel.dataTransaksi;

//menginput data PenyewaanMobil (tglmulaisewa, tglselesaisewa,
//nama penyewa, alamat, tlp, sopir rentcar, mobil)

public class penyewaanMobil {

        String tglMulaiSewa, tglSelesaiSewa, namaPenyewa, alamatPenyewa, telpPenyewa, sopirRentcar, mobilPenyewaan, hargaPenyewaan, jarakPenyewaan;
        int lamaSewa;

    public penyewaanMobil(String tglMulaiSewa, String tglSelesaiSewa, String namaPenyewa, String alamatPenyewa,
                          String telpPenyewa, String sopirRentcar, String mobilPenyewaan,int lamaSewa){

        this.tglMulaiSewa = tglMulaiSewa;
        this.tglSelesaiSewa = tglSelesaiSewa;
        this.namaPenyewa = namaPenyewa;
        this.alamatPenyewa = alamatPenyewa;
        this.telpPenyewa = telpPenyewa;
        this.sopirRentcar = sopirRentcar;
        this.mobilPenyewaan = mobilPenyewaan;
        this.lamaSewa = lamaSewa;
    }
    public penyewaanMobil(){

    }

    public String getTglMulaiSewa() {
        return tglMulaiSewa;
    }

    public void setTglMulaiSewa(String tglMulaiSewa) {
        this.tglMulaiSewa = tglMulaiSewa;
    }

    public String getTglSelesaiSewa() {
        return tglSelesaiSewa;
    }

    public void setTglSelesaiSewa(String tglSelesaiSewa) {
        this.tglSelesaiSewa = tglSelesaiSewa;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public String getAlamatPenyewa() {
        return alamatPenyewa;
    }

    public void setAlamatPenyewa(String alamatPenyewa) {
        this.alamatPenyewa = alamatPenyewa;
    }

    public String getTelpPenyewa() {
        return telpPenyewa;
    }

    public void setTelpPenyewa(String telpPenyewa) {
        this.telpPenyewa = telpPenyewa;
    }

    public String getSopirRentcar() {
        return sopirRentcar;
    }

    public void setSopirRentcar(String sopirRentcar) {
        this.sopirRentcar = sopirRentcar;
    }

    public String getMobilPenyewaan() {
        return mobilPenyewaan;
    }

    public void setMobilPenyewaan(String mobilPenyewaan) {
        this.mobilPenyewaan = mobilPenyewaan;
    }

    public String getHargaPenyewaan() {
        return hargaPenyewaan;
    }

    public void setHargaPenyewaan(String hargaPenyewaan) {
        this.hargaPenyewaan = hargaPenyewaan;
    }

    public String getJarakPenyewaan() {
        return jarakPenyewaan;
    }

    public void setJarakPenyewaan(String jarakPenyewaan) {
        this.jarakPenyewaan = jarakPenyewaan;
    }

    public int getLamaSewa(){
        return lamaSewa;
    }
    public void setlamaSewa(int lamaSewa){
        this.lamaSewa = lamaSewa;
    }

    public void display5(){
        System.out.println("Lama menyewa\t\t\t: " + this.lamaSewa);
        System.out.println("Tanggal Penyewaan\t\t: " + this.tglMulaiSewa);
        System.out.println("Tanggal Selesai Sewa\t: " + this.tglSelesaiSewa);
        System.out.println("Nama penyewa\t\t\t: " + this.namaPenyewa);
        System.out.println("Alamat\t\t\t\t\t: " + this.alamatPenyewa);
        System.out.println("Telepon\t\t\t\t\t: " + this.telpPenyewa);
        System.out.println("Sopir Rentcar\t\t\t: " + this.sopirRentcar);
        System.out.println("Mobil yang disewa\t\t: " + this.mobilPenyewaan);
        System.out.println();
    }
}
