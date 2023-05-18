package pckgclass;

import java.util.Date;

public class BarangKeluar {
    private int barangKeluarId;
    private objBarang barang;
    private int jumlah;
    private Date tanggalKeluar;

    BarangKeluar(int barangKeluarId, objBarang barang, int jumlah, Date tanggalKeluar) {
        this.barangKeluarId = barangKeluarId;
        this.barang = barang;
        this.jumlah = jumlah;
        this.tanggalKeluar = tanggalKeluar;
    }

    public int getBarangKeluarId() {
        return barangKeluarId;
    }

    public void setBarangKeluarId(int barangKeluarId) {
        this.barangKeluarId = barangKeluarId;
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
