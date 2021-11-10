package co.id.premcc.teory;

public class Mahasiswa extends LibraryMethodImplement {

    private String nama;
    private String nim;
    private String jurusan;
    private Integer sks;

    public Mahasiswa(String namaKampus, String nama) {
//        super(namaKampus);
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    void showKampus(String namaKampus) {

    }
}
