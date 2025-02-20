public class DosenMain03 {
    
    public static void main(String[] args) {
        
        Dosen03 dsn1 = new Dosen03();
        dsn1.idDosen = "CT345";
        dsn1.nama = "Tiara Wijaya";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2023;
        dsn1.bidangKeahlian = "IT Computer";

        dsn1.setStatusAktif(false);
        dsn1.hitungMasaKerja(2024);
        dsn1.ubahKeahlian("Data analyst");
        dsn1.tampilkanInformasi();

        Dosen03 dsn2 = new Dosen03("AB123", "Susan Ayara", false, 2014, "Sistem Analis");
        dsn2.tampilkanInformasi();
    }
}
