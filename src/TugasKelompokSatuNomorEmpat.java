import java.util.Scanner;

public class TugasKelompokSatuNomorEmpat {
    public void SoalNomorEmpat() {

        Scanner input = new Scanner(System.in);

        int nilai_tp_pertama, nilai_tp_kedua, nilai_tk_pertama, nilai_tk_kedua, nilai_kuis_pertama, nilai_kuis_kedua, nilai_uas;
        float nilai_akhir;
        String grade = "";

        //menerima inputan
        System.out.print("Masukkan nilai tugas personal ke-1 : ");
        nilai_tp_pertama = input.nextInt();
        System.out.print("Masukkan nilai tugas personal ke-2 : ");
        nilai_tp_kedua = input.nextInt();
        System.out.print("Masukkan nilai tugas kelompok ke-1 : ");
        nilai_tk_pertama = input.nextInt();
        System.out.print("Masukkan nilai tugas kelompok ke-2 : ");
        nilai_tk_kedua = input.nextInt();
        System.out.print("Masukkan nilai tugas kuis ke-1 : ");
        nilai_kuis_pertama = input.nextInt();
        System.out.print("Masukkan nilai tugas kuis ke-2 : ");
        nilai_kuis_kedua = input.nextInt();
        System.out.print("Masukkan nilai ujian akhir : ");
        nilai_uas = input.nextInt();

        /*
         * proses penghitungan nilai_akhir
         * Nilai akhir = 15%TP1 + 15%TP2 + 10%TK1 + 10%TK2 + 10% kuis 1+ 10% kuis 2 + 30% UAS
         *
         * casting nilai dari integer ke float
         * */
        nilai_akhir = (float) ((0.15 * nilai_tp_pertama) + (0.15 * nilai_tp_kedua)
                + (0.1 * nilai_tk_pertama) + (0.1 * nilai_tk_kedua)
                + (0.1 * nilai_kuis_pertama) + (0.1 * nilai_kuis_kedua)
                + (0.3 * nilai_uas));

        // penentuan grade
        /*
         Nilai akhir >= 85 , grade A
         Nilai akhir dari 75 sampai dengan 84, grade B
         Nilai akhir dari 65 sampai dengan 74, grade C
         Nilai akhir dari 50 sampai dengan 64, maka grade D
         Nilai akhir kurang dari 50 maka grade F
         */
        if (nilai_akhir >= 85) {
            grade = "A";
        } else if (nilai_akhir >= 75) {
            grade = "B";
        } else if (nilai_akhir >= 65) {
            grade = "C";
        } else if (nilai_akhir >= 50) {
            grade = "D";
        } else if (nilai_akhir < 50) {
            grade = "F";
        }

        // tampilkan nilai akhir dang grade
        System.out.println("Nilai akhir = " + nilai_akhir + " dengan Grade '" + grade + "'");
    }
}
