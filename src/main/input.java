package main;

import pckgclass.*;

public class input {
    public static void main(String[] args) throws Exception {
        objSupplier supplier = new objSupplier();
        // Membuat objek supplier
        supplier.setKodeSupplier(001);
        System.out.print("kode Supplier: " + supplier.getKodeSupplier());

        supplier.setNamaSupplier("Indomie");
        System.out.print("Nama Supplier: " + supplier.getNamaSuplier());

        supplier.setAlamatSupplier("Jalan Jenderal Sudirman, Kavling 76-78 Jakarta");
        System.out.print("Masukkan Alamat Supplier: " + supplier.GetAlamatSupplier());

        // Membuat objek barang
        objBarang barang = new objBarang();
        barang.setKodeBarang(001);
        System.out.print("Kode Barang: " + barang.getKodeBarang());

        System.out.print("Masukkan Nama Barang: ");

        System.out.print("Masukkan Harga Barang: ");

        // Membuat objek barang masuk
        System.out.print("Masukkan ID Barang Masuk: ");

        System.out.print("Masukkan Jumlah Barang Masuk: ");

        // Tanggal masuk dapat menggunakan objek Date atau library lain yang sesuai

        // Membuat objek barang keluar
        System.out.print("Masukkan ID Barang Keluar: ");

        System.out.print("Masukkan Jumlah Barang Keluar: ");

    }
}
