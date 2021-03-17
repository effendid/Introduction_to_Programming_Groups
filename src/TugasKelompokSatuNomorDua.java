import java.util.Scanner;

public class TugasKelompokSatuNomorDua {
    public void SoalNomorDua(){
        Scanner input = new Scanner(System.in);

        // menerima inputan untuk angka pertama
        System.out.print("Masukkan Angka Pertama : ");
        double angka_pertama = input.nextDouble();

        // menerima inputan untuk angka kedua
        System.out.print("Masukkan Angka Kedua : ");
        double angka_kedua = input.nextDouble();

        // menerima inputan untuk angka ketiga
        System.out.print("Masukkan Angka Ketiga : ");
        double angka_ketiga = input.nextDouble();

        // penghitungan untuk penjumlahan logaritma basis 10 dari ketiga bilangan
        double log_basis_sepuluh;
        log_basis_sepuluh = Math.log10(angka_pertama) + Math.log10(angka_kedua) + Math.log10(angka_ketiga);

        // proses penghitungan untuk trigonometri
        double hasil_trigonometri;
        hasil_trigonometri = Math.cos(angka_pertama) - Math.sin(angka_pertama) - Math.tan(angka_ketiga);

        // tampilkan hasil penjumlahan logaritma basis 10 dari ketiga bilangan
        System.out.println("Hasil penjumlahan logaritma basis 10 dari ketiga bilangan = " + log_basis_sepuluh);

        // tampilkan hasil penjumlahan logaritma basis 10 dari ketiga bilangan
        System.out.println("Hasil cos(" + angka_pertama + ") - sin(" + angka_kedua + ") - tan(" + angka_ketiga + ") adalah = " + hasil_trigonometri);
    }
}
