/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasikasirsederhana;

/**
 *
 * @author LENOVO
 */
public class AplikasiKasirSederhana {

    public static void main(String[] args) {
        Kasir kasir1 = new Kasir("A001", "Arifatul Birroh");
        kasir1.tampilkanInfo();

        Barang barang1 = new Barang("B001", "Indomie", 3500, 2);
        barang1.tampilkanBarang();

        System.out.println("Total Harga: Rp" + barang1.hitungTotal());
    }
}

class Kasir {

    private String idKasir;
    private String namaKasir;

    Kasir(String idKasir, String namaKasir) {
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
    }

    public String getIdKasir() {
        return idKasir;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    void tampilkanInfo() {
        System.out.println("=== DATA KASIR ===");
        System.out.println("ID Kasir   : " + idKasir);
        System.out.println("Nama Kasir : " + namaKasir);
    }
}

class Barang {

    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int jumlah;

    Barang(String kodeBarang, String namaBarang, double harga, int jumlah) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    double hitungTotal() {
        return harga * jumlah;
    }

    void tampilkanBarang() {
        System.out.println("\n=== DATA BARANG ===");
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Jumlah      : " + jumlah);
    }
}