package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Mandiri1 {

    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {

            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");

            System.out.println("Data hari berhasil ditulis ke hari.txt");

        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }
    }
}
