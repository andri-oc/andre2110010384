package pckgclass;

import java.util.Date;

public class objBarangMasuk {
    private int noBarangMasuk;
    private objBarang barang;
    private objSupplier supplier;
    private int jumlah;
    private Date tanggalMasuk;
    // private int total;

    // construcktor Barang Masuk
    objBarangMasuk(int noBarangMasuk, objBarang barang, objSupplier supplier, int jumlah, Date tanggalMasuk) {
        this.noBarangMasuk = noBarangMasuk;
        this.barang = barang;
        this.supplier = supplier;
        this.jumlah += jumlah;
        this.tanggalMasuk = tanggalMasuk;
    }

    public objBarangMasuk() {
    }

    // Method get dan set barang masuk
    public int getBarangMasuk() {
        return noBarangMasuk;
    }

    public void setBarangMasuk(int noBarangMasuk) {
        this.noBarangMasuk = noBarangMasuk;
    }

    // method set dan get barang
    public objBarang getBarang() {
        return barang;
    }

    public void setBarang(objBarang barang) {
        this.barang = barang;
    }

    // method set dan get supplier
    public objSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(objSupplier supplier) {
        this.supplier = supplier;
    }

    // method set dan get jumlah
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    // method set tangal masuk
    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }
}
