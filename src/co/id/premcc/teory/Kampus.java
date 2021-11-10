package co.id.premcc.teory;

public class Kampus implements LibraryMethod {

    private String namaKampus;
    private String alamatKampus;

    public Kampus(String namaKampus) {
        this.namaKampus = namaKampus;
    }

    public String getNamaKampus() {
        return namaKampus;
    }

    public void setNamaKampus(String namaKampus) {
        this.namaKampus = namaKampus;
    }

    public String getAlamatKampus() {
        return alamatKampus;
    }

    public void setAlamatKampus(String alamatKampus) {
        this.alamatKampus = alamatKampus;
    }

    @Override
    public void showKampus(String namaKampus) {
        System.out.println("Nama\t: " + namaKampus);
    }
}
