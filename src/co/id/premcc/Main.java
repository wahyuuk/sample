package co.id.premcc;

public class Main {

    public static void main(String[] args) {
//        Mahasiswa jaki = new Mahasiswa();
//        jaki.nama = "Jaki";
//
//        jaki.setNama("Jaki");
//        System.out.println("Nama:" + jaki.getNama());

//        Mahasiswa cakra = new Mahasiswa("Cakra");
//
//        jaki.showMahasiswa();
//        cakra.showMahasiswa();


//        Mahasiswa jaki = new Mahasiswa("Universitas ABC", "Jaki");


        //Case Crud
        MahasiswaService service = new MahasiswaService();
        Mahasiswa mhs1 = new Mahasiswa("123", "Cakra", "Jakarta");
        Mahasiswa mhs2 = new Mahasiswa("132", "Jaki", "Jogja");

        service.createMahasiswa(mhs1);
        service.showMahasiswa();
        service.createMahasiswa(mhs2);
        service.showMahasiswa();

    }
}