/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.List;

public final class GaleriFurnitureImpl implements GaleriFurnitureInterface {
    private final List<Produk> produkList;
    private final List<Karyawan> karyawanList;
    private final List<Pelanggan> pelangganList;
    private final List<Transaksi> transaksiList;

    public GaleriFurnitureImpl() {
        this.produkList = new ArrayList<>();
        this.karyawanList = new ArrayList<>();
        this.pelangganList = new ArrayList<>();
        this.transaksiList = new ArrayList<>();
    }

    @Override
    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    @Override
    public void editProduk(String nama, double hargaBaru) {
        for (Produk produk : produkList) {
            if (produk.getNama().equals(nama)) {
                produk.setHarga(hargaBaru);
                break;
            }
        }
    }

    @Override
    public void hapusProduk(String nama) {
        produkList.removeIf(produk -> produk.getNama().equals(nama));
    }

    @Override
    public List<Produk> tampilkanProduk() {
        return new ArrayList<>(produkList);
    }

    @Override
    public void tambahKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
    }

    @Override
    public void hapusKaryawan(String nama) {
        karyawanList.removeIf(karyawan -> karyawan.getNama().equals(nama));
    }

    @Override
    public List<Karyawan> tampilkanKaryawan() {
        return new ArrayList<>(karyawanList);
    }

    @Override
    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
    }

    @Override
    public void hapusPelanggan(String nama) {
        pelangganList.removeIf(pelanggan -> pelanggan.getNama().equals(nama));
    }

    @Override
    public List<Pelanggan> tampilkanPelanggan() {
        return new ArrayList<>(pelangganList);
    }

    @Override
    public void tambahTransaksi(Transaksi transaksi) {
        transaksiList.add(transaksi);
    }

    @Override
    public void hapusTransaksi(Transaksi transaksi) {
        transaksiList.remove(transaksi);
    }

    @Override
    public List<Transaksi> tampilkanTransaksi() {
        return new ArrayList<>(transaksiList);
    }

    @Override
    public Produk cariProduk(String nama) {
        for (Produk produk : produkList) {
            if (produk.getNama().equals(nama)) {
                return produk;
            }
        }
        return null;
    }
}

