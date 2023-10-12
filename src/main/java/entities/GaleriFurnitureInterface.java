/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author USER
 */
import java.util.List;

public interface GaleriFurnitureInterface {
    void tambahProduk(Produk produk);
    void editProduk(String nama, double hargaBaru);
    void hapusProduk(String nama);
    List<Produk> tampilkanProduk();
    
    void tambahKaryawan(Karyawan karyawan);
    void hapusKaryawan(String nama);
    List<Karyawan> tampilkanKaryawan();
    
    void tambahPelanggan(Pelanggan pelanggan);
    void hapusPelanggan(String nama);
    List<Pelanggan> tampilkanPelanggan();
    
    void tambahTransaksi(Transaksi transaksi);
    void hapusTransaksi(Transaksi transaksi);
    List<Transaksi> tampilkanTransaksi();
    
    Produk cariProduk(String nama);
}


