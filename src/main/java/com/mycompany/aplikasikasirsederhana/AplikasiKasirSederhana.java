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
    
    String idKasir;
    String namaKasir;

    Kasir(String idKasir, String namaKasir) {
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
    }

    void tampilkanInfo() {
        System.out.println("=== DATA KASIR ===");
        System.out.println("ID Kasir   : " + idKasir);
        System.out.println("Nama Kasir : " + namaKasir);
    }
}

class Barang {
    String kodeBarang;
    String namaBarang;
    double harga;
    int jumlah;

    Barang(String kodeBarang, String namaBarang, double harga, int jumlah) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
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
       