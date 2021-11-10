package co.id.premcc;

import java.util.ArrayList;
import java.util.List;

public abstract class CreateReadDeleteImpl implements CreateReadDelete {

    protected List<Mahasiswa> mahasiswa = new ArrayList<>();

    @Override
    public void showMahasiswa() {
        for (Mahasiswa mhs : this.mahasiswa) {
            System.out.println("Nama\t: " + mhs.getNama());
        }
    }

    @Override
    public void createMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa created");
    }

    @Override
    public void deleteMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa.remove(mahasiswa);
        System.out.println("Mahasiswa deleted");
    }
}
