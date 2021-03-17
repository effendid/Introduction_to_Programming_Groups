import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TugasKelompokSatuNomorTiga {
    public void SoalNomorTiga(){
        Scanner input = new Scanner(System.in);

        // menerima inputan
        System.out.print("Masukkan luas tanah : ");
        int luas = input.nextInt();

        // biaya adalah total biaya yang harus dibayarkan
        double biaya, temp;

        // 50m dikenakan biaya 50.000.000 maka per-meter 1.000.000 (50000000 / 50)
        if (luas <= 50){
            biaya = luas * 1000000;
        } else {
            // variabel temp digunakan untuk menyimpan luas tanah yang akan dikalikan dengan biaya yang sudah ditentukan
            temp = luas - 50;
            biaya = (50 * 1000000) + (temp * 1500000);
        }

        // locale digunakan untuk set localization atau geografi sebuah negara
        Locale idn_local = new Locale("in", "ID");

        // numberformat digunakan untuk memformat angka sesuai dengan lokasi yang sudah ditentukan sebelumnya.
        NumberFormat IDR = NumberFormat.getCurrencyInstance(idn_local);

        // tampilkan hasil
        System.out.println("Total harga untuk tanah seluas " + luas + "meter persegi adalah = " + IDR.format(biaya));

    }
}
