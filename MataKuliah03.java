public class MataKuliah03 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah03() {
    }

    public MataKuliah03(String mk, String nm, int sks, int jumlahJam) {
        kodeMK = mk;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    void tampilkanInformasi(){
    System.out.println("KodeMK: " + kodeMK);
    System.out.println("Nama: " + nama);
    System.out.println("sks: " + sks);
    System.out.println("jumlah jam: " + jumlahJam);
    }

    void ubahsks(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah.");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
        System.out.println("Pengurangan tidak dapat dilakukan");
    } else {
        jumlahJam -= jam;
    }
}
}

