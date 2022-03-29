package FilkomTourdanTravel.tampilan;
import FilkomTourdanTravel.Model.Mobil;
import FilkomTourdanTravel.Model.Karyawan;
import FilkomTourdanTravel.dataTransaksi.pemesananTravel;
import FilkomTourdanTravel.dataTransaksi.penyewaanMobil;
import FilkomTourdanTravel.dataTransaksi.trayekTravel;
import java.util.*;

    public class Main {
    static Karyawan[] karyawans = new Karyawan[3];
    static Mobil[] mobils = new Mobil[3];
    static trayekTravel[] trayekTravels = new trayekTravel[3];
    static pemesananTravel[] pemesananTravels = new pemesananTravel[3];
    static penyewaanMobil[] penyewaanMobils = new penyewaanMobil[3];

        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program Filkom Tour and Travel");
        int pilihan;

        do {
            System.out.println("Menu : ");
            System.out.println("1. Masukkan data Karyawan");
            System.out.println("2. Keluarkan data Karyawan");
            System.out.println("3. Masukkan data mobil");
            System.out.println("4. Keluarkan data mobil");
            System.out.println("5. Masukkan data Trayek Travel");
            System.out.println("6. Keluarkan data Trayek Travel");
            System.out.println("7. Pesan Travel");
            System.out.println("8. Invoice Pemesanan");
            System.out.println("9. Sewa Mobil");
            System.out.println("10. Invoice Penyewaan");
            System.out.println("11. Exit");
            System.out.print("Masukkan pilihan Anda : ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    setDataKaryawan();
                    break;
                case 2:
                    getDataKaryawan();
                    break;
                case 3:
                    setDataMobil();
                    break;
                case 4:
                    getDataMobil();
                    break;
                case 5:
                    setDataTrayekTravel();
                    break;
                case 6:
                    getDataTrayekTravel();
                    break;
                case 7:
                    setDataPemesananTravel();
                    break;
                case 8:
                    getDataPemesananTravel();
                    break;
                case 9:
                    setDataPenyewaanMobil();
                    break;
                case 10:
                    getDataPenyewaanMobil();
                    break;
                case 11:
                    System.out.println("Terima kasih telah menggunakan program kami.");
                    break;
                default:
                    System.out.print("Menu tidak tersedia");
            }


            //Mangat ya ges ya
        } while(pilihan != 11);
    }

        public static void setDataKaryawan () {
            for (int i = 0; i < karyawans.length; i++) {
                System.out.println("Masukkan data Karyawan " + (i + 1));
                System.out.print("Nama Karyawan\t\t: ");
                String namaKaryawan = input.nextLine();
                System.out.print("No Telepon\t\t\t: ");
                String noTelpKaryawan = input.nextLine();
                System.out.print("Jenis Kelamin\t\t: ");
                String jenisKelamin = input.nextLine();
                System.out.print("Kategori Karyawan\t: ");
                String kategori = input.nextLine();
                System.out.print("Alamat Karyawan\t\t: ");
                String alamatKaryawan = input.nextLine();
                System.out.print("Gaji Karyawan\t\t: ");
                double gajiKaryawan = input.nextDouble();
                input.nextLine();
                System.out.println();

                karyawans[i] = new Karyawan(namaKaryawan, noTelpKaryawan, jenisKelamin, kategori, alamatKaryawan, gajiKaryawan);
            }
        }
        public static void getDataKaryawan () {
            System.out.println("===========================");
            for (int i = 0; i < karyawans.length; i++) {
                System.out.println("Data Karyawan " + (i + 1));
                karyawans[i].display();
            }
        }

        public static void setDataMobil () {
        for ( int j = 0; j < mobils.length; j++){
            System.out.println("Masukkan data Mobil " + (j + 1));
            System.out.print("No. Plat\t\t\t\t: ");
            String noPlat = input.nextLine();
            System.out.print("Merk Mobil\t\t\t\t: ");
            String merkMobil = input.nextLine();
            System.out.print("Warna Mobil\t\t\t\t: ");
            String warnaMobil = input.nextLine();
            System.out.print("Tahun Keluaran Mobil\t: ");
            int tahunKeluaranMobil = input.nextInt();
            System.out.print("Jumlah Kursi\t\t\t: ");
            int jumlahKursi = input.nextInt();
            input.nextLine();
            System.out.println();

            mobils[j] = new Mobil (noPlat, merkMobil, warnaMobil, tahunKeluaranMobil, jumlahKursi);
        }

        }
        public static void getDataMobil () {
            System.out.println("===========================");
            for (int j = 0; j < mobils.length; j++) {
                System.out.println("Data Mobil " + (j + 1));
                mobils[j].display2();

            }
        }


        public static void setDataTrayekTravel(){
            System.out.println("===========================");
        for ( int k = 0; k < trayekTravels.length; k++){
            System.out.println("Data Trayek Travel " + (k + 1));
            System.out.print("Tanggal berangkat (dd/mm/yy)\t: ");
            String tglBerangkat = input.nextLine();
            System.out.print("Jam Berangkat\t\t\t\t\t: ");
            Float jamBerangkat = input.nextFloat();
            input.nextLine();
            System.out.print("Rute Asal\t\t\t\t\t\t: ");
            String ruteAsal = input.nextLine();
            System.out.print("Rute Tujuan\t\t\t\t\t\t: ");
            String ruteTujuan = input.nextLine();
            System.out.print("Sopir Travel\t\t\t\t\t: ");
            String sopirTravel = input.nextLine();
            System.out.print("Mobil Travel\t\t\t\t\t: ");
            String mobilTravel = input.nextLine();
            System.out.print("Jarak \t\t\t\t\t\t\t: ");
            float jarak = input.nextFloat();
            input.nextLine();
            System.out.println();

            trayekTravels[k] = new trayekTravel(tglBerangkat, ruteAsal, ruteTujuan, sopirTravel,mobilTravel, jamBerangkat, jarak);

        }
        }
        public static void getDataTrayekTravel(){
            System.out.println("===========================");
            for (int k = 0; k < trayekTravels.length; k++) {
                System.out.println("Data Trayek Travel " + (k + 1));
                trayekTravels[k].display3();
            }
        }

        public static void setDataPemesananTravel(){
            System.out.println("===========================");
            for ( int l = 0; l < pemesananTravels.length; l++){
                System.out.print("Tanggal pemesanan\t: " );
                String tglPemesanan = input.nextLine();
                System.out.print("Nama pemesan\t\t: ");
                String namaPemesan = input.nextLine();
                System.out.print("Alamat\t\t\t\t: ");
                String alamatPemesanan = input.nextLine();
                System.out.print("Telepon\t\t\t\t: ");
                String notelpPemesanan = input.nextLine();
                System.out.println();

                pemesananTravels [l] = new pemesananTravel(tglPemesanan,namaPemesan,alamatPemesanan,notelpPemesanan);
            }
        }
        public static void getDataPemesananTravel(){
            System.out.println("===========================");
            for ( int l = 0; l < pemesananTravels.length; l++) {
                System.out.println("Data Pemesanan Travel " + (l + 1));
                pemesananTravels[l].display4();
            }
            }

        public static void setDataPenyewaanMobil(){
            System.out.println("===========================");
            for ( int m = 0; m < penyewaanMobils.length; m++){
                System.out.print("Lama menyewa\t\t\t: " );
                int lamaSewa = input.nextInt();
                input.nextLine();
                System.out.print("Tanggal Penyewaan\t\t: ");
                String tglMulaiSewa = input.nextLine();
                System.out.print("Tanggal Selesai Sewa\t: ");
                String tglSelesaiSewa = input.nextLine();
                System.out.print("Nama penyewa\t\t\t: " );
                String namaPenyewa = input.nextLine();
                System.out.print("Alamat\t\t\t\t\t: ");
                String alamatPenyewa = input.nextLine();
                System.out.print("Telepon\t\t\t\t\t: ");
                String notelpPenyewa = input.nextLine();
                System.out.print("Sopir Rentcar\t\t\t: ");
                String sopirRentcar = input.nextLine();
                System.out.print("Mobil yang disewa\t\t: ");
                String mobilPenyewaan = input.nextLine();
                System.out.println();

                penyewaanMobils[m] = new penyewaanMobil(tglMulaiSewa,tglSelesaiSewa,namaPenyewa,alamatPenyewa,notelpPenyewa,sopirRentcar,mobilPenyewaan,lamaSewa);
            }
        }
        public static void getDataPenyewaanMobil(){
            System.out.println("===========================");
            for ( int m = 0; m < penyewaanMobils.length; m++){
                System.out.println("Data Penyewaan Mobil " + (m + 1));
                penyewaanMobils[m].display5();
            }
        }

    }
