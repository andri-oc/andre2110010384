package pckgclass;

public class objSupplier {
    private int kodeSupplier;
    private String namaSupplier;
    private String alamatSupplier;

    // constructor
    objSupplier(int kodeSupplier, String namaSupplier, String alamatSupplier) {
        this.kodeSupplier = kodeSupplier;
        this.namaSupplier = namaSupplier;
        this.alamatSupplier = alamatSupplier;
    }

    public objSupplier() {
    }

    // method get dan set kode suplier
    public int getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(int kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    // method get dan set nama supplier
    public String getNamaSuplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    // method get dan set alamat supplier
    public String GetAlamatSupplier() {
        return alamatSupplier;
    }

    public void setAlamatSupplier(String alamatSupplier) {
        this.alamatSupplier = alamatSupplier;
    }
}
