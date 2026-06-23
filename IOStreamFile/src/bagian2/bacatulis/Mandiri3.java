package bagian2.bacatulis;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mandiri3 {

    public static void main(String[] args) {

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            String baris;
            int nomor = 1;
            int jumlahBaris = 0;

            while ((baris = pembaca.readLine()) != null) {

                System.out.println(nomor + ". " + baris);

                nomor++;
                jumlahBaris++;
            }

            System.out.println("Jumlah baris = " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}