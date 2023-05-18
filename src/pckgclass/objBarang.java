package pckgclass;

public class objBarang {
    private int kodeBarang;
    private String namaBarang;
    private double harga;

    // constructor
    objBarang(int kodeBarang, String namaBarang, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public objBarang() {
    }

    // method get dan set kode barang
    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    // method get dan set nama barang

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    // method get dan set harga

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

}
