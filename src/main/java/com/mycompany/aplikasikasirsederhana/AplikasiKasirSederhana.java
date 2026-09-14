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
        Barang barang1 = new Barang("B001", "Indomie", 3500, 2);

        kasir1.tampilkanInfo();
        barang1.tampilkanBarang();

        barang1.setHarga(4000);
        barang1.setJumlah(3);

        System.out.println("\nSetelah data diubah:");
        System.out.println("Harga: Rp" + barang1.getHarga());
        System.out.println("Jumlah: " + barang1.getJumlah());

        barang1.setHarga(-100);
        barang1.setJumlah(0);

        System.out.println("\nTotal harga: Rp" + barang1.hitungTotal());
    }
}

class Kasir {
    private String idKasir;
    private String namaKasir;

    public Kasir(String idKasir, String namaKasir) {
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
    }

    public String getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public void tampilkanInfo() {
        System.out.println("ID Kasir: " + getIdKasir());
        System.out.println("Nama Kasir: " + getNamaKasir());
    }
}

class Barang {
    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int jumlah;

    public Barang(String kodeBarang, String namaBarang, double harga, int jumlah) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        setHarga(harga);
        setJumlah(jumlah);
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif.");
        }
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        if (jumlah > 0) {
            this.jumlah = jumlah;
        } else {
            System.out.println("Jumlah harus lebih dari 0.");
        }
    }

    public double hitungTotal() {
        return getHarga() * getJumlah();
    }

    public void tampilkanBarang() {
        System.out.println("Kode Barang: " + getKodeBarang());
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Harga: Rp" + getHarga());
        System.out.println("Jumlah: " + getJumlah());
    }
}
