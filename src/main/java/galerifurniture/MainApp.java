/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package galerifurniture;

/**
 *
 * @author USER
 */
import entities.*;

import java.util.Scanner;

public final class MainApp {
    private final GaleriFurnitureInterface galeriFurniture;
    private final Scanner scanner;

    public MainApp(GaleriFurnitureInterface galeriFurniture) {
        this.galeriFurniture = galeriFurniture;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("||==========================================||");
            System.out.println("||         YOURSUN GALLERY FURNITURE        ||");
            System.out.println("||==========================================||");
            System.out.println("Menu :");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Edit Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Tambah Karyawan");
            System.out.println("6. Tampilkan Karyawan");
            System.out.println("7. Tambah Pelanggan");
            System.out.println("8. Tampilkan Pelanggan");
            System.out.println("9. Tambah Transaksi");
            System.out.println("10. Tampilkan Transaksi");
            System.out.println("11. Keluar");
            System.out.print("Silahkan inputkan pilihan menu-nya ^-^ : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character dari input sebelumnya

            switch (choice) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilkanProduk();
                    break;
                case 3:
                    editProduk();
                    break;
                case 4:
                    hapusProduk();
                    break;
                case 5:
                    tambahKaryawan();
                    break;
                case 6:
                    tampilkanKaryawan();
                    break;
                case 7:
                    tambahPelanggan();
                    break;
                case 8:
                    tampilkanPelanggan();
                    break;
                case 9:
                    tambahTransaksi();
                    break;
                case 10:
                    tampilkanTransaksi();
                    break;
                case 11:
                    System.out.println("Terima kasih! Program selesai^-^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan inputkan pilihan yang benar yaa^-^.");
            }
        }
    }

    private void tambahProduk() {
        System.out.print("Masukkan nama produk : ");
        String namaProduk = scanner.nextLine();
        System.out.print("Masukkan harga produk : ");
        double hargaProduk = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan newline character dari input sebelumnya
        Produk produk = new Produk(namaProduk, hargaProduk);
        galeriFurniture.tambahProduk(produk);
        System.out.println("Produk berhasil ditambahkan!");
    }

    private void tampilkanProduk() {
        System.out.println("Daftar Produk :");
        galeriFurniture.tampilkanProduk().forEach(p -> {
            System.out.println("Nama : " + p.getNama() + ", Harga : " + p.getHarga());
        });
    }

    private void editProduk() {
        System.out.print("Masukkan nama produk yang ingin diubah : ");
        String namaEdit = scanner.nextLine();
        System.out.print("Masukkan harga baru : ");
        double hargaEdit = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan newline character dari input sebelumnya
        galeriFurniture.editProduk(namaEdit, hargaEdit);
        System.out.println("Produk berhasil diubah!");
    }

    private void hapusProduk() {
        System.out.print("Masukkan nama produk yang ingin dihapus : ");
        String namaHapus = scanner.nextLine();
        galeriFurniture.hapusProduk(namaHapus);
        System.out.println("Produk berhasil dihapus!");
    }

    private void tambahKaryawan() {
        System.out.print("Masukkan nama karyawan : ");
        String namaKaryawan = scanner.nextLine();
        System.out.print("Masukkan jabatan : ");
        String jabatan = scanner.nextLine();
        Karyawan karyawan = new Karyawan(namaKaryawan, jabatan);
        galeriFurniture.tambahKaryawan(karyawan);
        System.out.println("Karyawan berhasil ditambahkan!");
    }

    private void tampilkanKaryawan() {
        System.out.println("Daftar Karyawan:");
        galeriFurniture.tampilkanKaryawan().forEach(k -> {
            System.out.println("Nama : " + k.getNama() + ", Jabatan : " + k.getJabatan());
        });
    }

    private void tambahPelanggan() {
        System.out.print("Masukkan nama pelanggan : ");
        String namaPelanggan = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(namaPelanggan);
        galeriFurniture.tambahPelanggan(pelanggan);
        System.out.println("Pelanggan berhasil ditambahkan!");
    }

    private void tampilkanPelanggan() {
        System.out.println("Daftar Pelanggan :");
        galeriFurniture.tampilkanPelanggan().forEach(p -> {
            System.out.println("Nama : " + p.getNama());
        });
    }

    private void tambahTransaksi() {
        System.out.print("Masukkan nama produk : ");
        String namaProdukTransaksi = scanner.nextLine();
        Produk produkTransaksi = galeriFurniture.cariProduk(namaProdukTransaksi);
        if (produkTransaksi != null) {
            System.out.print("Masukkan nama pelanggan : ");
            String namaPelanggan = scanner.nextLine();
            Pelanggan pelanggan = new Pelanggan(namaPelanggan);
            Transaksi transaksi = new Transaksi(produkTransaksi, pelanggan);
            galeriFurniture.tambahTransaksi(transaksi);
            System.out.println("Transaksi berhasil ditambahkan!");
        } else {
            System.out.println("Produk tidak ditemukan. Transaksi dibatalkan.");
        }
    }

    private void tampilkanTransaksi() {
        System.out.println("Daftar Transaksi :");
        galeriFurniture.tampilkanTransaksi().forEach(t -> {
            System.out.println("Produk : " + t.getProduk().getNama() + ", Pelanggan : " + t.getPelanggan().getNama());
        });
    }

    public static void main(String[] args) {
        GaleriFurnitureInterface galeriFurniture = new GaleriFurnitureImpl();
        MainApp mainApp = new MainApp(galeriFurniture);
        mainApp.start();
    }
}
