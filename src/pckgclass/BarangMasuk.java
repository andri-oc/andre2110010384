package pckgclass;

import java.util.Date;
import java.util.function.Supplier;

class BarangMasuk {
    private int noBarangMasuk;
    private objBarang barang;
    private Supplier supplier;
    private int jumlah;
    private Date tanggalMasuk;
    // private int total;

    // construcktor Barang Masuk
    BarangMasuk(int noBarangMasuk, objBarang barang, Supplier supplier, int jumlah, Date tanggalMasuk) {
        this.noBarangMasuk = noBarangMasuk;
        this.barang = barang;
        this.supplier = supplier;
        this.jumlah = jumlah;
        this.tanggalMasuk = tanggalMasuk;
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
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
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
