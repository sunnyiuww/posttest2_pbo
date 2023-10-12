/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author USER
 */
public class Transaksi {
    private final Produk produk;
    private final Pelanggan pelanggan;

    public Transaksi(Produk produk, Pelanggan pelanggan) {
        this.produk = produk;
        this.pelanggan = pelanggan;
    }

    public Produk getProduk() {
        return produk;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }
}


