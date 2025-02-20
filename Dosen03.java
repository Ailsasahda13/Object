public class Dosen03 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen03() {
    }

    public Dosen03(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi(){
    System.out.println("Nama: " + nama);
    System.out.println("id dosen: " + idDosen);
    System.out.println("status aktif: " + statusAktif);
    System.out.println("tahun bergabung: " + tahunBergabung);
    System.out.println("bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (status == true) {
            System.out.println("Dosen aktif");
        } else if (status == false) {
            System.out.println("Dosen tidak aktif");
        }
    }
    
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}



