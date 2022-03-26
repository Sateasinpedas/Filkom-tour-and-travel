package FilkomTourdanTravel;
import FilkomTourdanTravel.Model.Mobil;
import FilkomTourdanTravel.Model.Karyawan;
import java.util.*;

public class Main {
    static Karyawan[] karyawans = new Karyawan[3];
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
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan Anda : ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    setDataKaryawan();
                    break;
                case 2:
                    getdataKaryawan();
                    break;
                case 3:
                    break;
                default:
                    System.out.print("Menu tidak tersedia");
            }


            //Mangat ya ges ya
        } while(pilihan != 5);
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
        public static void getdataKaryawan () {
            System.out.println("===========================");
            for (int i = 0; i < karyawans.length; i++) {
                System.out.println("Data Karyawan " + (i + 1));
                karyawans[i].display();
            }
        }
    }
