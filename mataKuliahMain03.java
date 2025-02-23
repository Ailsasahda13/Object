public class mataKuliahMain03 {
    
    public static void main(String[] args) {
        
        MataKuliah03 mk1 = new MataKuliah03();
        mk1.kodeMK = "SCH123";
        mk1.nama = "Basis Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
    
        mk1.tambahJam(8);
        mk1.kurangiJam(4);
        mk1.tampilkanInformasi();
        mk1.ubahsks(5);

        MataKuliah03 mk2 = new MataKuliah03("ABC123", "Algoritma dan Struktur Data", 7, 5);
        mk2.tampilkanInformasi();
    }
}
