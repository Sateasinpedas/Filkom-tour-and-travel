package FilkomTourdanTravel.Model;


public class Karyawan {
    private String namaKaryawan, noTelpKaryawan, jenisKelamin, kategoriKaryawan, alamatKaryawan;
    private double gajiKaryawan;

    public Karyawan (String namaKaryawan, String noTelpKaryawan, String jenisKelamin, String kategoriKaryawan,
                         String alamatKaryawan, double gajiKaryawan){
        this.namaKaryawan = namaKaryawan;
        this.noTelpKaryawan = noTelpKaryawan;
        this.jenisKelamin = jenisKelamin;
        this.kategoriKaryawan = kategoriKaryawan;
        this.alamatKaryawan = alamatKaryawan;
        this.gajiKaryawan = gajiKaryawan;
    }

    public Karyawan(){

    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getNoTelpKaryawan() {
        return noTelpKaryawan;
    }

    public void setNoTelpKaryawan(String noTelpKaryawan) {
        this.noTelpKaryawan = noTelpKaryawan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getKategoriKaryawan() {
        return kategoriKaryawan;
    }

    public void setKategoriKaryawan(String kategoriKaryawan) {
        this.kategoriKaryawan = kategoriKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public double getGajiKaryawan() {
        return gajiKaryawan;
    }

    public void setGajiKaryawan(double gajiKaryawan) {
        this.gajiKaryawan = gajiKaryawan;
    }

    public void display() {
        System.out.println("Nama Karyawan\t\t: " + this.namaKaryawan);
        System.out.println("No Telepon\t\t\t: " + this.noTelpKaryawan);
        System.out.println("Jenis Kelamin\t\t: " + this.jenisKelamin);
        System.out.println("Kategori Karyawan\t: " + this.kategoriKaryawan);
        System.out.println("Alamat Karyawan\t\t: " + this.alamatKaryawan);
        System.out.println("Gaji Karyawan\t\t: " + this.gajiKaryawan);
        System.out.println();
    }

}
