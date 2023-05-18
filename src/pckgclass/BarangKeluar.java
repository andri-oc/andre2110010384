package pckgclass;

import java.util.Date;

public class BarangKeluar {
    private int kodeBarangKeluar;
    private objBarang barang;
    private int jumlah;
    private Date tanggalKeluar;

    BarangKeluar(int kodeBarangKeluar, objBarang barang, int jumlah, Date tanggalKeluar) {
        this.kodeBarangKeluar = kodeBarangKeluar;
        this.barang = barang;
        this.jumlah += jumlah;
        this.tanggalKeluar = tanggalKeluar;
    }

    public BarangKeluar() {
    }

    public int getKodeBarangKeluar() {
        return kodeBarangKeluar;
    }

    public void setKodeBarangKeluar(int kodeBarangKeluar) {
        this.kodeBarangKeluar = kodeBarangKeluar;
    }

    public objBarang getBarang() {
        return barang;
    }

    public void setBarang(objBarang barang) {
        this.barang = barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(Date tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }
}
