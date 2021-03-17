import java.util.Scanner;

public class TugasKelompokSatuNomorSatu {
    public void SoalNomorSatu(){
        Scanner input = new Scanner(System.in);

        // menerima inputan untuk angka pertama
        System.out.print("Masukkan Angka Pertama : ");
        double angka_pertama = input.nextDouble();

        // menerima inputan untuk angka kedua
        System.out.print("Masukkan Angka Kedua : ");
        double angka_kedua = input.nextDouble();

        // penghitungan arimatika
        double hasil_penjumlahan = angka_pertama + angka_kedua;
        double hasil_pengurangan = angka_pertama - angka_kedua;
        double hasil_perkalian = angka_pertama * angka_kedua;
        double hasil_pembagian = angka_pertama / angka_kedua;
        double hasil_modulus = angka_pertama % angka_kedua;

        // Hasil dari penghitungan untuk ditampilkan ke console
        System.out.println("Hasil dari penjumlahan " + angka_pertama + " dan " + angka_kedua + " adalah = " + hasil_penjumlahan);
        System.out.println("Hasil dari pengurangan " + angka_pertama + " dan " + angka_kedua + " adalah = " + hasil_pengurangan);
        System.out.println("Hasil dari perkalian " + angka_pertama + " dan " + angka_kedua + " adalah = " + hasil_perkalian);
        System.out.println("Hasil dari pembagian " + angka_pertama + " dan " + angka_kedua + " adalah = " + hasil_pembagian);
        System.out.println("Hasil dari modulus " + angka_pertama + " dan " + angka_kedua + " adalah = " + hasil_modulus);
    }
}
