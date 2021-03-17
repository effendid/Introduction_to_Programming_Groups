import java.util.Scanner;

public class TugasKelompokSatuMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("======== Soal Nomor Satu ========");
        TugasKelompokSatuNomorSatu nomorSatu = new TugasKelompokSatuNomorSatu();
        nomorSatu.SoalNomorSatu();
        System.out.println("Tekan tombol 'Enter' untuk melanjutkan");
        s.nextLine();

        System.out.println("======== Soal Nomor Dua ========");
        TugasKelompokSatuNomorDua nomorDua = new TugasKelompokSatuNomorDua();
        nomorDua.SoalNomorDua();
        System.out.println("Tekan tombol 'Enter' untuk melanjutkan");
        s.nextLine();

        System.out.println("======== Soal Nomor Tiga ========");
        TugasKelompokSatuNomorTiga nomortiga = new TugasKelompokSatuNomorTiga();
        nomortiga.SoalNomorTiga();
        System.out.println("Tekan tombol 'Enter' untuk melanjutkan");
        s.nextLine();

        System.out.println("======== Soal Nomor Empat ========");
        TugasKelompokSatuNomorEmpat nomorEmpat = new TugasKelompokSatuNomorEmpat();
        nomorEmpat.SoalNomorEmpat();
    }
}
